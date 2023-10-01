package guia9.E4.MainFecha;

import guia9.E4.FechaService.FechaService;

public class MainFecha {

    public static void main(String[] args) {
        
        FechaService F1 = new FechaService();
        
        //F1.FechaNacimiento();
        System.out.println(F1.fechaActual());
        F1.diferencia(F1.FechaNacimiento());
        
    }
    
}
