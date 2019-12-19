package com.github.pokelib.types;

import java.util.Map;

public enum Type {
    BUG,
    DARK,
    DRAGON,
    ELECTRIC,
    FAIRY,
    FIGHT,
    FIRE,
    FLYING,
    GHOST,
    GRASS,
    GROUND,
    ICE,
    NORMAL,
    POISON,
    PSYCHIC,
    ROCK,
    STEEL,
    WATER;

    static {
        NORMAL.multipliers = Map.ofEntries(Map.entry(NORMAL, 1.0),
                Map.entry(FIGHT, 1.0),
                Map.entry(FLYING, 1.0),
                Map.entry(POISON, 1.0),
                Map.entry(GROUND, 1.0),
                Map.entry(ROCK, 0.5),
                Map.entry(BUG, 1.0),
                Map.entry(GHOST, 0.0),
                Map.entry(STEEL, 0.5),
                Map.entry(FIRE, 1.0),
                Map.entry(WATER, 1.0),
                Map.entry(GRASS, 1.0),
                Map.entry(ELECTRIC, 1.0),
                Map.entry(PSYCHIC, 1.0),
                Map.entry(ICE, 1.0),
                Map.entry(DRAGON, 1.0),
                Map.entry(DARK, 1.0),
                Map.entry(FAIRY, 1.0));

        FIGHT.multipliers = Map.ofEntries(Map.entry(NORMAL, 2.0),
                Map.entry(FIGHT, 1.0),
                Map.entry(FLYING, 0.5),
                Map.entry(POISON, 0.5),
                Map.entry(GROUND, 1.0),
                Map.entry(ROCK, 2.0),
                Map.entry(BUG, 0.5),
                Map.entry(GHOST, 0.0),
                Map.entry(STEEL, 2.0),
                Map.entry(FIRE, 1.0),
                Map.entry(WATER, 1.0),
                Map.entry(GRASS, 1.0),
                Map.entry(ELECTRIC, 1.0),
                Map.entry(PSYCHIC, 0.5),
                Map.entry(ICE, 2.0),
                Map.entry(DRAGON, 1.0),
                Map.entry(DARK, 2.0),
                Map.entry(FAIRY, 0.5));

        FLYING.multipliers = Map.ofEntries(Map.entry(NORMAL, 1.0),
                Map.entry(FIGHT, 2.0),
                Map.entry(FLYING, 1.0),
                Map.entry(POISON, 1.0),
                Map.entry(GROUND, 1.0),
                Map.entry(ROCK, 0.5),
                Map.entry(BUG, 2.0),
                Map.entry(GHOST, 1.0),
                Map.entry(STEEL, 0.5),
                Map.entry(FIRE, 1.0),
                Map.entry(WATER, 1.0),
                Map.entry(GRASS, 2.0),
                Map.entry(ELECTRIC, 0.5),
                Map.entry(PSYCHIC, 1.0),
                Map.entry(ICE, 1.0),
                Map.entry(DRAGON, 1.0),
                Map.entry(DARK, 1.0),
                Map.entry(FAIRY, 1.0));

        POISON.multipliers = Map.ofEntries(Map.entry(NORMAL, 1.0),
                Map.entry(FIGHT, 1.0),
                Map.entry(FLYING, 1.0),
                Map.entry(POISON, 0.5),
                Map.entry(GROUND, 0.5),
                Map.entry(ROCK, 0.5),
                Map.entry(BUG, 1.0),
                Map.entry(GHOST, 0.5),
                Map.entry(STEEL, 0.0),
                Map.entry(FIRE, 1.0),
                Map.entry(WATER, 1.0),
                Map.entry(GRASS, 2.0),
                Map.entry(ELECTRIC, 1.0),
                Map.entry(PSYCHIC, 1.0),
                Map.entry(ICE, 1.0),
                Map.entry(DRAGON, 1.0),
                Map.entry(DARK, 1.0),
                Map.entry(FAIRY, 2.0));

        GROUND.multipliers = Map.ofEntries(Map.entry(NORMAL, 1.0),
                Map.entry(FIGHT, 1.0),
                Map.entry(FLYING, 0.0),
                Map.entry(POISON, 2.0),
                Map.entry(GROUND, 1.0),
                Map.entry(ROCK, 2.0),
                Map.entry(BUG, 0.5),
                Map.entry(GHOST, 1.0),
                Map.entry(STEEL, 2.0),
                Map.entry(FIRE, 2.0),
                Map.entry(WATER, 1.0),
                Map.entry(GRASS, 0.5),
                Map.entry(ELECTRIC, 2.0),
                Map.entry(PSYCHIC, 1.0),
                Map.entry(ICE, 1.0),
                Map.entry(DRAGON, 1.0),
                Map.entry(DARK, 1.0),
                Map.entry(FAIRY, 1.0));

        ROCK.multipliers = Map.ofEntries(Map.entry(NORMAL, 1.0),
                Map.entry(FIGHT, 0.5),
                Map.entry(FLYING, 2.0),
                Map.entry(POISON, 1.0),
                Map.entry(GROUND, 0.5),
                Map.entry(ROCK, 1.0),
                Map.entry(BUG, 2.0),
                Map.entry(GHOST, 1.0),
                Map.entry(STEEL, 0.5),
                Map.entry(FIRE, 2.0),
                Map.entry(WATER, 1.0),
                Map.entry(GRASS, 1.0),
                Map.entry(ELECTRIC, 1.0),
                Map.entry(PSYCHIC, 1.0),
                Map.entry(ICE, 2.0),
                Map.entry(DRAGON, 1.0),
                Map.entry(DARK, 1.0),
                Map.entry(FAIRY, 1.0));

        BUG.multipliers = Map.ofEntries(Map.entry(NORMAL, 1.0),
                Map.entry(FIGHT, 0.5),
                Map.entry(FLYING, 0.5),
                Map.entry(POISON, 0.5),
                Map.entry(GROUND, 1.0),
                Map.entry(ROCK, 1.0),
                Map.entry(BUG, 1.0),
                Map.entry(GHOST, 0.5),
                Map.entry(STEEL, 0.5),
                Map.entry(FIRE, 0.5),
                Map.entry(WATER, 1.0),
                Map.entry(GRASS, 2.0),
                Map.entry(ELECTRIC, 1.0),
                Map.entry(PSYCHIC, 2.0),
                Map.entry(ICE, 1.0),
                Map.entry(DRAGON, 1.0),
                Map.entry(DARK, 2.0),
                Map.entry(FAIRY, 0.5));

        GHOST.multipliers = Map.ofEntries(Map.entry(NORMAL, 0.0),
                Map.entry(FIGHT, 1.0),
                Map.entry(FLYING, 1.0),
                Map.entry(POISON, 1.0),
                Map.entry(GROUND, 1.0),
                Map.entry(ROCK, 1.0),
                Map.entry(BUG, 1.0),
                Map.entry(GHOST, 2.0),
                Map.entry(STEEL, 1.0),
                Map.entry(FIRE, 1.0),
                Map.entry(WATER, 1.0),
                Map.entry(GRASS, 1.0),
                Map.entry(ELECTRIC, 1.0),
                Map.entry(PSYCHIC, 2.0),
                Map.entry(ICE, 1.0),
                Map.entry(DRAGON, 1.0),
                Map.entry(DARK, 0.5),
                Map.entry(FAIRY, 1.0));

        STEEL.multipliers = Map.ofEntries(Map.entry(NORMAL, 1.0),
                Map.entry(FIGHT, 1.0),
                Map.entry(FLYING, 1.0),
                Map.entry(POISON, 1.0),
                Map.entry(GROUND, 1.0),
                Map.entry(ROCK, 2.0),
                Map.entry(BUG, 1.0),
                Map.entry(GHOST, 1.0),
                Map.entry(STEEL, 0.5),
                Map.entry(FIRE, 0.5),
                Map.entry(WATER, 0.5),
                Map.entry(GRASS, 1.0),
                Map.entry(ELECTRIC, 0.5),
                Map.entry(PSYCHIC, 1.0),
                Map.entry(ICE, 2.0),
                Map.entry(DRAGON, 1.0),
                Map.entry(DARK, 1.0),
                Map.entry(FAIRY, 2.0));

        FIRE.multipliers = Map.ofEntries(Map.entry(NORMAL, 1.0),
                Map.entry(FIGHT, 1.0),
                Map.entry(FLYING, 1.0),
                Map.entry(POISON, 1.0),
                Map.entry(GROUND, 1.0),
                Map.entry(ROCK, 0.5),
                Map.entry(BUG, 2.0),
                Map.entry(GHOST, 1.0),
                Map.entry(STEEL, 2.0),
                Map.entry(FIRE, 0.5),
                Map.entry(WATER, 0.5),
                Map.entry(GRASS, 2.0),
                Map.entry(ELECTRIC, 1.0),
                Map.entry(PSYCHIC, 1.0),
                Map.entry(ICE, 2.0),
                Map.entry(DRAGON, 0.5),
                Map.entry(DARK, 1.0),
                Map.entry(FAIRY, 1.0));

        WATER.multipliers = Map.ofEntries(Map.entry(NORMAL, 1.0),
                Map.entry(FIGHT, 1.0),
                Map.entry(FLYING, 1.0),
                Map.entry(POISON, 1.0),
                Map.entry(GROUND, 2.0),
                Map.entry(ROCK, 2.0),
                Map.entry(BUG, 1.0),
                Map.entry(GHOST, 1.0),
                Map.entry(STEEL, 1.0),
                Map.entry(FIRE, 2.0),
                Map.entry(WATER, 0.5),
                Map.entry(GRASS, 0.5),
                Map.entry(ELECTRIC, 1.0),
                Map.entry(PSYCHIC, 1.0),
                Map.entry(ICE, 1.0),
                Map.entry(DRAGON, 0.5),
                Map.entry(DARK, 1.0),
                Map.entry(FAIRY, 1.0));

        GRASS.multipliers = Map.ofEntries(Map.entry(NORMAL, 1.0),
                Map.entry(FIGHT, 1.0),
                Map.entry(FLYING, 0.5),
                Map.entry(POISON, 0.5),
                Map.entry(GROUND, 2.0),
                Map.entry(ROCK, 2.0),
                Map.entry(BUG, 0.5),
                Map.entry(GHOST, 1.0),
                Map.entry(STEEL, 0.5),
                Map.entry(FIRE, 0.5),
                Map.entry(WATER, 2.0),
                Map.entry(GRASS, 0.5),
                Map.entry(ELECTRIC, 1.0),
                Map.entry(PSYCHIC, 1.0),
                Map.entry(ICE, 1.0),
                Map.entry(DRAGON, 0.5   ),
                Map.entry(DARK, 1.0),
                Map.entry(FAIRY, 1.0));

        ELECTRIC.multipliers = Map.ofEntries(Map.entry(NORMAL, 1.0),
                Map.entry(FIGHT, 1.0),
                Map.entry(FLYING, 2.0),
                Map.entry(POISON, 1.0),
                Map.entry(GROUND, 0.0),
                Map.entry(ROCK, 1.0),
                Map.entry(BUG, 1.0),
                Map.entry(GHOST, 1.0),
                Map.entry(STEEL, 1.0),
                Map.entry(FIRE, 1.0),
                Map.entry(WATER, 2.0),
                Map.entry(GRASS, 0.5),
                Map.entry(ELECTRIC, 0.5),
                Map.entry(PSYCHIC, 1.0),
                Map.entry(ICE, 1.0),
                Map.entry(DRAGON, 0.5),
                Map.entry(DARK, 1.0),
                Map.entry(FAIRY, 1.0));

        PSYCHIC.multipliers = Map.ofEntries(Map.entry(NORMAL, 1.0),
                Map.entry(FIGHT, 2.0),
                Map.entry(FLYING, 1.0),
                Map.entry(POISON, 2.0),
                Map.entry(GROUND, 1.0),
                Map.entry(ROCK, 1.0),
                Map.entry(BUG, 1.0),
                Map.entry(GHOST, 1.0),
                Map.entry(STEEL, 0.5),
                Map.entry(FIRE, 1.0),
                Map.entry(WATER, 1.0),
                Map.entry(GRASS, 1.0),
                Map.entry(ELECTRIC, 1.0),
                Map.entry(PSYCHIC, 0.5),
                Map.entry(ICE, 1.0),
                Map.entry(DRAGON, 1.0),
                Map.entry(DARK, 0.0),
                Map.entry(FAIRY, 1.0));

        ICE.multipliers = Map.ofEntries(Map.entry(NORMAL, 1.0),
                Map.entry(FIGHT, 1.0),
                Map.entry(FLYING, 2.0),
                Map.entry(POISON, 1.0),
                Map.entry(GROUND, 2.0),
                Map.entry(ROCK, 1.0),
                Map.entry(BUG, 1.0),
                Map.entry(GHOST, 1.0),
                Map.entry(STEEL, 0.5),
                Map.entry(FIRE, 0.5),
                Map.entry(WATER, 0.5),
                Map.entry(GRASS, 2.0),
                Map.entry(ELECTRIC, 1.0),
                Map.entry(PSYCHIC, 1.0),
                Map.entry(ICE, 0.5),
                Map.entry(DRAGON, 2.0),
                Map.entry(DARK, 1.0),
                Map.entry(FAIRY, 1.0));

        DRAGON.multipliers = Map.ofEntries(Map.entry(NORMAL, 1.0),
                Map.entry(FIGHT, 1.0),
                Map.entry(FLYING, 1.0),
                Map.entry(POISON, 1.0),
                Map.entry(GROUND, 1.0),
                Map.entry(ROCK, 1.0),
                Map.entry(BUG, 1.0),
                Map.entry(GHOST, 1.0),
                Map.entry(STEEL, 0.5),
                Map.entry(FIRE, 1.0),
                Map.entry(WATER, 1.0),
                Map.entry(GRASS, 1.0),
                Map.entry(ELECTRIC, 1.0),
                Map.entry(PSYCHIC, 1.0),
                Map.entry(ICE, 1.0),
                Map.entry(DRAGON, 2.0),
                Map.entry(DARK, 1.0),
                Map.entry(FAIRY, 0.0));

        DARK.multipliers = Map.ofEntries(Map.entry(NORMAL, 1.0),
                Map.entry(FIGHT, 0.5),
                Map.entry(FLYING, 1.0),
                Map.entry(POISON, 1.0),
                Map.entry(GROUND, 1.0),
                Map.entry(ROCK, 1.0),
                Map.entry(BUG, 1.0),
                Map.entry(GHOST, 2.0),
                Map.entry(STEEL, 1.0),
                Map.entry(FIRE, 1.0),
                Map.entry(WATER, 1.0),
                Map.entry(GRASS, 1.0),
                Map.entry(ELECTRIC, 1.0),
                Map.entry(PSYCHIC, 2.0),
                Map.entry(ICE, 1.0),
                Map.entry(DRAGON, 1.0),
                Map.entry(DARK, 0.5),
                Map.entry(FAIRY, 0.5));

        FAIRY.multipliers = Map.ofEntries(Map.entry(NORMAL, 1.0),
                Map.entry(FIGHT, 2.0),
                Map.entry(FLYING, 1.0),
                Map.entry(POISON, 0.5),
                Map.entry(GROUND, 1.0),
                Map.entry(ROCK, 1.0),
                Map.entry(BUG, 1.0),
                Map.entry(GHOST, 1.0),
                Map.entry(STEEL, 0.5),
                Map.entry(FIRE, 0.5),
                Map.entry(WATER, 1.0),
                Map.entry(GRASS, 1.0),
                Map.entry(ELECTRIC, 1.0),
                Map.entry(PSYCHIC, 1.0),
                Map.entry(ICE, 1.0),
                Map.entry(DRAGON, 2.0),
                Map.entry(DARK, 2.0),
                Map.entry(FAIRY, 1.0));
    }

    private Map<Type, Double> multipliers;

    public Map<Type, Double> getMultipliers() {
        return multipliers;
    }
}