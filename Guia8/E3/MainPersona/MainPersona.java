/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.

*/
package Guia8.E3.MainPersona;

import Guia8.E3.Persona.Persona;
import Guia8.E3.PersonaServicio.PersonaServicio;
import java.util.Scanner;

public class MainPersona {
    
    public static void main(String[] args) {
        
        PersonaServicio Ps = new PersonaServicio();
//       Persona P1 = Ps.creaPersona();
//        Persona P2 = Ps.creaPersona();
//        Persona P3 = Ps.creaPersona();
//        Persona P4 = Ps.creaPersona();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int per1 = input.nextInt();
        
        int [] peso = new int[per1];
        boolean [] mayor = new boolean[per1];
        
        for (int i = 0; i < per1; i++) {

            String Per = String.valueOf(i);
            Persona per = Ps.creaPersona();
            System.out.println(per.getNombre());
            Ps.mensaje(Ps.calcularIMC(per), Ps.esMayorDeEdad(per));
            System.out.println("");
            
            System.out.println(Ps.esMayorDeEdad(per));
            peso [i] = Ps.calcularIMC(per);
            mayor[i] = Ps.esMayorDeEdad(per);
            
            
        }
        
    
        
        Ps.mayor(mayor);
        Ps.peso(peso);
        
   
        
        
        System.out.println("");
        
//        if (Ps.esMayorDeEdad( P1) == true){
//            System.out.println(P1.getNombre()+ " Es Mayor de edad");
//        } else { System.out.println(P1.getNombre()+" Es menor de edad");}
        
//        System.out.println("");
//        System.out.println(Ps.calcularIMC(P1));
        
        
        
    }

}
