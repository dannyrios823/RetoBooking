package com.accenture.certificacion.booking.stepdefinitions;

import com.accenture.certificacion.booking.tasks.AbrirElNavegador;
import com.accenture.certificacion.booking.tasks.BuscarPorFiltros;
import com.accenture.certificacion.booking.tasks.SeleccionarDatos;
import com.accenture.certificacion.booking.userinterfaces.SeleccionarDatosIniciales;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BuscarHotelStepDefinitions {

    private SeleccionarDatosIniciales pagina;
    private Actor actor = Actor.named("Daniel");
    @Managed(driver = "chrome")
    public WebDriver driver;

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(driver));}

    @Dado("^que el actor abrio el navegador en la pagina de booking$")
    public void queElActorAbrioElNavegadorEnLaPaginaDeBooking() {
        actor.wasAbleTo(
                AbrirElNavegador.en(pagina)
        );
    }

    @Cuando("^ingresa los datos iniciales para hospedarse en (.*)$")
    public void ingresaLosDatosIniciales(String destino) {
        actor.attemptsTo(
                SeleccionarDatos.delHotel(destino)

        );

    }

    @Y("^selecciona la opcion de Filtros Populares$")
    public void seleccionaOpcionDeFiltrosPopulares() {
        actor.attemptsTo(
                BuscarPorFiltros.populares()
        );

    }

    @Entonces("^deberia ver la informacion del primer hotel que aparece$")
    public void deberiaVerLaInformacionDelPrimerHotelQueAparece() {
        actor.should();
    }



}
