package pokemon.pokedata.attributes.stats;

public class EffortValues {

    private final int hp;
    private final int atk;
    private final int def;
    private final int spatk;
    private final int spdef;
    private final int spe;

    public EffortValues() {
        hp = 0;
        atk = 0;
        def = 0;
        spatk = 0;
        spdef = 0;
        spe = 0;
    }

    public EffortValues(int hp, int atk, int def, int spatk, int spdef, int spe) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spatk = spatk;
        this.spdef = spdef;
        this.spe = spe;
    }

    public int[] getEVs() {
        return new int[]{hp, atk, def, spatk, spdef, spe};
    }
}
