/*Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.*/
package Guia4;

import java.util.Scanner;

public class E11guia {

    public static void main(String[] args) {
        String ultima;
        String frase;
        do{
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase que termine en punto (.)");
        frase = input.nextLine();
        frase = frase.toLowerCase();
        ultima = frase.substring(frase.length()-1, frase.length());
        } while(!".".equals(ultima));
               
        cambio(frase);
    }

    public static void cambio(String frase) {

        String frase1 = "";

        for (int i = 0; i < frase.length(); i++) {

            String op = frase.substring(i, i + 1);

            switch (op) {
                case "a":
                    frase1 = frase1.concat("@");
                    break;
                case "e":
                    frase1 = frase1.concat("#");
                    break;
                case "i":
                    frase1 = frase1.concat("$");
                    break;
                case "o":
                    frase1 = frase1.concat("%");
                    break;
                case "u":
                    frase1 = frase1.concat("*");
                    break;
                default:
                    frase1 = frase1.concat(op);
                    break;
            }
        }
        System.out.println(frase1);
    }

}
