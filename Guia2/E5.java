
package Guia2;

import java.util.Scanner;


public class E5 {

 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = input.nextInt();
        
        System.out.println("El doble es: "+ (num * 2));
        System.out.println("El triple es: "+ (num * 3));
        System.out.println("La raiz cuadrada es: "+ Math.sqrt(num)); 

    }
    
}
