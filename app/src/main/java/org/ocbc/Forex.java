package org.ocbc;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

public class Forex extends OcbcConnect {

    public Forex(String url, String token) {
        super(url, token);
    }

    public ArrayList<Rate> all() throws JSONException {
        return Forex.de_json(super.get());
    }

    public static ArrayList<Rate> de_json(JSONObject json) throws JSONException {
        ArrayList<Rate> rates = new ArrayList<Rate>();

        JSONArray jsonrates = json.getJSONArray("ForexRates");
        for (int i = 0; i < jsonrates.length(); i++) {
            JSONObject jsonrate = jsonrates.getJSONObject(i);
            rates.add(Rate.de_json(jsonrate));
        }

        return rates;
    }
}