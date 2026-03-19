package co.com.test.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test.userinterfaces.PaginaPrincipal.PRODUCTO_ESPECIFICO;
import static co.com.test.userinterfaces.PaginaProducto.BOTON_AGREGAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SeleccionarProducto implements Interaction {

    private final String CANTIDAD;

    public SeleccionarProducto(int cantidad) {
        CANTIDAD = String.valueOf(cantidad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PRODUCTO_ESPECIFICO.of(CANTIDAD), isClickable()).forNoMoreThan(10).seconds(),
                Click.on(PRODUCTO_ESPECIFICO.of(CANTIDAD)),
                Click.on(BOTON_AGREGAR)
        );
    }

    public static SeleccionarProducto agregar(int cantidad) {
        return instrumented(SeleccionarProducto.class, cantidad);
    }
}
