package co.com.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class PaginaProducto {

    public static final Target BOTON_AGREGAR = the("Boton agregar al carrito")
            .locatedBy("//a[@class='btn btn-success btn-lg']");
}
