package pokemon.pokedata.attributes;

import java.util.List;

public class Type {

    private final String name;
    private final int id;
    private List<Type> immunities;
    private List<Type> resistances;
    private List<Type> weaknesses;

    public Type(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean isWeakTo(Type defensiveType) {
        return weaknesses.contains(defensiveType);
    }

    public String getTypeName() {
        return name;
    }

    public List<Type> getImmunities() {
        return immunities;
    }

    public List<Type> getResistances() {
        return resistances;
    }

    public List<Type> getWeaknesses() {
        return weaknesses;
    }
}