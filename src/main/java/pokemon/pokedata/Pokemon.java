package pokemon.pokedata;

import pokemon.pokedata.attributes.Ability;
import pokemon.pokedata.attributes.Item;
import pokemon.pokedata.attributes.Type;
import pokemon.pokedata.attributes.stats.Stat;
import java.util.Arrays;

public class Pokemon {

    private Ability ability;
    private int baseExperience;
    private int height;
    private Item heldItem;
    private int id;
    private final String name;
    private Stat[] stats;
    private Type[] types;
    private int weight;

    public Pokemon(Ability ability, int baseExperience, int height, Item heldItem, int id,
            String name, Stat[] stats, Type[] types, int weight) {
        this.ability = ability;
        this.baseExperience = baseExperience;
        this.height = height;
        this.heldItem = heldItem;
        this.id = id;
        this.name = name;
        this.stats = stats;
        this.types = types;
        this.weight = weight;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
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

    public Item getHeldItem() {
        return heldItem;
    }

    public void setHeldItem(Item heldItem) {
        this.heldItem = heldItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Stat[] getStats() {
        return stats;
    }

    public void setStats(Stat[] stats) {
        this.stats = stats;
    }

    public Type[] getTypes() {
        return types;
    }

    public void setTypes(Type[] types) {
        this.types = types;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "ability=" + ability +
                ", baseExperience=" + baseExperience +
                ", height=" + height +
                ", heldItem=" + heldItem +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", stats=" + Arrays.toString(stats) +
                ", types=" + Arrays.toString(types) +
                ", weight=" + weight +
                '}';
    }
}
