package com.accenture.certificacion.booking.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class BuscarPorFiltrosException extends SerenityManagedException {

    public static final String SELECCION_HOTEL_FALLIDA = "Falló la selección del hotel.";
    public BuscarPorFiltrosException(String seleccionHotelFallida, Throwable testErrorException) {
        super(testErrorException);
    }
}
