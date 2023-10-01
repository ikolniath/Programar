// Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
package Guia5;

import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {
        int num = 0; int num1 =9; int aux =0; int s =0; int s2 =0; int inv = 2; int magic=0;
        int[][] vector = new int[3][3];
        int [] vector1 = new int[8];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Ingrese número entre 1 y 9. le falta "+ (num1--) +" números por ingresar." );
                    num = input.nextInt();
                    if (num > 9 || num < 1) {num1++;}
                } while (num > 9 || num < 1);
                vector[i][j] = num;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    s += vector[i][j]; //sumo la primera diagonal 
                } 
                if (j < 3) {
                    s2 += vector[i][j]; //sumo las columnas 
                } 
                if (j == 2) {
                    vector1[aux] = s2; // vector auxiliar para guardar las sumas 
                    s2 = 0;
                    aux++;
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j < 3) {
                    s2 += vector[j][i]; // sumo las filas  
                }
                 if (j == 2) {
                    vector1[aux] = s2;
                    s2 = 0;
                    aux++;
                }
            }  
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 2; 0 <= j; j =- 2) {
                if (i == 0) {
                    s2 += vector[j][i]; //Diagonal invertida 
                } else {
                    inv--;
                    s2 += vector[inv][i];
                }
            }
        }
        
        vector1[6]=s; vector1[7]=s2; // sumo al vector auxiliar las sumas diagonales 
        
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(vector[j][i]+" ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 7; i++) {
            if (vector1[i] == vector1[i+1]){magic++;} // comparo el vector de los resultados de las sumas 
        }
        
        System.out.println("");
        
        if (magic != 7) {
            System.out.println("El cuadrado no es mágico");
        } else {
            System.out.println("El cuadrado es mágico");
        }
        
    }
}
