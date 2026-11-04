package Taller19_DIP.Ejercicio_02;

public class PruebaAlmacenamiento {
    public static void main(String[] args) {
        System.out.println("--- Demostración DIP con Almacenamiento de Archivos ---");

        // Uso con Almacenamiento Local
        Almacenamiento local = new AlmacenamientoLocal();
        GestorArchivos gestorLocal = new GestorArchivos(local);
        gestorLocal.guardar("documento.pdf", "Datos de facturación");
        gestorLocal.recuperar("documento.pdf");

        // Uso con Almacenamiento en la Nube
        Almacenamiento nube = new AlmacenamientoNube();
        GestorArchivos gestorNube = new GestorArchivos(nube);
        gestorNube.guardar("respaldo.zip", "Copia de seguridad del sistema");
        gestorNube.recuperar("respaldo.zip");
    }
}