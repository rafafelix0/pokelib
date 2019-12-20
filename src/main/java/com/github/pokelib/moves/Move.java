package com.github.pokelib.moves;

import com.github.pokelib.pokemon.Pokemon;
import com.github.pokelib.types.Type;

public abstract class Move {
    private String name;
    private Type type;
    private Category category;
    private Integer basePower;
    private int accuracy;
    private int basePP;

    public Move(String name, Type type, Category category, Integer basePower, int accuracy, int basePP) {
        this.name = name;
        this.type = type;
        this.category = category;
        this.basePower = basePower;
        this.accuracy = accuracy;
        this.basePP = basePP;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Category getCategory() {
        return category;
    }

    public Integer getBasePower() {
        return basePower;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getBasePP() {
        return basePP;
    }

    public abstract void effect(Pokemon attacker, Pokemon defender);
}
