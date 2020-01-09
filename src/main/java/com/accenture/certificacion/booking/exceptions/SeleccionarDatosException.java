package com.accenture.certificacion.booking.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class SeleccionarDatosException extends SerenityManagedException{

    public static final String BUSQUEDA_HOTEL_FALLIDA = "Falló la búsqueda del hotel.";
    public SeleccionarDatosException(String busquedaHotelFallida, Throwable testErrorException) {
        super(testErrorException);
    }
}
