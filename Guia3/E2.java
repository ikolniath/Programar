//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
package Guia3;

import java.util.Scanner;


public class E2 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la palabra 'eureka'");
        String palabra = input.next();
        
        if (palabra.equals("eureka")) {
            System.out.println("Correcto");
        } else {System.out.println("Incorrecto");}
    }
    
}
