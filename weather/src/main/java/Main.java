import java.net.http.HttpResponse;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main
{
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Location location = new Location();
        while (true)
        {
            try
            {
                System.out.println("Type a country/state/city");
                String place = br.readLine();
                HttpResponse<String> r = location.location(place);
                System.out.println(r.body());
            } catch (Exception e)
              {
                e.printStackTrace();
              }
        }
    }
}