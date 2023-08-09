package com.DB.Entfernungsrechner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component // Markiert diese Klasse als eine Spring-Komponente, sodass sie in anderen Klassen injiziert werden kann.
public class StationService {

    private final Map<String, Station> stationsByCode = new HashMap<>(); // Speichert Stationen nach Code.

    // Konstruktor liest CSV-Datei und speichert Stationen im Speicher.
    public StationService(@Value("${stations.csvFilePath}") String csvFilePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            // Skip header row
            reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length >= 7) { // Ensure enough fields are present
                    String ds100Code = parts[1];
                    String stationName = parts[3];
                    double longitude = Double.parseDouble(parts[5].replace(',', '.'));
                    double latitude = Double.parseDouble(parts[6].replace(',', '.'));
                    Station station = new Station(ds100Code, stationName, longitude, latitude);
                    stationsByCode.put(ds100Code, station);
                }
            }
        }
    }


    public Station findStationByCode(String ds100Code) {
        return stationsByCode.get(ds100Code);
    }
}
