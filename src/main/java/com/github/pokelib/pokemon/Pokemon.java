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

    private Attribute hp;
    private int currentHp;
    private Attribute attack;
    private Attribute defense;
    private Attribute spAttack;
    private Attribute spDefense;
    private Attribute speed;

    private Type type1;
    private Type type2;

    public Pokemon(String name, int level, int hpBase, int attackBase, int defenseBase, int spAttackBase, int spDefenseBase, int speedBase, Type type1, Type type2) {
        this.name = name;
        this.level = level;
        this.type1 = type1;
        this.type2 = type2;
        this.hp = new HpAttribute(hpBase);
        this.attack = new Attribute(AttributeType.ATTACK, attackBase);
        this.defense = new Attribute(AttributeType.DEFENSE, defenseBase);
        this.spAttack = new Attribute(AttributeType.SP_ATTACK, spAttackBase);
        this.spDefense = new Attribute(AttributeType.SP_DEFENSE, spDefenseBase);
        this.speed = new Attribute(AttributeType.SPEED, speedBase);
        int natureIndex = new Random().nextInt(Nature.values().length);
        this.nature = Nature.values()[natureIndex];
        this.currentHp = getHp();
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

    public int getHp() {
        return hp.getValue(nature, level);
    }

    public int getAttack() {
        return attack.getValue(nature, level);
    }

    public void lowersAttack(int stages) { attack.lowers(stages); }

    public void raisesAttack(int stages) { attack.raises(stages); }

    public int getDefense() {
        return defense.getValue(nature, level);
    }

    public void lowersDefense(int stages) { defense.lowers(stages); }

    public void raisesDefense(int stages) { defense.raises(stages); }

    public int getSpAttack() {
        return spAttack.getValue(nature, level);
    }

    public void lowersSpAttack(int stages) { spAttack.lowers(stages); }

    public void raisesSpAttack(int stages) { spAttack.raises(stages); }

    public int getSpDefense() {
        return spDefense.getValue(nature, level);
    }

    public void lowersSpDefense(int stages) { spDefense.lowers(stages); }

    public void raisesSpDefense(int stages) { spDefense.raises(stages); }

    public int getSpeed() {
        return speed.getValue(nature, level);
    }

    public void lowersSpeed(int stages) { speed.lowers(stages); }

    public void raisesSpeed(int stages) { speed.raises(stages); }

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
