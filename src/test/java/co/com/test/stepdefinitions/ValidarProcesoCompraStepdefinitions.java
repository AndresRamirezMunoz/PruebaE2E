package co.com.test.stepdefinitions;

import co.com.test.models.DatosPago;
import co.com.test.questions.ValidarMensajeCompra;
import co.com.test.task.AgregarProductos;
import co.com.test.task.IrAlCarrito;
import co.com.test.task.FinalizarCompra;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidarProcesoCompraStepdefinitions {


    @Managed(driver = "chrome")
    WebDriver hisBrowser;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(Cast.ofStandardActors());
        theActorCalled("UsuarioFinal")
                .can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("que el usuario ingresa al portal")
    public void elUsuarioIngresaAlPortal() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Open.url("https://www.demoblaze.com/")
        );
    }

    @Cuando("agrega {int} producto al carrito")
    public void agregaElProductoAlCarrito(int cantidad) {
        theActorCalled("UsuarioFinal").attemptsTo(
                AgregarProductos.escoger(cantidad)
        );
    }

    @Entonces("visualiza el carrito con los productos")
    public void visualizaElCarritoConLosProductos() {
        theActorInTheSpotlight().attemptsTo(
                IrAlCarrito.ir()
        );
    }

    @Y("termina el proceso de compra")
    public void terminaElProcesoDeCompra(List<DatosPago> listaDatos) {
        DatosPago datosPago = listaDatos.get(0);
        theActorInTheSpotlight().attemptsTo(
                FinalizarCompra.llenar(datosPago)
        );
        theActorInTheSpotlight().should(seeThat(
                ValidarMensajeCompra.mensaje())
        );
    }
}
