/*
El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package guia9.Ex1.ServicioMesG9;

import guia9.Ex1.MesG9.MesG9;
import java.util.Scanner;

public class ServicioMesG9 {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public void adivinarMes(){
        
        MesG9 m = new MesG9();
        int flag = 0;

        do {
            System.out.println("Vamos a intentar adivinar el mes secreto\nIngrese el mes a advinar");
            String adivina = input.next();

            if (adivina.equalsIgnoreCase(m.getMesSecreto())) {
                System.out.println("¡HA ACERTADO!");
                flag++;
            } else {
                System.out.println("NO ACERTO, INTENTE DE NUEVO\n");
            }

        } while (flag == 0);

 
        
        
    }
    
}
