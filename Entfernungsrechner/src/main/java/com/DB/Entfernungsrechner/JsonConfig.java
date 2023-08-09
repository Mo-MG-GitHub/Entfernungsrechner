package com.DB.Entfernungsrechner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration // Markiert diese Klasse als Konfigurationsklasse, die Beans für die Spring-Anwendung definiert.
public class JsonConfig {

    @Bean // Erzeugt ein Bean, das von Spring verwaltet wird und an andere Teile der Anwendung injiziert werden kann.
    public Jackson2ObjectMapperBuilder objectMapperBuilder() {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.indentOutput(true); // Aktiviert die Einrückung in der JSON-Ausgabe. Dies führt dazu, dass die JSON-Ausgabe schön formatiert ist.
        return builder; // Gibt den konfigurierten Jackson2ObjectMapperBuilder zurück, der zum Erzeugen von ObjectMapper-Instanzen verwendet wird, die wiederum JSON serialisieren und deserialisieren.
    }
}
