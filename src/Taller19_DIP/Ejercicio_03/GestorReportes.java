package Taller19_DIP.Ejercicio_03;

public class GestorReportes {

    private GeneradorReporte generadorReporte;

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void procesarReporte(String datos) {
        generadorReporte.generarReporte(datos);
    }
}