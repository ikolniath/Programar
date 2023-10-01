//Crear un programa que dado un número determine si es par o impar.
package Guia3;

import java.util.Scanner;


public class E1 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número para determinar si es par o impar");
        int num = input.nextInt();
        
        if (num%2 == 0){
            System.out.println("El número es Par");
        } else { System.out.println("El número es Impar");}
        
        
    }
    
}
