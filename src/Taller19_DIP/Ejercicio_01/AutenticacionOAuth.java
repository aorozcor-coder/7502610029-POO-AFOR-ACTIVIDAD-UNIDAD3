package Taller19_DIP.Ejercicio_01;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        System.out.println("Validando token OAuth con proveedor externo Google para: " + usuario);

        return credencial != null && credencial.startsWith("token_valid_");
    }
}