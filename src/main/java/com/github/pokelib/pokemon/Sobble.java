package com.github.pokelib.pokemon;

import com.github.pokelib.moves.*;
import com.github.pokelib.types.Type;

import java.util.List;
import java.util.Map;

public class Sobble extends Pokemon {
    private Map<Move, String> levelUpLearnSet;
    Map<LearnMoveType, Map<Move, String>> fullLearnSet;

    public Sobble() {
        super("Sobble", 5, 50, 40, 40, 70, 40, 70, Type.WATER, null);

        levelUpLearnSet = Map.ofEntries(
                Map.entry(new Pound(), ""),
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
        return List.of(new Pound(), new Growl());
    }
}
