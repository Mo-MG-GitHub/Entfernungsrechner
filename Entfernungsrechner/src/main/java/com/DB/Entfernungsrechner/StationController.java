package com.DB.Entfernungsrechner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController // Markiert diese Klasse als einen Controller, der REST-Antworten bereitstellt.
public class StationController {

    private final StationService stationService; // Service zum Abrufen von Stationen.

    public StationController(StationService stationService) {
        this.stationService = stationService; // Injiziert den StationService.
    }

    @GetMapping("/api/v1/distance/{fromCode}/{toCode}") // Endpunkt zum Abrufen der Entfernung zwischen zwei Stationen.
    public DistanceResponse getDistance(@PathVariable String fromCode, @PathVariable String toCode) {
        Station fromStation = stationService.findStationByCode(fromCode); // Station from finden.
        Station toStation = stationService.findStationByCode(toCode); // Station to finden.

        int distance = DistanceCalculator.calculateDistance(fromStation, toStation); // Entfernung berechnen.

        return new DistanceResponse( // Antwort zurückgeben.
                fromStation.getStationName(),
                toStation.getStationName(),
                distance,
                "km"
        );
    }
}

