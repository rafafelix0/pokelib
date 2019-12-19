package com.github.pokelib;

import com.github.pokelib.pokemon.Grookey;
import com.github.pokelib.pokemon.Pokemon;
import com.github.pokelib.pokemon.Scorbunny;
import com.github.pokelib.pokemon.Sobble;

import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String... args) {
        List<Pokemon> player1 = List.of(new Scorbunny(), new Grookey(), new Sobble());
        List<Pokemon> player2 = List.of(new Scorbunny(), new Grookey(), new Sobble());

        Pokemon pokemon1 = player1.get(new Random().nextInt(player1.size()));
        Pokemon pokemon2 = player2.get(new Random().nextInt(player2.size()));
        System.out.println("Player1: " + pokemon1.getName() + " | " + pokemon1.getNature());
        System.out.println(pokemon1.getHpScore() + " | " + pokemon1.getAttackScore() + " | " + pokemon1.getDefenseScore() + " | " + pokemon1.getSpAttackScore() + " | " + pokemon1.getSpDefenseScore() + " | " + pokemon1.getSpeedScore());
        System.out.println("");
        System.out.println("Player2: " + pokemon2.getName() + " | " + pokemon2.getNature());
        System.out.println(pokemon2.getHpScore() + " | " + pokemon2.getAttackScore() + " | " + pokemon2.getDefenseScore() + " | " + pokemon2.getSpAttackScore() + " | " + pokemon2.getSpDefenseScore() + " | " + pokemon2.getSpeedScore());
    }
}
