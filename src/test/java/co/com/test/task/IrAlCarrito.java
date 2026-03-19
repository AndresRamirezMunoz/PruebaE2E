package co.com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test.userinterfaces.PaginaPrincipal.OPCION_CARRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class IrAlCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPCION_CARRITO, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_CARRITO)
        );
    }

    public static IrAlCarrito ir() {
        return instrumented(IrAlCarrito.class);
    }
}
