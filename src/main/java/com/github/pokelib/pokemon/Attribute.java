package com.github.pokelib.pokemon;

import java.util.Random;

public class Attribute {
    protected int base;
    protected int iv;
    protected int ev = 0;
    protected int modifiers = 0;
    protected AttributeType type;

    public Attribute(AttributeType type, int base) {
        this(type, base, new Random().nextInt(31));
    }

    public Attribute(AttributeType type, int base, int iv) {
        this.type = type;
        this.base = base;
        this.iv = iv;
    }

    public int getIv() {
        return iv;
    }

    public void setIv(int iv) {
        this.iv = iv;
    }

    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    public int getValue(Nature nature, int level) {
        double multiplier = nature.getPositive() == type ? 1.1 : nature.getNegative() == type ? 0.9 : 1.0;
        return (int) (((((2 * base + iv + (ev / 4)) * level) / 100) + 5) * multiplier);
    }
}
