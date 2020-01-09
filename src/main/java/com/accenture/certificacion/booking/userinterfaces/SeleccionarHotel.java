package com.accenture.certificacion.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarHotel {

    public static final Target FILTROS_POPULARES = Target.the("Filtros populares").locatedBy("//*[@id='filterbox_options']/div/div[4]/div[2]/a[6]/label/div/span[1]");
    public static final Target SELECCIONAR_HOTEL = Target.the("Seleccion de hotel").locatedBy("//span[contains(text(),'Hotel Harrison by SB Hotels')]");
}
