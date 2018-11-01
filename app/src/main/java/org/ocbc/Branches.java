package org.ocbc;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

public class Branches extends OcbcConnect {

    public Branches(String url, String token) {
        super(url, token);
    }

    public ArrayList<Branch> all() throws JSONException {
        return Branches.de_json(super.get());
    }

    public static ArrayList<Branch> de_json(JSONObject json) throws JSONException {
        ArrayList<Branch> branches = new ArrayList<Branch>();

        JSONArray jsonbranches = json.getJSONArray("branches");
        for (int i = 0; i < jsonbranches.length(); i++) {
            JSONObject jsonbranch = jsonbranches.getJSONObject(i);
            branches.add(Branch.de_json(jsonbranch));
        }

        return branches;
    }
}