package org.ocbc;

import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;

public class Rate implements OcbcObject {

    private static String BANK_BUYING_RATE_TT = "bankBuyingRateTT";
    private static String BANK_SELLING_RATE = "bankSellingRate";
    private static String FROM_CURRENCY = "fromCurrency";
    private static String TO_CURRENCY = "toCurrency";
    private static String UNIT = "unit";

    private double bankBuyingRateTT;
    private double bankSellingRate;
    private String fromCurrency;
    private String toCurrency;
    private int unit;

    Rate(double bankBuyingRateTT, double bankSellingRate, String fromCurrency, String toCurrency, int unit) {
        this.bankBuyingRateTT = bankBuyingRateTT;
        this.bankSellingRate = bankSellingRate;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.unit = unit;
    }

    public double getBankBuyingRateTT() {
        return bankBuyingRateTT;
    }

    public double getBankSellingRate() {
        return bankSellingRate;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public int getUnit() {
        return unit;
    }

    public static Rate de_json(JSONObject json) throws JSONException {
        double bankBuyingRateTT = json.getDouble(BANK_BUYING_RATE_TT);
        double bankSellingRate = json.getDouble(BANK_SELLING_RATE);
        String fromCurrency = json.getString(FROM_CURRENCY);
        String toCurrency = json.getString(TO_CURRENCY);
        int unit = json.getInt(UNIT);
        return new Rate(bankBuyingRateTT, bankSellingRate, fromCurrency, toCurrency, unit);
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("{");
        str.append(BANK_BUYING_RATE_TT);
        str.append(":");
        str.append(bankBuyingRateTT);
        str.append(", ");
        str.append(BANK_SELLING_RATE);
        str.append(":");
        str.append(bankSellingRate);
        str.append(", ");
        str.append(FROM_CURRENCY);
        str.append(":");
        str.append(fromCurrency);
        str.append(", ");
        str.append(TO_CURRENCY);
        str.append(":");
        str.append(toCurrency);
        str.append(", ");
        str.append(UNIT);
        str.append(":");
        str.append(unit);
        str.append("}");
        return str.toString();
    }
}