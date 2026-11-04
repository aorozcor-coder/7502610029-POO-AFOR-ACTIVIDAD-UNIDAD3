package Taller19_DIP.Ejercicio_02;

public class GestorArchivos {

    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombre, String contenido) {
        almacenamiento.guardarArchivo(nombre, contenido);
    }

    public void recuperar(String nombre) {
        String resultado = almacenamiento.recuperarArchivo(nombre);
        System.out.println("Resultado: " + resultado + "\n");
    }
}
