package co.com.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class PaginaPrincipal {

    public static final Target PRODUCTOS = the("Productos en la pagina principal")
            .locatedBy("//div[@class='card-block']");
    public static final Target PRODUCTO_ESPECIFICO = the("Producto especifico")
            .locatedBy("(// div[@class='card-block'])['{0}']/h4/a");
    public static final Target OPCION_CARRITO = the("Opcion carrito de compras")
            .locatedBy("//li/a[contains(text(), 'Cart')]");


}
