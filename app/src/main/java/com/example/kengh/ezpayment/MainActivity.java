package com.example.kengh.ezpayment;

public class MainActivity {
    public static void main(String[] args) {
        final String testID = "000xxxx";
        final String testPW = "123456";
        final String testPIN = "123456";
        final String client_id = "hPH3p3NsQL4bdunQJECpbTP03K4a";
        final String redirect_uri = "https://api.ocbc.com:8243/transactional/payanyone/1.0";
        String token;

        // To test Auth API
        Authorization a = new Authorization(client_id,redirect_uri);
        token = a.getToken(); //TODO
        a.getResponseBody(token);

        // To test FOREX API
        token = "f8a4616a1f7ca4a11a79a277c86b3cea";
        Forex forex = new Forex();
        forex.getResponseBody(token);
    }
}
