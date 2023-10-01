//Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
package Guia5;

import java.util.Scanner;

public class Ex2 {

    
    public static void main(String[] args) {
        int[] vec = new int[5];
        int[] vec1 = new int[5];
        boolean igual = false;
        
        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese 5 números del primer vector");
            int num = input.nextInt();
            vec[i] = num;
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese 5 números del segundo vector");
            int num = input.nextInt();
            vec1[i] = num;
        }
        
        for (int i = 0; i < 5; i++) {
            if (vec[i]==vec1[i]){igual = true;}
            else {igual = false; break;}
        }
        
        if (igual) { System.out.println("Los vectores son iguales");}
        else {System.out.println("Los vectores son diferentes");}
    }
    
}
