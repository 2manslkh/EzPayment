package org.ocbc;

import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;

public class Atm implements OcbcObject {

    private static String ADRRESS = "address";
    private static String LANDMARK = "landmark";
    private static String LATITUDE = "latitude";
    private static String LONGITUDE = "longitude";
    private static String NOTE = "note";
    private static String NOTE_DETAILS = "noteDetails";
    private static String POSTAL_CODE = "postalCode";

    private String address;
    private String landmark;
    private double latitude;
    private double longitude;
    private String note;
    private String noteDetails;
    private String postalCode;

    Atm(String address, String landmark, double latitude, double longitude, String note, String noteDetails, String postalCode) {
        this.address = address;
        this.landmark = landmark;
        this.latitude = latitude;
        this.longitude = longitude;
        this.note = note;
        this.noteDetails = noteDetails;
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getLandmark() {
        return landmark;
    }

    public String getNote() { return note; }

    public String getNoteDetails() { return noteDetails; }

    public String getAddress() {
        return address;
    }

    public static Atm de_json(JSONObject json) throws JSONException {
        String address = json.getString(ADRRESS);
        String landmark = json.getString(LANDMARK);
        double latitude = json.getDouble(LATITUDE);
        double longitude = json.getDouble(LONGITUDE);
        String note = json.getString(NOTE);
        String noteDetails = json.getString(NOTE_DETAILS);
        String postalCode = json.getString(POSTAL_CODE);
        return new Atm(address, landmark, latitude, longitude, note, noteDetails, postalCode);
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("{");
        str.append(ADRRESS);
        str.append(":");
        str.append(address);
        str.append(", ");
        str.append(LANDMARK);
        str.append(":");
        str.append(landmark);
        str.append(", ");
        str.append(LATITUDE);
        str.append(":");
        str.append(latitude);
        str.append(", ");
        str.append(LONGITUDE);
        str.append(":");
        str.append(longitude);
        str.append(", ");
        str.append(NOTE);
        str.append(":");
        str.append(note);
        str.append(", ");
        str.append(NOTE_DETAILS);
        str.append(":");
        str.append(noteDetails);
        str.append(", ");
        str.append(POSTAL_CODE);
        str.append(":");
        str.append(postalCode);
        str.append("}");
        return str.toString();
    }
}