package com.DB.Entfernungsrechner;

public class Station {
    // Eigenschaften einer Station.
    private String ds100Code;
    private String stationName;
    private double longitude;
    private double latitude;

    // Konstruktoren
    public Station(String ds100Code, String stationName, double longitude, double latitude) {
        this.ds100Code = ds100Code;
        this.stationName = stationName;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    // Getters
    public String getDs100Code() {
        return ds100Code;
    }

    public String getStationName() {
        return stationName;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    // Setters
    public void setDs100Code(String ds100Code) {
        this.ds100Code = ds100Code;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
