package Taller19_DIP.Ejercicio_01;

public class GestorAutenticacion {
    // Inversión de dependencia: se depende de la abstracción, no de la implementación
    private ServicioAutenticacion servicioAutenticacion;

    // Inyección de dependencias por constructor
    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void iniciarSesion(String usuario, String credencial) {
        boolean esValido = servicioAutenticacion.autenticar(usuario, credencial);
        if (esValido) {
            System.out.println("¡Acceso concedido para el usuario " + usuario + "!\n");
        } else {
            System.out.println("¡Acceso denegado! Credenciales inválidas.\n");
        }
    }
}
