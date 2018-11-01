package org.ocbc;

import org.json.JSONException;
import org.json.JSONObject;
import org.ocbc.utils.headers;
import org.ocbc.utils.request;

public class OcbcConnect {

    private String url;
    private String token;

    public OcbcConnect(String url, String token) {
        this.url = url;
        this.token = token;
    }

    public JSONObject get() throws JSONException {
        return this.get(null);
    }

    public JSONObject get(String args) throws JSONException {
        String url = this.url;
        if (args != null) {
            url = String.format("%s/%s", url, args);
        }

        return request.get(url, headers.get(this.token));
    }
}
