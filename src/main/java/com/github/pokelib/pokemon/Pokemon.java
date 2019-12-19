package com.github.pokelib.pokemon;

import com.github.pokelib.moves.LearnMoveType;
import com.github.pokelib.moves.Move;
import com.github.pokelib.types.Type;

import java.util.List;
import java.util.Map;

public abstract class Pokemon {
    private String name;

    private int hpBase;
    private Attribute hp;
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

    public Pokemon(String name, int hpBase, int attackBase, int defenseBase, int spAttackBase, int spDefenseBase, int speedBase, Type type1, Type type2) {
        this.name = name;
        this.hpBase = hpBase;
        this.attackBase = attackBase;
        this.defenseBase = defenseBase;
        this.spAttackBase = spAttackBase;
        this.spDefenseBase = spDefenseBase;
        this.speedBase = speedBase;
        this.type1 = type1;
        this.type2 = type2;
        this.attack = new Attribute();
        this.defense = new Attribute();
        this.spAttack = new Attribute();
        this.spDefense = new Attribute();
        this.speed = new Attribute();
    }

    public abstract Map<LearnMoveType, Map<Move, String>> getLearnSet();
    public abstract List<Move> getMoveSet();

    public int getHpScore() {
        return (hpBase * hp.getIv()) + hp.getEv();
    }

    public int getAttackScore() {
        return (attackBase * attack.getIv()) + attack.getEv();
    }

    public int getDefenseScore() {
        return (defenseBase * defense.getIv()) + defense.getEv();
    }

    public int getSpAttackScore() {
        return (spAttackBase * spAttack.getIv()) + spAttack.getEv();
    }

    public int getSpDefenseScore() {
        return (spDefenseBase * spDefense.getIv()) + spDefense.getEv();
    }

    public int getSpeedScore() {
        return (speedBase * speed.getIv()) + speed.getEv();
    }
}
