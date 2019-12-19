package com.github.pokelib.pokemon;

import com.github.pokelib.moves.LearnMoveType;
import com.github.pokelib.moves.Move;
import com.github.pokelib.types.Type;

import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class Pokemon {
    private String name;
    private int level;
    private Nature nature;

    private int hpBase;
    private Attribute hp;
    private int currentHp;
    private int attackBase;
    private Attribute attack;
    private int defenseBase;
    private Attribute defense;
    private int spAttackBase;
    private Attribute spAttack;
    private int spDefenseBase;
    private Attribute spDefense;
    private int speedBase;
    private Attribute speed;

    private Type type1;
    private Type type2;

    public Pokemon(String name, int level, int hpBase, int attackBase, int defenseBase, int spAttackBase, int spDefenseBase, int speedBase, Type type1, Type type2) {
        this.name = name;
        this.level = level;
        this.hpBase = hpBase;
        this.attackBase = attackBase;
        this.defenseBase = defenseBase;
        this.spAttackBase = spAttackBase;
        this.spDefenseBase = spDefenseBase;
        this.speedBase = speedBase;
        this.type1 = type1;
        this.type2 = type2;
        this.hp = new Attribute();
        this.attack = new Attribute();
        this.defense = new Attribute();
        this.spAttack = new Attribute();
        this.spDefense = new Attribute();
        this.speed = new Attribute();
        int natureIndex = new Random().nextInt(Nature.values().length);
        this.nature = Nature.values()[natureIndex];
        this.currentHp = getHpScore();
    }

    public abstract Map<LearnMoveType, Map<Move, String>> getLearnSet();
    public abstract List<Move> getMoveSet();

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public Nature getNature() {
        return nature;
    }

    public Type getType1() {
        return type1;
    }

    public Type getType2() {
        return type2;
    }

    public int getHpScore() {
        return (((2 * hpBase + hp.getIv() + (hp.getEv() / 4)) * level) / 100) + level + 10;
    }

    public int getAttackScore() {
        double multiplier = nature.getPositive() == AttributeType.ATTACK ? 1.1 : nature.getNegative() == AttributeType.ATTACK ? 0.9 : 1.0;
        return (int) (((((2 * attackBase + attack.getIv() + (attack.getEv() / 4)) * level) / 100) + 5) * multiplier);
    }

    public int getDefenseScore() {
        double multiplier = nature.getPositive() == AttributeType.DEFENSE ? 1.1 : nature.getNegative() == AttributeType.DEFENSE ? 0.9 : 1.0;
        return (int) (((((2 * defenseBase + defense.getIv() + (defense.getEv() / 4)) * level) / 100) + 5) * multiplier);
    }

    public int getSpAttackScore() {
        double multiplier = nature.getPositive() == AttributeType.SP_ATTACK ? 1.1 : nature.getNegative() == AttributeType.SP_ATTACK ? 0.9 : 1.0;
        return (int) (((((2 * spAttackBase + spAttack.getIv() + (spAttack.getEv() / 4)) * level) / 100) + 5) * multiplier);
    }

    public int getSpDefenseScore() {
        double multiplier = nature.getPositive() == AttributeType.SP_DEFENSE ? 1.1 : nature.getNegative() == AttributeType.SP_DEFENSE ? 0.9 : 1.0;
        return (int) (((((2 * spDefenseBase + spDefense.getIv() + (spDefense.getEv() / 4)) * level) / 100) + 5) * multiplier);
    }

    public int getSpeedScore() {
        double multiplier = nature.getPositive() == AttributeType.SPEED ? 1.1 : nature.getNegative() == AttributeType.SPEED ? 0.9 : 1.0;
        return (int) (((((2 * speedBase + speed.getIv() + (speed.getEv() / 4)) * level) / 100) + 5) * multiplier);
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void damage(int damage) {
        currentHp -= damage;
    }

    public boolean isFainted() {
        return currentHp <= 0;
    }
}
