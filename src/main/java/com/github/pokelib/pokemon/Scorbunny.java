package com.github.pokelib.pokemon;

import com.github.pokelib.moves.Growl;
import com.github.pokelib.moves.LearnMoveType;
import com.github.pokelib.moves.Move;
import com.github.pokelib.moves.Tackle;
import com.github.pokelib.types.Type;

import java.util.List;
import java.util.Map;

public class Scorbunny extends Pokemon {
    private Map<Move, String> levelUpLearnSet;
    Map<LearnMoveType, Map<Move, String>> fullLearnSet;

    public Scorbunny() {
        super("Scorbunny", 5, 50, 71, 40, 40, 40, 69, Type.FIRE, null);

        levelUpLearnSet = Map.ofEntries(
                Map.entry(new Tackle(), ""),
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
        return List.of(new Tackle(), new Growl());
    }
}
