package org.ocbc.utils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

public class request {

    public static JSONObject get(String url, HashMap<String, String> headers) throws JSONException {
        BufferedReader in = null;
        StringBuffer response = null;

        try {
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");

            for (String key : headers.keySet()) {
                con.setRequestProperty(key, headers.get(key));
            }

            in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            response = new StringBuffer();

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

        } catch(Exception exception) {
            System.out.println(exception);
            return null;
        }

        return new JSONObject(response.toString());
    }
}