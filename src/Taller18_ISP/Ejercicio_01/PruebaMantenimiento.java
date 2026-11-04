package Taller18_ISP.Ejercicio_01;

public class PruebaMantenimiento {
    public static void main(String[] args) {
        Reparacion tecnico = new Tecnico();
        Limpieza personalLimpieza = new PersonalLimpieza();

        System.out.println("--- Demostración Principio ISP ---");
        tecnico.reparar();
        personalLimpieza.limpiar();
    }
}
