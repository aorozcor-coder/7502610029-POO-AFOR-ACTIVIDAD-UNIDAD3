package Taller18_ISP.Ejercicio_03;

public class Camion implements Conducible, Cargable {
    @Override
    public void conducir() {
        System.out.println("El camión se está conduciendo por la carretera principal.");
    }

    @Override
    public void cargarMercancia(double peso) {
        System.out.println("Cargando " + peso + " kg de mercancía en la plataforma del camión.");
    }
}
