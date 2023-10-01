
package Guia2;

import java.util.Scanner;

public class E3 {


    public static void main(String[] args) {
        

        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase;
        frase = teclado.nextLine();
        
        System.out.println(frase);
        System.out.println("Su frase en minusculas es: "+frase.toLowerCase());
        System.out.println("Su frase en mayusculas es: "+frase.toUpperCase());
    }
    
}
