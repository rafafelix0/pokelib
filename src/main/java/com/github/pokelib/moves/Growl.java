package com.github.pokelib.moves;

import com.github.pokelib.pokemon.Pokemon;
import com.github.pokelib.types.Type;

public class Growl extends Move {
    public Growl() {
        super("Growl", Type.NORMAL, Category.STATUS, null, 100, 40);
    }

    @Override
    public void effect(Pokemon attacker, Pokemon defender) {

    }
}
