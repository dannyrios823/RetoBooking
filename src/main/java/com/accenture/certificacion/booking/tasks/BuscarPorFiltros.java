package com.accenture.certificacion.booking.tasks;

import com.accenture.certificacion.booking.exceptions.BuscarPorFiltrosException;
import com.accenture.certificacion.booking.userinterfaces.SeleccionarHotel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BuscarPorFiltros implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Click.on(SeleccionarHotel.FILTROS_POPULARES),
                    Click.on(SeleccionarHotel.SELECCIONAR_HOTEL)
            );
        }
        catch (Exception e){
            throw new BuscarPorFiltrosException(BuscarPorFiltrosException.SELECCION_HOTEL_FALLIDA, e);
        }
    }

    public static BuscarPorFiltros populares () {
        return Tasks.instrumented(BuscarPorFiltros.class);
    }
}
