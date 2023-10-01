//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
package Guia5;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        int suma = 0;
        int[] vector = new int[5];

        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese 5 números");
            int num = input.nextInt();
            vector[i] = num;
        }
        
        for (int i = 0; i < 5; i++) {
            suma += vector[i];
        }
        
        System.out.println("La suma de los números del vector es: "+suma);
    }

}
