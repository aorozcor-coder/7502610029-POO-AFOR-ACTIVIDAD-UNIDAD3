package Taller19_DIP.Ejercicio_01;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        System.out.println("Verificando credenciales locales en la base de datos para: " + usuario);

        return "afor".equals(usuario) && "5959".equals(credencial);
    }
}
