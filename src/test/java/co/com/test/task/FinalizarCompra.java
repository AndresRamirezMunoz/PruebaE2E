package co.com.test.task;

import co.com.test.interactions.LlenarCamposFormulario;
import co.com.test.models.DatosPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FinalizarCompra implements Task {

    private final DatosPago datosPago;

    public FinalizarCompra(DatosPago datosPago) {
        this.datosPago = datosPago;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LlenarCamposFormulario.finalizar(datosPago)
        );
    }

    public static FinalizarCompra llenar(DatosPago datosPago) {
        return instrumented(FinalizarCompra.class, datosPago);
    }
}
