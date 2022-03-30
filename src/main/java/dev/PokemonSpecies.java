package dev;

import dev.attributes.Ability;
import dev.attributes.Type;
import dev.attributes.stats.Stat;

public class PokemonSpecies {

    private final String name;
    private Type type1;
    private Type type2;
    private Ability[] abilities;
    private int baseExperience;
    private int height;
    private int weight;
    private int id;
    private Stat[] baseStats;

    public PokemonSpecies(String name, Type type1, Type type2, Ability[] abilities,
            int baseExperience, int height, int weight, int id, Stat[] baseStats) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.abilities = abilities;
        this.baseExperience = baseExperience;
        this.height = height;
        this.weight = weight;
        this.id = id;
        this.baseStats = baseStats;
    }
}
