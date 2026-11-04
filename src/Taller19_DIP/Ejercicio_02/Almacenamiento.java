package Taller19_DIP.Ejercicio_02;

public interface Almacenamiento {
    void guardarArchivo(String nombreArchivo, String contenido);
    String recuperarArchivo(String nombreArchivo);
}
