package dev;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PokeAPICaller {

    public PokeAPICaller() throws IOException {

    }

    public static void main(String[] ignored) throws Exception {
        String requestUrl = "http://ip.jsontest.com/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(requestUrl)).GET().build();
        try {
            HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
//        URL url = new URL(requestUrl);
//        InputStreamReader reader = new InputStreamReader(url.openStream());
//        String temp = new Gson().fromJson(reader, String.class);
//        System.out.println(temp);
    }

}
