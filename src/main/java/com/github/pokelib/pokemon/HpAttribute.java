package com.github.pokelib.pokemon;

public class HpAttribute extends Attribute {
    public HpAttribute(int base) {
        super(AttributeType.HP, base);
    }

    public HpAttribute(int base, int iv) {
        super(AttributeType.HP, base, iv);
    }

    @Override
    public int getValue(Nature nature, int level) {
        return (((2 * base + iv + (ev / 4)) * level) / 100) + level + 10;
    }
}
