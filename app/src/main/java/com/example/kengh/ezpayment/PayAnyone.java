package com.example.kengh.ezpayment;

public class PayAnyone extends APIhandler{

    PayAnyone(){

    }

    PayAnyone(String sessionToken, String accountId, double amount, String payeeName,
          String payeePhoneNo, String secretPassCode){
        super.API_URL = "https://api.ocbc.com:8243/transactional/payanyone/1.0";
        parameters.put("sessionToken",sessionToken);
        parameters.put("accountId",accountId);
        parameters.put("amount",amount);
        parameters.put("payeeName",payeeName);
        parameters.put("payeePhoneNo",payeePhoneNo);
        parameters.put("secretPassCode",secretPassCode);
    }
}
