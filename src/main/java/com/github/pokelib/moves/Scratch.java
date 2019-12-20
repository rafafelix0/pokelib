package com.github.pokelib.moves;

import com.github.pokelib.pokemon.Pokemon;
import com.github.pokelib.types.Type;

public class Scratch extends Move {
    public Scratch() {
        super("Scratch", Type.NORMAL, Category.PHYSICAL, 40, 100, 35);
    }

    @Override
    public void effect(Pokemon attacker, Pokemon defender) { }
}
