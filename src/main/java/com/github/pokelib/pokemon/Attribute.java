package com.github.pokelib.pokemon;

import java.util.Random;

public class Attribute {
    private int base;
    private int iv;
    private int ev = 0;

    public Attribute() {
        this(new Random().nextInt(31));
    }

    public Attribute(int iv) {
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
}
