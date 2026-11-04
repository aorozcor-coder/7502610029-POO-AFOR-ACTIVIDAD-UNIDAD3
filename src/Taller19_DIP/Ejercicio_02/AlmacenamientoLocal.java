package Taller19_DIP.Ejercicio_02;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) {
        System.out.println("Guardando archivo '" + nombreArchivo + "' en el disco local.");
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) {
        System.out.println("Recuperando archivo '" + nombreArchivo + "' desde el disco local.");
        return "Contenido local de " + nombreArchivo;
    }
}
