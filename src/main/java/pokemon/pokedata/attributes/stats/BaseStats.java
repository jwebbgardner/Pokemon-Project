package pokemon.pokedata.attributes.stats;

public class BaseStats {
    private final int hp;
    private final int atk;
    private final int def;
    private final int spatk;
    private final int spdef;
    private final int spe;

    public BaseStats(int hp, int atk, int def, int spatk, int spdef, int spe) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spatk = spatk;
        this.spdef = spdef;
        this.spe = spe;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getSpAtk() {
        return spatk;
    }

    public int getSpDef() {
        return spdef;
    }

    public int getSpe() {
        return spe;
    }
}
