package pokemon.jsonparser;

import static com.google.gson.JsonParser.parseReader;

import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;
import pokemon.pokedata.Moveset;

public class MovesetReader {

    private final Pattern movesetValidator;

    public MovesetReader() {
        // TODO: Pretty sure this won't work most of the time
        movesetValidator = Pattern.compile(
                "\"\"[A-z: -]*\": \\{\"level\": [1-9]{2}, \"abilities\": \\[\"[A-z ]*"
                        + "\",?[\"A-z -]*\\], \"items\": \\[\"[A-z ]*\",?[\"A-z ,-]*\\], "
                        + "\"moves\": \\[(\"[A-z ]+\"(, )?){4,}\\]}?,+( (\"evs\": "
                        + "\\{\"[A-z]{2,3}\": [0-9]{1,2}}, )(\"ivs\": \\{\"[A-z]{2,3}"
                        + "\": [0-9]{1,2}})}),?\"");
    }

    public static void main(String[] ignored) {
        Moveset[] movesets = movesetParse();
    }

    public static Moveset[] movesetParse() {
        try {
            Reader reader = Files.newBufferedReader(
                    Path.of("Movesets/MovesetTest.json"));
            JsonReader jsonReader = new JsonReader(reader);
            JsonObject json = parseReader(jsonReader).getAsJsonObject();
            Object[] keys = json.keySet().toArray();
            for (int i = 0; i < keys.length; ++i) {
                // Name of Pokemon
                String name = (String) (json.keySet().toArray())[i];
                System.out.println(name);
                // Pokemon's metadata
                JsonObject data = json.getAsJsonObject().get(name).getAsJsonObject();
                System.out.println(data.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
