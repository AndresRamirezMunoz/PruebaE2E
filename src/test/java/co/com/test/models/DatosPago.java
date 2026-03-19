package co.com.test.models;

public class DatosPago {
    private final String NOMBRE;
    private final String PAIS;
    private final String CIUDAD;
    private final String TARJETA;
    private final String MES;
    private final String ANNO;

    public DatosPago(String nombre, String pais, String ciudad, String tarjeta, String mes, String anno) {
        this.NOMBRE = nombre;
        this.PAIS = pais;
        this.CIUDAD = ciudad;
        this.TARJETA = tarjeta;
        this.MES = mes;
        this.ANNO = anno;
    }

    public String getNOMBRE() { return NOMBRE; }
    public String getPais() { return PAIS; }
    public String getCiudad() { return CIUDAD; }
    public String getTarjeta() { return TARJETA; }
    public String getMes() { return MES; }
    public String getAnno() { return ANNO; }
}