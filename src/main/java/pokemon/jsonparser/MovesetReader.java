package pokemon.jsonparser;

import static com.google.gson.JsonParser.parseReader;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.regex.Pattern;
import pokemon.pokedata.Moveset;

public class MovesetReader {

    private final Pattern movesetValidator;

    public MovesetReader() {
        movesetParse();
        // TODO: Pretty sure this won't work most of the time
        movesetValidator = Pattern.compile(
                "\"\"[A-z: -]*\": \\{\"level\": [1-9]{2}, \"abilities\": \\[\"[A-z ]*"
                        + "\",?[\"A-z -]*\\], \"items\": \\[\"[A-z ]*\",?[\"A-z ,-]*\\], "
                        + "\"moves\": \\[(\"[A-z ]+\"(, )?){4,}\\]}?,+( (\"evs\": "
                        + "\\{\"[A-z]{2,3}\": [0-9]{1,2}}, )(\"ivs\": \\{\"[A-z]{2,3}"
                        + "\": [0-9]{1,2}})}),?\"");
    }

    public static Moveset[] movesetParse() {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(
                    Path.of("Movesets/gen8randombattle.json"));
            JsonReader jsonReader = new JsonReader(reader);
            JsonObject json = parseReader(jsonReader).getAsJsonObject();
            Object[] keys = json.keySet().toArray();
            HashMap<Integer, String> ids = new HashMap<>();
            for (int i = 0; i < keys.length; ++i) {
                // Name of Pokemon
                String name = ((String) (json.keySet().toArray())[i]).toLowerCase();
                System.out.println(name);
                JsonReader pokeReader = new JsonReader(
                        Files.newBufferedReader(Path.of("Movesets/pokedex/pokeIDs.json")));
                JsonArray pokeArray = parseReader(pokeReader).getAsJsonObject().get("results")
                        .getAsJsonArray();
                // Reads through every pokemon's ID and matches them to a moveset
                for (int j = 0; j < pokeArray.size(); ++j) {
                    JsonObject currentPoke = pokeArray.get(j).getAsJsonObject();
                    if (currentPoke.get("name").getAsString().equals(name)) {
                        ids.put(currentPoke.get("id").getAsInt(), name);
                        System.out.println(currentPoke.get("id").getAsInt());
                        pokeReader.close();
                        break;
                    }
                }
                // Pokemon's metadata
//                JsonObject data = json.getAsJsonObject().get(name).getAsJsonObject();
//                System.out.println(data.toString());
            }
            gson.toJson(ids, new FileWriter("Movesets/randPokeIDs.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
