package com.accenture.certificacion.booking.tasks;

import com.accenture.certificacion.booking.exceptions.SeleccionarDatosException;
import com.accenture.certificacion.booking.userinterfaces.SeleccionarDatosIniciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SeleccionarDatos implements Task {

    private String destino;

    public SeleccionarDatos(String destino){
        this.destino=destino;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.theValue(destino).into(SeleccionarDatosIniciales.INGRESAR_DESTINO),
                    Click.on(SeleccionarDatosIniciales.SELECCIONAR_DESTINO),
                    Click.on(SeleccionarDatosIniciales.SELECTOR_FECHA_INICIAL),
                    Click.on(SeleccionarDatosIniciales.SELECTOR_FECHA_INICIAL),
                    Click.on(SeleccionarDatosIniciales.FECHA_INICIAL),
                    Click.on(SeleccionarDatosIniciales.SELECTOR_FECHA_FINAL),
                    Click.on(SeleccionarDatosIniciales.SELECTOR_FECHA_FINAL),
                    Click.on(SeleccionarDatosIniciales.FECHA_FINAL),
                    Click.on(SeleccionarDatosIniciales.BOTON_BUSCAR)
                    );
        }catch (Exception e){
            throw new SeleccionarDatosException(SeleccionarDatosException.BUSQUEDA_HOTEL_FALLIDA, e);
        }

    }

    public static SeleccionarDatos delHotel (String destino) {
        return Tasks.instrumented(SeleccionarDatos.class, destino);
    }
}
