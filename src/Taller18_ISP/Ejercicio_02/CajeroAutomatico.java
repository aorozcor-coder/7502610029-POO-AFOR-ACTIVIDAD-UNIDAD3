package Taller18_ISP.Ejercicio_02;

public class CajeroAutomatico implements Retiro {
    @Override
    public void retirar(double monto) {
        System.out.println("Cajero Automático: Dispensando $" + monto + " en efectivo.");
    }
}