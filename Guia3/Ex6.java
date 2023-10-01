//Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
package Guia3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        int menor = 0;
        double prom = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alturas a procesar");
        int num = input.nextInt();
        
        for (int i = 0; i < num; i++) {
            
            System.out.println("Ingrese la estatura, Usando la coma (,) para los decimales");
            double altura = input.nextDouble();
            System.out.println("");
            
            if (altura < 1.60 ) { menor++; } 
            prom = prom + altura;
                
        }
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println("La cantidad de personas con estatura menor a 1.60 mts. es: "+menor+"\n El promedio de estaturas es: "+(df.format(prom/num))+" mts.");
    }
    
}
