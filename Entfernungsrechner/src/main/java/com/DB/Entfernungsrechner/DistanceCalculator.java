package com.DB.Entfernungsrechner;


public class DistanceCalculator {

    private static final double EARTH_RADIUS_KM = 6371.0; // Erdradius in Kilometern.

    // Methode zur Berechnung der Entfernung zwischen zwei Stationen unter Verwendung der geografischen Koordinaten.
    public static int calculateDistance(Station fromStation, Station toStation) {
        double lat1 = Math.toRadians(fromStation.getLatitude());
        double lon1 = Math.toRadians(fromStation.getLongitude());
        double lat2 = Math.toRadians(toStation.getLatitude());
        double lon2 = Math.toRadians(toStation.getLongitude());

        double dLat = lat2 - lat1;
        double dLon = lon2 - lon1;

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(lat1) * Math.cos(lat2) * Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return (int) (EARTH_RADIUS_KM * c);
    }
}
