package com.github.pokelib.pokemon;

import com.github.pokelib.moves.*;
import com.github.pokelib.types.Type;

import java.util.List;
import java.util.Map;

public class Grookey extends Pokemon {
    private Map<Move, String> levelUpLearnSet;
    Map<LearnMoveType, Map<Move, String>> fullLearnSet;

    public Grookey() {
        super("Grookey", 50, 65, 50, 40, 40, 65, Type.GRASS, null);

        levelUpLearnSet = Map.ofEntries(
                Map.entry(new Scratch(), ""),
                Map.entry(new Growl(), "")
        );
        fullLearnSet = Map.ofEntries(
                Map.entry(LearnMoveType.LEVEL_UP, levelUpLearnSet)
        );
    }

    @Override
    public Map<LearnMoveType, Map<Move, String>> getLearnSet() {
        return fullLearnSet;
    }

    @Override
    public List<Move> getMoveSet() {
        return List.of(new Scratch(), new Growl());
    }
}
