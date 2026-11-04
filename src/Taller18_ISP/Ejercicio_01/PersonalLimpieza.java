package Taller18_ISP.Ejercicio_01;

public class PersonalLimpieza implements Limpieza{

    @Override
    public void limpiar(){
        System.out.println("El personal de limpieza esta aseando las instalaciones");
    }
}
