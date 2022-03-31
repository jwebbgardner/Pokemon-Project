package pokemon.pokedata;

import java.util.Arrays;
import pokemon.pokedata.attributes.Ability;
import pokemon.pokedata.attributes.Item;
import pokemon.pokedata.attributes.stats.EffortValues;
import pokemon.pokedata.attributes.stats.Stats;

public class Moveset {

    private final PokemonSpecies pokemon;
    private final int level;
    private final Ability ability;
    private final Item item;
    private final Move[] moves;
    private Stats stats;
    private EffortValues evs;

    public Moveset(PokemonSpecies pokemon, int level, Ability ability, Item item, Move[] moves) {
        this.pokemon = pokemon;
        this.level = level;
        this.ability = ability;
        this.item = item;
        this.moves = moves;
        stats = null;
    }

    @Override
    public String toString() {
        return "Moveset{" +
                "pokemon=" + pokemon +
                ", level=" + level +
                ", ability=" + ability +
                ", item=" + item +
                ", moves=" + Arrays.toString(moves) +
                ", stats=" + stats +
                '}';
    }
}
