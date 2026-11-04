package Taller19_DIP.Ejercicio_03;

public class PruebaReportes {
    public static void main(String[] args) {
        System.out.println("--- Demostración DIP en Generación de Reportes ---");

        // Uso con Reporte PDF
        GeneradorReporte pdf = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(pdf);
        gestorPDF.procesarReporte("Ventas del mes de Octubre: $45,000");

        System.out.println();

        // Uso con Reporte Excel
        GeneradorReporte excel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(excel);
        gestorExcel.procesarReporte("Inventario: 1,200 unidades disponibles");
    }
}
