// Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
package Guia3;

import java.util.Scanner;

public class E3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 caracteres, nosotros diremos si es o no correcto");
        String frase = input.nextLine();
        
        if (frase.length() != 8) {
            System.out.println("Incorrecto");
        } else {System.out.println("Correcto");}
        
    }
    
}
