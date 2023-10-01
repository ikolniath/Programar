//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
package Guia3;

import java.util.Scanner;

public class E5 {

    public static void main(String[] args) {
        int num;
        int num1 = 0;
        int suma = 0;

        Scanner input = new Scanner(System.in);
        do {            
           System.out.println("Ingrese un número positivo");
           num = input.nextInt();
        } while (num < 0);
        
       
        
        do {            
            System.out.println("Ingrese números hasta que la suma sea superior a " + num);
            num1 = input.nextInt();
            suma += num1;
        } while (suma <= num);
        
        System.out.println("La suma es: " +suma+ " Mayor que el número "+num);
    }        
}
