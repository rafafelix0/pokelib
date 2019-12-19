package com.github.pokelib.pokemon;

import java.util.Map;

public enum Nature {
    HARDY(null, null),
    LONELY(AttributeType.ATTACK, AttributeType.DEFENSE),
    BRAVE(AttributeType.ATTACK, AttributeType.SPEED),
    ADAMANT(AttributeType.ATTACK, AttributeType.SP_ATTACK),
    NAUGHTY(AttributeType.ATTACK, AttributeType.SP_DEFENSE),
    BOLD(AttributeType.DEFENSE, AttributeType.ATTACK),
    DOCILE(null, null),
    RELAXED(AttributeType.DEFENSE, AttributeType.SPEED),
    IMPISH(AttributeType.DEFENSE, AttributeType.SP_ATTACK),
    LAX(AttributeType.DEFENSE, AttributeType.SP_DEFENSE),
    TIMID(AttributeType.SPEED, AttributeType.ATTACK),
    HASTY(AttributeType.SPEED, AttributeType.DEFENSE),
    SERIOUS(null, null),
    JOLLY(AttributeType.SPEED, AttributeType.SP_ATTACK),
    NAIVE(AttributeType.SPEED, AttributeType.SP_DEFENSE),
    MODEST(AttributeType.SP_ATTACK, AttributeType.ATTACK),
    MILD(AttributeType.SP_ATTACK, AttributeType.DEFENSE),
    QUIET(AttributeType.SP_ATTACK, AttributeType.SPEED),
    BASHFUL(null, null),
    RASH(AttributeType.SP_ATTACK, AttributeType.SP_DEFENSE),
    CALM(AttributeType.SP_DEFENSE, AttributeType.ATTACK),
    GENTLE(AttributeType.SP_DEFENSE, AttributeType.DEFENSE),
    SASSY(AttributeType.SP_DEFENSE, AttributeType.SPEED),
    CAREFUL(AttributeType.SP_DEFENSE, AttributeType.SP_ATTACK),
    QUIRKY(null, null);

    private AttributeType positive;
    private AttributeType negative;
    private Nature(AttributeType positive, AttributeType negative) {
        this.positive = positive;
        this.negative = negative;
    }

    public AttributeType getPositive() {
        return positive;
    }

    public AttributeType getNegative() {
        return negative;
    }
}
