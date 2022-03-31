package pokemon.pokedata.attributes.stats;

public class Stats {

    private EffortValues evs;
    private IndividualValues ivs;
    private BaseStats baseStats;
    private int level;
    private int evasion;
    private int accuracy;
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
    }

    public int calcHP() {

    }

    public int calcStat() {

    }
}
