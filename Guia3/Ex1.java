//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
package Guia3;


import java.util.Scanner;


public class Ex1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos");
        int minutos = input.nextInt();
        int dia = 0;
        
        int horas = (minutos/60);
        System.out.println(horas);
        
        if (horas < 24) {
            
            System.out.println("los minutos solo completan " +horas+ " horas.");        
        } else {
            while (((horas -24) <= 24) &  ((horas-24) >= 0) ) {
                    horas = horas - 24;
                     dia++;
            } 
            
            System.out.println("Los minutos completan "+dia+" días y "+horas+" Horas");
            
        }
        
        
       
        
    }
    
}
