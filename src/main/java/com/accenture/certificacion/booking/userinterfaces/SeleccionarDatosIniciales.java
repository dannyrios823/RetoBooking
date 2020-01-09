package com.accenture.certificacion.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.booking.com/")
public class SeleccionarDatosIniciales extends PageObject {

    public static final Target INGRESAR_DESTINO = Target.the("Ingresar Destino").locatedBy("//input[@id='ss']");
    public static final Target SELECCIONAR_DESTINO = Target.the("Seleccionar Destino").locatedBy("//div[1]//div[1]//div[2]//form[1]//div[1]//div[1]//div[1]//div[1]//ul[1]//li[1]");
    public static final Target SELECTOR_FECHA_INICIAL = Target.the("Selector Fecha Inicial").locatedBy("//div[@class='xp__dates-inner xp__dates__checkin']//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']");
    public static final Target FECHA_INICIAL = Target.the("Fecha Inicial").locatedBy("//div[1]//div[1]//div[2]//form[1]//div[1]//div[2]//div[2]//div[1]//div[1]//div[3]//div[1]//table[1]//tbody[1]//tr[4]//td[6]//span[1]//span[1]");
    public static final Target SELECTOR_FECHA_FINAL = Target.the("Selector Fecha Final").locatedBy("//div[@class='xp__dates-inner xp__dates__checkout']//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']");
    public static final Target FECHA_FINAL = Target.the("Fecha Final").locatedBy("//div[1]//div[1]//div[2]//form[1]//div[1]//div[2]//div[2]//div[1]//div[1]//div[3]//div[1]//table[1]//tbody[1]//tr[5]//td[6]");
    public static final Target BOTON_BUSCAR = Target.the("Fecha Final").locatedBy("//button[contains(@class,'sb-searchbox__button')]");




}
