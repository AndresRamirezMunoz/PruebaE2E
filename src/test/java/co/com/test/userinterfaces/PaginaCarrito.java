package co.com.test.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class PaginaCarrito {
    public static final Target BOTON_CHECKOUT = the("Boton checkout")
            .locatedBy("//button[@class='btn btn-success']");
    public static final Target CAMPO_NOMBRE = the("Campo nombre")
            .located(By.id("name"));
    public static final Target CAMPO_PAIS = the("Campo pais")
            .located(By.id("country"));
    public static final Target CAMPO_CIUDAD = the("Campo ciudad")
            .located(By.id("city"));
    public static final Target CAMPO_TRAJETA = the("Campo tarjeta")
            .located(By.id("card"));
    public static final Target CAMPO_MES = the("Campo mes")
            .located(By.id("month"));
    public static final Target CAMPO_ANNO = the("Campo año")
            .located(By.id("year"));
    public static final Target BOTON_COPMPRA = the("Boton compra")
            .locatedBy("//button[contains(text(), 'Purchase')]");

    public static final Target MENSAJE_COPMPRA = the("Mensje de compra")
            .locatedBy("//div[@class='sweet-alert  showSweetAlert visible']");

}
