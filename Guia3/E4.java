//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
package Guia3;

import java.util.Scanner;

public class E4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase, revisaremos si la primera letra es 'a' ");
        String frase = input.nextLine();
        
        String letra = frase.substring(0,1);

        
        if (letra.equals("a")||(letra.equals("A"))) {
            System.out.println("Correcto");
        } else { System.out.println("Incorrecto");}
    }
    
}
