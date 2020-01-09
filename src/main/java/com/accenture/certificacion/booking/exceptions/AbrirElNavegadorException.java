package com.accenture.certificacion.booking.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class AbrirElNavegadorException extends SerenityManagedException {
    public static final String APERTURA_NAVEGADOR_FALLIDA = "Falló abrir el navegador.";
    public AbrirElNavegadorException(String aperturaNavegadorFallida, Throwable testErrorException) {
        super(testErrorException);
    }
}
