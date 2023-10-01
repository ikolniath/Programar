package guia9.E5.MainPersona1;

import guia9.E5.Persona1.Persona1;
import guia9.E5.Persona1Servicio.Persona1Servicio;
import java.text.ParseException;

public class MainPersona {

    public static void main(String[] args) throws ParseException {
        
        Persona1Servicio P1 = new Persona1Servicio();
        
        //P1.crearPersona();
        Persona1 x = P1.crearPersona1();
        System.out.println(P1.calcularEdad(x));
        System.out.println(P1.menorQue(x));
        P1.mostraPersona();
    }
    
}
