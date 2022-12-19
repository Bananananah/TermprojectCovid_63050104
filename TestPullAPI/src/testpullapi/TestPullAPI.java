/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpullapi;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;
import org.json.*;
/**
 *
 * @author nickk
 */
public class TestPullAPI {

    public static void main(String args[]) throws MalformedURLException, ProtocolException, IOException, JSONException {
        URL url = new URL("https://covid19.ddc.moph.go.th/api/Cases/today-cases-all");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

        int responseCode = conn.getResponseCode();

        if (responseCode != 200) {
            throw new RuntimeException("HttpResponseCode: " + responseCode);
        } else {
            StringBuilder informationString = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream(), "UTF-8");

            while (scanner.hasNext()) {
                informationString.append(scanner.nextLine());
            }
            scanner.close();
            String jsonString = informationString.toString(); 
     
            JSONArray arr = new JSONArray(jsonString);
            for (int i = 0; i < arr.length(); i++) {
                System.out.println(((JSONObject) arr.get(i)).optString("year"));
                System.out.println(((JSONObject) arr.get(i)).optString("weeknum"));
                System.out.println(((JSONObject) arr.get(i)).optString("new_case"));
                System.out.println(((JSONObject) arr.get(i)).optString("total_case"));
                System.out.println(((JSONObject) arr.get(i)).optString("new_case_excludeabroad"));
                System.out.println(((JSONObject) arr.get(i)).optString("total_case_excludeabroad"));
                System.out.println(((JSONObject) arr.get(i)).optString("new_recovered"));
                System.out.println(((JSONObject) arr.get(i)).optString("total_recovered"));
                System.out.println(((JSONObject) arr.get(i)).optString("new_death"));
                System.out.println(((JSONObject) arr.get(i)).optString("total_death"));
                System.out.println(((JSONObject) arr.get(i)).optString("case_foreign"));
                System.out.println(((JSONObject) arr.get(i)).optString("case_prison"));
                System.out.println(((JSONObject) arr.get(i)).optString("case_walkin"));
                System.out.println(((JSONObject) arr.get(i)).optString("case_new_prev"));
                System.out.println(((JSONObject) arr.get(i)).optString("case_new_diff"));
                System.out.println(((JSONObject) arr.get(i)).optString("death_new_prev"));
                System.out.println(((JSONObject) arr.get(i)).optString("death_new_diff"));
                System.out.println(((JSONObject) arr.get(i)).optString("update_date"));
                System.out.println("--------------------------------------------------");
            }
        }

    }

}