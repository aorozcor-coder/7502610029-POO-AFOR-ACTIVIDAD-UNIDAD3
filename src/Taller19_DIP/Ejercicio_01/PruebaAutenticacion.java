package Taller19_DIP.Ejercicio_01;

public class PruebaAutenticacion {
    public static void main(String[] args) {
        System.out.println("--- Demostración Principio DIP ---");

        // Uso con Autenticación Local
        ServicioAutenticacion authLocal = new AutenticacionLocal();
        GestorAutenticacion gestorLocal = new GestorAutenticacion(authLocal);
        gestorLocal.iniciarSesion("afor", "5959");

        // Uso con Autenticación OAuth
        ServicioAutenticacion authOAuth = new AutenticacionOAuth();
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(authOAuth);
        gestorOAuth.iniciarSesion("samuel_salgado", "token_valid_rpm777");
    }
}
