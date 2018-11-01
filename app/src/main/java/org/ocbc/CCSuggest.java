package org.ocbc;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

public class CCSuggest extends OcbcConnect {

    public CCSuggest(String url, String token) {
        super(url, token);
    }

    public ArrayList<CreditCard> suggest(String keyword) throws JSONException {
        return CCSuggest.de_json(super.get(keyword));
    }

    public static ArrayList<CreditCard> de_json(JSONObject json) throws JSONException {
        ArrayList<CreditCard> creditcards = new ArrayList<CreditCard>();

        JSONArray jsoncreditcards = json.getJSONArray("CCSuggest");
        for (int i = 0; i < jsoncreditcards.length(); i++) {
            JSONObject jsoncreditcard = jsoncreditcards.getJSONObject(i);
            creditcards.add(CreditCard.de_json(jsoncreditcard));
        }

        return creditcards;
    }
}