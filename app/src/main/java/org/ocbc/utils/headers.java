package org.ocbc.utils;

import java.util.HashMap;

public class headers {
    public static HashMap<String, String> get(String token) {
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", String.format("Bearer %s", token));
        headers.put("Accept", "application/json");
        return headers;
    }
}