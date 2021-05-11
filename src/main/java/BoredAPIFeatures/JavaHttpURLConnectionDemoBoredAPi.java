package BoredAPIFeatures;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class JavaHttpURLConnectionDemoBoredAPi {

    public JavaHttpURLConnectionDemoBoredAPi () {

    }

    private static BoredAPOD getApod()throws IOException{

        // Create a neat value object to hold the URL
        URL url = new URL("https://www.boredapi.com/api/activity");

        // Open a connection(?) on the URL(?) and cast the response(??)
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Now it's "open", we can set the request method, headers etc.
        connection.setRequestProperty("accept", "application/json");

        // This line makes the request
        InputStream responseStream = connection.getInputStream();

        // Manually converting the response body InputStream to APOD using Jackson
        ObjectMapper mapper = new ObjectMapper();
        BoredAPOD apod = mapper.readValue(responseStream, BoredAPOD.class);

        // Finally we have the response
        //System.out.println(apod.price);
        return apod;
    }

    public static int getPrice(){
        try {
            int price = getApod().price;
            return price;
        }catch(IOException nonull){
            nonull.getMessage();
        }
        return 00000;
    }

}