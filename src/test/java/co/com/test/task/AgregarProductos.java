package co.com.test.task;

import co.com.test.interactions.AceptarAlerta;
import co.com.test.interactions.RegresarPagina;
import co.com.test.interactions.SeleccionarProducto;
import co.com.test.utils.CaculoNumeros;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test.userinterfaces.PaginaPrincipal.PRODUCTOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarProductos implements Task {

    private final int CANTIDAD;

    public AgregarProductos(int cantidad) {
        this.CANTIDAD = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(PRODUCTOS, isVisible()).forNoMoreThan(10).seconds());
        int[] indices = CaculoNumeros.posicionAleatoria(CANTIDAD, PRODUCTOS, actor);
        for (int i = 0; i < CANTIDAD; i++) {
            actor.attemptsTo(
                    SeleccionarProducto.agregar(indices[i]),
                    AceptarAlerta.ir(),
                    RegresarPagina.ir(),
                    RegresarPagina.ir()
            );
        }
    }

    public static AgregarProductos escoger(int cantidad) {
        return new AgregarProductos(cantidad);
    }
}
