package pokemon.pokedata.attributes;

import java.net.URL;

public class Ability {

    private final String name;
    private final String description;
    private final URL apiUrl;

    public Ability(String name, String description, URL apiUrl) {
        this.name = name;
        this.description = description;
        this.apiUrl = apiUrl;
    }

}
