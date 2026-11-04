package Taller19_DIP.Ejercicio_03;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String contenido) {
        System.out.println("Generando hoja de cálculo en formato Excel con los datos:\n -> " + contenido);
    }
}