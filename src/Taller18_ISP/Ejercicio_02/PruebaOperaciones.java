package Taller18_ISP.Ejercicio_02;

public class PruebaOperaciones {
    public static void main(String[] args) {
        Retiro cajero = new CajeroAutomatico();
        ServicioBancarioDigital bancaDigital = new ServicioBancarioDigital();

        System.out.println("--- Demostración ISP en Operaciones Bancarias ---");

        cajero.retirar(150000);
        bancaDigital.transferir(50000, "156845268");
        bancaDigital.pagarFactura("FAC-2026-01", 36500);
    }
}
