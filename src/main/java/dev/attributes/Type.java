package dev.attributes;

import java.util.List;

public class Type {

    private final String name;
    private final List<Type> immunities;
    private final List<Type> resistances;
    private final List<Type> weaknesses;

    public Type(String name, List<Type> immunities, List<Type> resistances, List<Type> weaknesses) {
        this.name = name;
        this.immunities = immunities;
        this.resistances = resistances;
        this.weaknesses = weaknesses;
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