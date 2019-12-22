package com.github.pokelib.moves;

import static org.junit.jupiter.api.Assertions.*;

import com.github.pokelib.pokemon.Grookey;
import com.github.pokelib.pokemon.Scorbunny;
import org.junit.jupiter.api.Test;

public class GrowlTests {
    @Test
    void reducesTheDefendantAttackByOneStage() {
        Scorbunny attacker = new Scorbunny();
        Grookey defender = new Grookey();
        int expected = (int) (defender.getAttack() * 0.66);
        Growl growl = new Growl();
        growl.effect(attacker, defender);

        assertEquals(expected, defender.getAttack());
    }
}
