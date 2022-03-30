package dev;

import dev.attributes.Ability;
import dev.attributes.Type;
import dev.attributes.stats.Stat;
import java.util.Arrays;

public class Pokemon {

    private final String name;
    private Type type1;
    private Type type2;
    private Ability ability;
    private int baseExperience;
    private int height;
    private int weight;
    private int id;
    private Stat[] stats;

    public Pokemon() {
        name = "missingno";
    }

    public Pokemon(String name, Type type1, Type type2, Ability ability, int baseExperience,
            int height, int weight, int id, Stat[] stats) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.ability = ability;
        this.baseExperience = baseExperience;
        this.height = height;
        this.weight = weight;
        this.id = id;
        this.stats = stats;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type1=" + type1 +
                ", type2=" + type2 +
                ", ability=" + ability +
                ", baseExperience=" + baseExperience +
                ", height=" + height +
                ", weight=" + weight +
                ", id=" + id +
                ", stats=" + Arrays.toString(stats) +
                '}';
    }

    public String getName() {
        return name;
    }

    public Type getType1() {
        return type1;
    }

    public void setType1(Type type1) {
        this.type1 = type1;
    }

    public Type getType2() {
        return type2;
    }

    public void setType2(Type type2) {
        this.type2 = type2;
    }

    public Ability getAbilities() {
        return ability;
    }

    public void setAbilities(Ability ability) {
        this.ability = ability;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Stat[] getStats() {
        return stats;
    }

    public void setStats(Stat[] stats) {
        this.stats = stats;
    }

    public boolean isMonotype() {
        return type2 == null;
    }
}
