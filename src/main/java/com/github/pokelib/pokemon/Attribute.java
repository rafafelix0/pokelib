package com.github.pokelib.pokemon;

import com.github.pokelib.exceptions.InvalidStageChangeException;

import java.util.Map;
import java.util.Random;

/**
 * This class represents a pokemon attribute, which could be HP, Attack, Defense, Sp.Attack, Sp.Defense or Speed
 * It contains manipulations to this attributes.
 */
public class Attribute {
    private static final int MAX_IV = 31;
    protected int base;
    protected int iv;
    protected int ev = 0;
    protected AttributeType type;
    protected int stage = 0;
    private Map<Integer, Double> stageMultiplier = Map.ofEntries(
            Map.entry(-6, 0.25),
            Map.entry(-5, 0.28),
            Map.entry(-4, 0.33),
            Map.entry(-3, 0.4),
            Map.entry(-2, 0.5),
            Map.entry(-1, 0.66),
            Map.entry(0, 1.0),
            Map.entry(1, 1.5),
            Map.entry(2, 2.0),
            Map.entry(3, 2.5),
            Map.entry(4, 3.0),
            Map.entry(5, 3.5),
            Map.entry(6, 4.0)
    );

    /**
     * Create a new attribute with a random IV
     *
     * @param type - identification of the attribute
     * @param base - base value of the attribute by the pokemon
     */
    public Attribute(AttributeType type, int base) {
        this(type, base, new Random().nextInt(MAX_IV));
    }

    /**
     * Create a new attribute with fixed IV
     * @param type - identification of the attribute
     * @param base - base value of the attribute by the pokemon
     * @param iv - value between 0 and 31
     */
    public Attribute(AttributeType type, int base, int iv) {
        if (iv > MAX_IV || iv < 0) {
            throw new IllegalArgumentException("IV must be between 0 and 31");
        }

        this.type = type;
        this.base = base;
        this.iv = iv;
    }

    public int getIv() {
        return iv;
    }

    public void setIv(int iv) {
        this.iv = iv;
    }

    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    /**
     * Returns the attribute value used for battle calculation
     * This value is influenced by lowering or raising a status by moves, items or abilities.
     *
     * @param nature - Pokemon nature might influence the value of the attribute
     * @param level - level of the pokemon
     *
     * @return the integer that represents the value, decimals are truncated
     */
    public int getValue(Nature nature, int level) {
        double multiplier = nature.getPositive() == type ? 1.1 : nature.getNegative() == type ? 0.9 : 1.0;
        return (int) ((((((2 * base + iv + (ev / 4)) * level) / 100) + 5) * multiplier) * getModifierMultiplier());
    }

    /**
     * In battle, some moves might change an attribute value, like Dragon Dance or Growl.
     * This multiplier represents this change that is applied to the attribute value.
     *
     * @see #lowers(int)
     * @see #raises(int)
     *
     * @return multiplier
     */
    private double getModifierMultiplier() {
        return stageMultiplier.get(this.stage);
    }

    /**
     * Lower the attribute by stage (max 6)
     *
     * @param stage - number of stage that the attribute is reduced
     */
    public void lowers(int stage) {
        if(stage > 6 || stage < 1) {
            throw new IllegalArgumentException("stage must be between 1 and 6");
        }

        if (this.stage == -6) {
            throw new InvalidStageChangeException(type.name() + " won't go lower");
        }

        this.stage -= stage;
        if (this.stage < -6) {
            this.stage = -6;
        }
    }

    /**
     * Raises the attribute by stage (max 6)
     *
     * @param stage - number of stage that the attribute is raised
     */
    public void raises(int stage) {
        if(stage > 6 || stage < 1) {
            throw new IllegalArgumentException("stage must be between 1 and 6");
        }

        if (this.stage == 6) {
            throw new InvalidStageChangeException(type.name() + " won't go any higher");
        }

        this.stage += stage;
        if (this.stage > 6) {
            this.stage = 6;
        }
    }
}
