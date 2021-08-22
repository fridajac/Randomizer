package Services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Method 1 to make an API call, using HttpURLConnection (non-sync)
 * Class for getting random phone numbers from Randommer API (in JSON).
 */

public class PhoneServiceConnection {

    private static HttpURLConnection connection;

    public void getResponse(){
        //Method 1: java.net.HttpURLConnection
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();
        try {
            //set up our connection
            URL url = new URL("https://jsonplaceholder.typicode.com/albums");
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            //try to get some response
            int status = connection.getResponseCode();
            System.out.println(status);

            if(status > 299){
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while((line = reader.readLine()) != null){
                    responseContent.append(line);
                }
                reader.close();
            }
            else{
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while((line = reader.readLine()) != null){
                    responseContent.append(line);
                }
            }
            System.out.println(responseContent.toString());

        }catch (MalformedURLException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            connection.disconnect();
        }
    }

    //TEST: https://jsonplaceholder.typicode.com/albums
    //curl -X GET "https://randommer.io/api/Phone/Generate?CountryCode=US&Quantity=2" -H "accept: */*" -H "X-Api-Key: your API key"

}
