package Taller19_DIP.Ejercicio_02;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        System.out.println("Subiendo archivo '" + nombreArchivo + "' al servidor en la nube Google Drive.");
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        System.out.println("Descargando archivo '" + nombreArchivo + "' desde el servidor en la nube.");
        return "Contenido remoto de " + nombreArchivo;
    }
}
