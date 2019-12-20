package com.github.pokelib;

import com.github.pokelib.moves.Move;
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
        System.out.println(pokemon1.getHp() + " | " + pokemon1.getAttack() + " | " + pokemon1.getDefense() + " | " + pokemon1.getSpAttack() + " | " + pokemon1.getSpDefense() + " | " + pokemon1.getSpeed());
        System.out.println("");
        System.out.println("Player2: " + pokemon2.getName() + " | " + pokemon2.getNature());
        System.out.println(pokemon2.getHp() + " | " + pokemon2.getAttack() + " | " + pokemon2.getDefense() + " | " + pokemon2.getSpAttack() + " | " + pokemon2.getSpDefense() + " | " + pokemon2.getSpeed());

        while(!pokemon1.isFainted() && !pokemon2.isFainted()) {
            Pokemon attacker = null;
            Pokemon defender = null;
            if (pokemon1.getSpeed() > pokemon2.getSpeed()) {
                System.out.println("Player1 attacks first");
                attacker = pokemon1;
                defender = pokemon2;
            } else if (pokemon2.getSpeed() > pokemon1.getSpeed()) {
                System.out.println("Player2 attacks first");
                attacker = pokemon2;
                defender = pokemon1;
            } else {
                if (new Random().nextInt(1) == 0) {
                    System.out.println("Player1 attacks first");
                    attacker = pokemon1;
                    defender = pokemon2;
                } else {
                    System.out.println("Player2 attacks first");
                    attacker = pokemon2;
                    defender = pokemon1;
                }
            }

            Move attack1 = attacker.getMoveSet().get(0);
            System.out.println(attacker.getName() + " will attack with " + attack1.getName());
            int damage1 = attack(attacker, defender, attack1);
            System.out.println("deals " + damage1);
            defender.damage(damage1);
            if (defender.isFainted()) {
                System.out.println(defender.getName() + " fainted [defender]");
                break;
            }

            Move attack2 = defender.getMoveSet().get(0);
            System.out.println(defender.getName() + " will attack with " + attack2.getName());
            int damage2 = attack(defender, attacker, attack2);
            System.out.println("deals " + damage2);
            attacker.damage(damage2);
            if (attacker.isFainted()) {
                System.out.println(attacker.getName() + " fainted [attacker]");
                break;
            }
        }

        if (pokemon1.isFainted()) {
            System.out.println("Player1 lost");
        } else if (pokemon2.isFainted()) {
            System.out.println("Player2 lost");
        }
    }

    public static int attack(Pokemon pokemon1, Pokemon pokemon2, Move attack) {
        // ONLY PHYSICAL CONSIDERED
        int baseDamage = (((((2 * pokemon1.getLevel()) / 5) + 2) * attack.getBasePower()) * (pokemon1.getAttack() / pokemon2.getDefense())) / 50 + 2;
        // TODO: check all modifiers (https://bulbapedia.bulbagarden.net/wiki/Damage)
        double modifier = (Math.random() * (1.0 - 0.85)) + 0.85;

        return (int) (baseDamage * modifier);
    }
}
