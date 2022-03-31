package pokemon.pokedata;

import pokemon.pokedata.attributes.Ability;
import pokemon.pokedata.attributes.Item;
import pokemon.pokedata.attributes.Type;
import pokemon.pokedata.attributes.stats.BaseStat;
import java.util.Arrays;

public class PokemonSpecies {

    private final Ability[] abilities;
    private final int baseExperience;
    private final int height;
    private final Item[] heldItems;
    private final int id;
    private final boolean isDefault;
    private final String name;
    private final BaseStat[] stats;
    private final Type[] types;
    private final int weight;

    public PokemonSpecies(Ability[] abilities, int baseExperience, int height,
            Item[] heldItems, int id, boolean isDefault, String name,
            BaseStat[] stats, Type[] types, int weight) {
        this.abilities = abilities;
        this.baseExperience = baseExperience;
        this.height = height;
        this.heldItems = heldItems;
        this.id = id;
        this.isDefault = isDefault;
        this.name = name;
        this.stats = stats;
        this.types = types;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PokemonSpecies{" +
                "abilities=" + Arrays.toString(abilities) +
                ", baseExperience=" + baseExperience +
                ", height=" + height +
                ", heldItems=" + Arrays.toString(heldItems) +
                ", id=" + id +
                ", isDefault=" + isDefault +
                ", name='" + name + '\'' +
                ", base stats=" + Arrays.toString(stats) +
                ", types=" + Arrays.toString(types) +
                ", weight=" + weight +
                '}';
    }

    public Ability[] getAbilities() {
        return abilities;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public int getHeight() {
        return height;
    }

    public Item[] getHeldItems() {
        return heldItems;
    }

    public int getId() {
        return id;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public String getName() {
        return name;
    }

    public BaseStat[] getStats() {
        return stats;
    }

    public Type[] getTypes() {
        return types;
    }

    public int getWeight() {
        return weight;
    }
}
