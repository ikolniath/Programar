//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente
package Guia3;

import java.util.Scanner;

public class E8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero para el tamaño del cuadrado");
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.print("*");

            for (int j = 0; j < num - 1; j++) {

                if (i == 0) {
                    System.out.print(" *");

                } else if (i != 0 & i != num - 1) {
                    if (j == num - 2) {
                        System.out.print(" *");
                    } else {
                        System.out.print("  ");
                    }

                } else if (i == num - 1) {
                    System.out.print(" *");
                }

            }
            System.out.println("");
        }
    }

}
