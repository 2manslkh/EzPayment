package org.ocbc;

import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;

public class CreditCard implements OcbcObject {

    private static String IMGAGE_URL = "imageURL";
    private static String KEYWORDS = "keywords";
    private static String NAME = "name";
    private static String PRODUCT_URL = "productURL";
    private static String TAG_LINE = "tagLine";

    private String imageURL;
    private String keywords;
    private String name;
    private String productURL;
    private String tagLine;

    CreditCard(String imageURL, String keywords, String name, String productURL, String tagLine) {
        this.imageURL = imageURL;
        this.keywords = keywords;
        this.name = name;
        this.productURL = productURL;
        this.tagLine = tagLine;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getName() {
        return name;
    }

    public String getProductURL() {
        return productURL;
    }

    public String getTagLine() {
        return tagLine;
    }

    public static CreditCard de_json(JSONObject json) throws JSONException {
        String imageURL = json.getString(IMGAGE_URL);
        String keywords = json.getString(KEYWORDS);
        String name = json.getString(NAME);
        String productURL = json.getString(PRODUCT_URL);
        String tagLine = json.getString(TAG_LINE);
        return new CreditCard(imageURL, keywords, name, productURL, tagLine);
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("{");
        str.append(IMGAGE_URL);
        str.append(":");
        str.append(imageURL);
        str.append(", ");
        str.append(KEYWORDS);
        str.append(":");
        str.append(keywords);
        str.append(", ");
        str.append(NAME);
        str.append(":");
        str.append(name);
        str.append(", ");
        str.append(PRODUCT_URL);
        str.append(":");
        str.append(productURL);
        str.append(", ");
        str.append(TAG_LINE);
        str.append(":");
        str.append(tagLine);
        str.append("}");
        return str.toString();
    }
}