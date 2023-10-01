
package Guia2;

import java.util.Scanner;


public class E1 {
    
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese primer número");        
        int num1 = input.nextInt(); 
        
         System.out.println("Ingrese segundo número");        
        int num2 = Integer.parseInt(input.next()); 
        
        System.out.println("La suma de los dos número es: "+(num1+num2));
    }
}
