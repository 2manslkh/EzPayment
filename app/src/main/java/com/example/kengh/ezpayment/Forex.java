package com.example.kengh.ezpayment;

public class Forex extends APIhandler{
    private String country;
    private String JSON_responseBody;

    Forex(){
        this("SG");
    }

    Forex(String country){
        super.API_URL = "https://api.ocbc.com:8243/Forex/1.1";
        this.country = country;
    }

}
