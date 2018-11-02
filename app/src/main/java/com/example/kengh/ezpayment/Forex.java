package com.example.kengh.ezpayment;

public class Forex extends APIhandler{

    Forex(){
        this("SG");
    }

    Forex(String country){
        super.API_URL = "https://api.ocbc.com:8243/Forex/1.1";
        parameters.put("country",country);
    }

}
