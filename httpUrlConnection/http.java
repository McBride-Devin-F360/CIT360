import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;



public class HttpUrlTesting {

    // METHODS
    public void run() {
        URL url;
        String content = "";

        HttpURLConnection http;


        try {
            url = new URL("http://cit336.freshtechsol.com");
            URLConnection connection = url.openConnection();
            System.out.println("Type: " + connection.getContentType());

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = br.readLine()) != null)
            {
                content += line + "\n";
            }
            br.close();

            http = (HttpURLConnection) connection;
            http.setDoInput(true);
        }
        catch (MalformedURLException ex) {
            System.out.println("MalformedURLException: " + ex.getMessage());
        }
        catch (IOException ex) {
            System.out.println("IOException: " + ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Other Exception: " + ex.getMessage());
        }

        System.out.println("Contents:\n");
        System.out.println(content);
    }

    private void sendGet() throws Exception {

        String url = "http://www.google.com/search?q=mkyong";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        String response = "";

        while ((inputLine = br.readLine()) != null) {
            response += inputLine;
        }
        br.close();

        // Print the response
        System.out.println(response);

    }

    private void sendPost() throws Exception {

        String url = "http://cit336.freshtechsol.com/newspaper";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Add request header
        con.setRequestMethod("POST");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        String urlParameters = "action=main_view";

        // Send POST request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        String response = "";

        while ((inputLine = br.readLine()) != null) {
            response += inputLine;
        }
        br.close();

        // Print the response
        System.out.println(response);

    }

    public static void main(String[] args) {
        System.out.println(System.getProperties().toString());
        System.setProperty("http.agent", "Chrome");

        HttpUrlTesting tester = new HttpUrlTesting();
        tester.run();
        try {

            tester.sendPost();
        }
        catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
