package com.accenture.certificacion.booking.tasks;

import com.accenture.certificacion.booking.exceptions.AbrirElNavegadorException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;

public class AbrirElNavegador implements Task {

    PageObject pagina;

    public AbrirElNavegador(PageObject pagina) {
        this.pagina = pagina;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.wasAbleTo(Open.browserOn(pagina));
        }
        catch (Exception e){
            throw new AbrirElNavegadorException(AbrirElNavegadorException.APERTURA_NAVEGADOR_FALLIDA, e);
        }
    }

    public static AbrirElNavegador en (PageObject pagina){
        return Tasks.instrumented(AbrirElNavegador.class, pagina);
    }
}
