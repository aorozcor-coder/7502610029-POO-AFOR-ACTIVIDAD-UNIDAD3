package Taller19_DIP.Ejercicio_03;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String contenido) {
        System.out.println("Generando reporte en formato PDF con el siguiente contenido:\n -> " + contenido);
    }
}