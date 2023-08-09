package com.DB.Entfernungsrechner;

public class DistanceResponse {
    // Eigenschaften einer Entfernungsantwort.
    private String from;
    private String to;
    private int distance;
    private String unit;

    // Konstruktoren

    public DistanceResponse(String from, String to, int distance, String unit) {
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.unit = unit;
    }

    // Getters
    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getDistance() {
        return distance;
    }

    public String getUnit() {
        return unit;
    }

    // Setters
    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
