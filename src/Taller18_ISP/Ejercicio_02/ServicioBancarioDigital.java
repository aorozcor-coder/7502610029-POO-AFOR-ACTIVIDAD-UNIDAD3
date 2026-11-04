package Taller18_ISP.Ejercicio_02;

public class ServicioBancarioDigital implements Transferencia, PagoFactura {
    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("Banco Digital: Transferencia de $" + monto + " realizada con éxito a la cuenta " + cuentaDestino);
    }

    @Override
    public void pagarFactura(String codigoFactura, double monto) {
        System.out.println("Banco Digital: Pago de factura #" + codigoFactura + " por valor de $" + monto + " procesado.");
    }
}
