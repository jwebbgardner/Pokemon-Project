package pokemon.pokedata.attributes.stats;

public class Stats {

    private final EffortValues evs;
    private final IndividualValues ivs;
    private final BaseStats baseStats;
    private final int level;
    private final int evasion;
    private final int accuracy;
    private int hp;
    private int atk;
    private int def;
    private int spatk;
    private int spdef;
    private int spe;

    public Stats(EffortValues evs, IndividualValues ivs, BaseStats baseStats, int level) {
        this.evs = evs;
        this.ivs = ivs;
        this.baseStats = baseStats;
        this.level = level;
        evasion = 100;
        accuracy = 100;
        hp = calcHP();
        atk = calcAtk();
        def = calcDef();
        spatk = calcSpAtk();
        spdef = calcSpDef();
        spe = calcSpe();
    }

    public int calcHP() {
        return (int) ((2.0 * baseStats.getHp() + ivs.getIVs()[0] + (evs.getEVs()[0] / 4) * level)
                / 100) + level + 10;
    }

    public int calcAtk() {
        return (int) ((2.0 * baseStats.getAtk() + ivs.getIVs()[1] + (evs.getEVs()[1] / 4) * level)
                / 100) + 5;
    }

    public int calcDef() {
        return (int) ((2.0 * baseStats.getDef() + ivs.getIVs()[2] + (evs.getEVs()[2] / 4) * level)
                / 100) + 5;
    }

    public int calcSpAtk() {
        return (int) ((2.0 * baseStats.getSpAtk() + ivs.getIVs()[3] + (evs.getEVs()[3] / 4) * level)
                / 100) + 5;
    }

    public int calcSpDef() {
        return (int) ((2.0 * baseStats.getSpDef() + ivs.getIVs()[4] + (evs.getEVs()[4] / 4) * level)
                / 100) + 5;
    }

    public int calcSpe() {
        return (int) ((2.0 * baseStats.getSpe() + ivs.getIVs()[5] + (evs.getEVs()[5] / 4) * level)
                / 100) + 5;
    }
}
