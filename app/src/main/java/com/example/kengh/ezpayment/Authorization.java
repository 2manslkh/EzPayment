package com.example.kengh.ezpayment;

public class Authorization extends APIhandler{

    Authorization(String client_id, String redirect_uri){
        super.API_URL = "https://api.ocbc.com/ocbcauthentication/api/oauth2/authorize";
        parameters.put("client_id",client_id);
        parameters.put("redirect_uri",redirect_uri);
    }

    public String getToken(){
        //TODO: Access Login Page
        //TODO: Enter login details
        //TODO: Access Pin Page
        //TODO: Enter PIN
        //TODO: Get Token
        return null;
    }

}
