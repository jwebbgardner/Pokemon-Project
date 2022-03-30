package dev;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class PokeAPIReader {

    public PokeAPIReader() {

    }

    public static void main(String[] ignored) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter desired pokemon's ID");
        String id = scanner.nextLine();
        Gson gson = new Gson();
        try {
            Reader reader = Files.newBufferedReader(
                    Path.of("api-data-master/data/api/v2/pokemon/" + id + "/index.json"));
            PokemonSpecies pokemon = gson.fromJson(reader, PokemonSpecies.class);
            System.out.println(pokemon.toString());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
