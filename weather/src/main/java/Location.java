import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
public class Location{
    public HttpResponse<String> location(String location_name) {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://www.metaweather.com/api/location/search/?query=" + location_name)).build();
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpResponse<String> response =  client.send(request, HttpResponse.BodyHandlers.ofString());
            return response;
        }catch (IOException e) {
            e.printStackTrace();
        }catch (InterruptedException i) {
            i.printStackTrace();
        }
        return null;

    }
}
