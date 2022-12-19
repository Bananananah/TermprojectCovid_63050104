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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.TodayCase;
import org.json.*;
/**
 *
 * @author nickk
 */
public class TestPullAPI {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("TermSoapServicePU");
    public void TestPullAPI() throws MalformedURLException, ProtocolException, IOException, JSONException {
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
            TodayCase covid = new TodayCase();
            JSONArray arr = new JSONArray(jsonString);
            for (int i = 0; i < arr.length(); i++) {
                covid.setId(Integer.valueOf(i));
                covid.setYearCovid(Integer.parseInt(((JSONObject) arr.get(i)).optString("year")));
                covid.setWeeknum(Integer.parseInt(((JSONObject) arr.get(i)).optString("weeknum")));
                covid.setNewCase(Integer.parseInt(((JSONObject) arr.get(i)).optString("new_case")));
                covid.setTotalCase(Integer.parseInt(((JSONObject) arr.get(i)).optString("total_case")));
                covid.setNewCaseExcludeabroad(Integer.parseInt(((JSONObject) arr.get(i)).optString("new_case_excludeabroad")));
                covid.setTotalCaseExcludeabroad(Integer.parseInt(((JSONObject) arr.get(i)).optString("total_case_excludeabroad")));
                covid.setNewRecovered(Integer.parseInt(((JSONObject) arr.get(i)).optString("new_recovered")));
                covid.setTotalRecovered(Integer.parseInt(((JSONObject) arr.get(i)).optString("total_recovered")));
                covid.setNewDeath(Integer.parseInt(((JSONObject) arr.get(i)).optString("new_death")));
                covid.setTotalDeath(Integer.parseInt(((JSONObject) arr.get(i)).optString("total_death")));
                covid.setCaseForeign(Integer.parseInt(((JSONObject) arr.get(i)).optString("case_foreign")));
                covid.setCasePrison(Integer.parseInt(((JSONObject) arr.get(i)).optString("case_prison")));
                covid.setCaseWalkin(Integer.parseInt(((JSONObject) arr.get(i)).optString("case_walkin")));
                covid.setCaseNewPrev(Integer.parseInt(((JSONObject) arr.get(i)).optString("case_new_prev")));
                covid.setCaseNewDiff(Integer.parseInt(((JSONObject) arr.get(i)).optString("case_new_diff")));
                covid.setDeathNewPrev(Integer.parseInt(((JSONObject) arr.get(i)).optString("death_new_prev")));
                covid.setDeathNewDiff(Integer.parseInt(((JSONObject) arr.get(i)).optString("death_new_diff")));
                covid.setUpdateDate(((JSONObject) arr.get(i)).optString("update_date"));
                new TestPullAPI().persist(covid);
                }
        }
}
    public void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

}