package co.com.test.stepdefinitions;

import co.com.test.models.DatosPago;
import io.cucumber.java.DataTableType;
import java.util.Map;

public class DataTableDatosPagoDefinitions {

    @DataTableType
    public DatosPago datosPagoEntry(Map<String, String> entry) {
        return new DatosPago(
                entry.get("nombre"),
                entry.get("pais"),
                entry.get("ciudad"),
                entry.get("tarjeta"),
                entry.get("mes"),
                entry.get("anno")
        );
    }
}