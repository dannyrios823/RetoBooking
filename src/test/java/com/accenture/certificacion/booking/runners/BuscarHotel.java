package com.accenture.certificacion.booking.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/buscar_hotel_en_booking.feature",
        glue = "com.accenture.certificacion.booking.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class BuscarHotel {
}
