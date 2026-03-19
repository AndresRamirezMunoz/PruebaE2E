package co.com.test.interactions;

import co.com.test.models.DatosPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test.userinterfaces.PaginaCarrito.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class LlenarCamposFormulario implements Interaction {

    private final DatosPago DATOS_PAGO;

    public LlenarCamposFormulario(DatosPago datosPago) {
        this.DATOS_PAGO = datosPago;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_CHECKOUT, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_CHECKOUT),
                WaitUntil.the(CAMPO_NOMBRE, isClickable()).forNoMoreThan(10).seconds(),
                Enter.theValue(DATOS_PAGO.getNOMBRE()).into(CAMPO_NOMBRE),
                Enter.theValue(DATOS_PAGO.getPais()).into(CAMPO_PAIS),
                Enter.theValue(DATOS_PAGO.getCiudad()).into(CAMPO_CIUDAD),
                Enter.theValue(DATOS_PAGO.getTarjeta()).into(CAMPO_TRAJETA),
                Enter.theValue(DATOS_PAGO.getMes()).into(CAMPO_MES),
                Enter.theValue(DATOS_PAGO.getAnno()).into(CAMPO_ANNO),
                Click.on(BOTON_COPMPRA),
                WaitUntil.the(MENSAJE_COPMPRA, isClickable()).forNoMoreThan(10).seconds()
        );
    }

    public static LlenarCamposFormulario finalizar(DatosPago datosPago) {
        return instrumented(LlenarCamposFormulario.class, datosPago);
    }

}
