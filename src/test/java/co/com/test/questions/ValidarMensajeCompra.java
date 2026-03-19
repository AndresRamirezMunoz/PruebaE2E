package co.com.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.test.userinterfaces.PaginaCarrito.MENSAJE_COPMPRA;

public class ValidarMensajeCompra implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return MENSAJE_COPMPRA.resolveFor(actor).isVisible();
    }

    public static ValidarMensajeCompra mensaje() {
        return new ValidarMensajeCompra();
    }
}
