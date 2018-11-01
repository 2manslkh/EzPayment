package com.example.kengh.ezpayment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class APIhandler {
    String API_URL;
    HashMap<String,String> parameters = new HashMap<>();
    public String getResponseBody(String Token){
        try {

            // TODO: Append url with additional queries where required
            API_URL = getURLwithParams(API_URL);
            URL object = new URL(API_URL);
            HttpURLConnection con = (HttpURLConnection) object.openConnection();
            String readLine;

            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
//            con.setRequestProperty("Accept", "application/json");
            con.setRequestProperty("Authorization", "Bearer " + Token);

            int HttpResult = con.getResponseCode();
            // Check if Response if OK -- Valid Token
            if (HttpResult == HttpURLConnection.HTTP_OK) {
                // Read JSON
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()));
                StringBuffer response = new StringBuffer();
                while ((readLine = in .readLine()) != null) {
                    response.append(readLine);
                } in.close();

                // Print result
                System.out.println("JSON String Result " + response.toString());
                System.out.println(con.getURL());
                return response.toString();
            } else {
                System.out.println(con.getResponseMessage());

                return null;
            }
        } catch (Exception e) {
            System.out.println("Network Error");
            return null;
        }
    }

    public String getURLwithParams(String url){
        String out = "";
        out += url + "?";
        for (String k: parameters.keySet()){
            out += k+"="+parameters.get(k)+"&";
        }
        out += "\b";
        return out;
    }
}
