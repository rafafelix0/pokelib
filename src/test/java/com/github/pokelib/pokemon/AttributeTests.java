package com.github.pokelib.pokemon;

import static org.junit.jupiter.api.Assertions.*;

import com.github.pokelib.exceptions.InvalidStageChangeException;
import org.junit.jupiter.api.Test;

public class AttributeTests {
    @Test
    void doNotAllowIvGreaterThan31() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Attribute(AttributeType.HP, 100, 32);
        });
        assertEquals("IV must be between 0 and 31", exception.getMessage());
    }

    @Test
    void doNotAllowIvLessThanZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Attribute(AttributeType.HP, 100, -1);
        });
        assertEquals("IV must be between 0 and 31", exception.getMessage());
    }

    @Test
    void allowIvEqualZero() {
        assertDoesNotThrow(() -> {
            new Attribute(AttributeType.HP, 100, 0);
        });
    }

    @Test
    void allowIvEqual31() {
        assertDoesNotThrow(() -> {
            new Attribute(AttributeType.HP, 100, 31);
        });
    }

    @Test
    void calculateRawValueForNeutralNature() {
        Attribute neutral = new Attribute(AttributeType.ATTACK, 100, 31);
        assertEquals(236, neutral.getValue(Nature.BASHFUL, 100));
    }

    @Test
    void increasesTenPercentWithPositiveNature() {
        Attribute positive = new Attribute(AttributeType.ATTACK, 100, 31);
        assertEquals(259, positive.getValue(Nature.ADAMANT, 100));
    }

    @Test
    void decreasesTenPercentWithPositiveNature() {
        Attribute positive = new Attribute(AttributeType.ATTACK, 100, 31);
        assertEquals(212, positive.getValue(Nature.BOLD, 100));
    }

    @Test
    void increasesTheValueWithMaxEv() {
        Attribute attribute = new Attribute(AttributeType.ATTACK, 100, 31);
        attribute.setEv(252);
        assertEquals(328, attribute.getValue(Nature.ADAMANT, 100));
    }

    @Test
    void cannotLowerAnAttributeMoreThanSixStages() {
        Attribute attribute = new Attribute(AttributeType.ATTACK, 100, 31);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            attribute.lowers(7);
        });
        assertEquals("stage must be between 1 and 6", exception.getMessage());
    }

    @Test
    void cannotLowerAnAttributeLessThanZeroStages() {
        Attribute attribute = new Attribute(AttributeType.ATTACK, 100, 31);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            attribute.lowers(0);
        });
        assertEquals("stage must be between 1 and 6", exception.getMessage());
    }

    @Test
    void lowersTheAttributeValue() {
        Attribute attribute = new Attribute(AttributeType.ATTACK, 100, 31);
        attribute.lowers(2);
        assertEquals(118, attribute.getValue(Nature.BASHFUL, 100));
    }

    @Test
    void cannotLowerMoreThanSixStages() {
        Attribute attribute = new Attribute(AttributeType.ATTACK, 100, 31);
        attribute.lowers(3);
        attribute.lowers(6);
        assertEquals(59, attribute.getValue(Nature.BASHFUL, 100));
    }

    @Test
    void raisesErrorWhenLoweringMoreThanSixStages() {
        Attribute attribute = new Attribute(AttributeType.ATTACK, 100, 31);
        attribute.lowers(6);
        Exception exception = assertThrows(InvalidStageChangeException.class, () -> {
            attribute.lowers(1);
        });
        assertEquals(59, attribute.getValue(Nature.BASHFUL, 100));
        assertEquals("ATTACK won't go lower", exception.getMessage());
    }

    @Test
    void cannotRaiseAnAttributeMoreThanSixStages() {
        Attribute attribute = new Attribute(AttributeType.ATTACK, 100, 31);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            attribute.raises(7);
        });
        assertEquals("stage must be between 1 and 6", exception.getMessage());
    }

    @Test
    void cannotRaiseAnAttributeByZeroStages() {
        Attribute attribute = new Attribute(AttributeType.ATTACK, 100, 31);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            attribute.raises(0);
        });
        assertEquals("stage must be between 1 and 6", exception.getMessage());
    }

    @Test
    void raisesTheAttributeValue() {
        Attribute attribute = new Attribute(AttributeType.ATTACK, 100, 31);
        attribute.raises(2);
        assertEquals(472, attribute.getValue(Nature.BASHFUL, 100));
    }

    @Test
    void cannotRaiseMoreThanSixStages() {
        Attribute attribute = new Attribute(AttributeType.ATTACK, 100, 31);
        attribute.raises(3);
        attribute.raises(6);
        assertEquals(944, attribute.getValue(Nature.BASHFUL, 100));
    }

    @Test
    void raisesErrorWhenRaisingMoreThanSixStages() {
        Attribute attribute = new Attribute(AttributeType.ATTACK, 100, 31);
        attribute.raises(6);
        Exception exception = assertThrows(InvalidStageChangeException.class, () -> {
            attribute.raises(1);
        });
        assertEquals(944, attribute.getValue(Nature.BASHFUL, 100));
        assertEquals("ATTACK won't go any higher", exception.getMessage());
    }
}
