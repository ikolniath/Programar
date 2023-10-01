//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
package Guia3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        int num = 0;
        String letra;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese una letra y le diremos si es una vocal\n Recuerde debe ser una.");
            letra = input.nextLine();
            num = letra.length();
        } while (num != 1);
        
        if ("aeiou".contains(String.valueOf(letra).toLowerCase())) {
            System.out.println("Es vocal");
        } else { System.out.println("No es una Vocal");}
    }
}
