package pokemon.pokedata.attributes.stats;

public class IndividualValues {

    private final int hp;
    private final int atk;
    private final int def;
    private final int spatk;
    private final int spdef;
    private final int spe;

    public IndividualValues() {
        hp = 31;
        atk = 31;
        def = 31;
        spatk = 31;
        spdef = 31;
        spe = 31;
    }

    public IndividualValues(int hp, int atk, int def, int spatk, int spdef, int spe) {
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
