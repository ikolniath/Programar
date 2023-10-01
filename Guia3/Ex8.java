// Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
package Guia3;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        int flag = 0;
        int par = 0;
        int impar = 0;
        int total = 0;
        int num = 0;
        do {

            Scanner input = new Scanner(System.in);
            do {
                System.out.println("Ingrese número mayores a cero (0). Al final el programa mostrara lo número pares e impares y la cantidad total");
                System.out.println("El programa finaliza con números multiplos de 5");
                num = input.nextInt();
            } while (num < 1);
            if (num % 5 != 0) {
                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
                total++;
                System.out.println("número correcto");
            } else {
                flag = 1;
            }

        } while (flag != 1);
        System.out.println("la cantidad de número pares son: " + par + "\nLa cantidad de números impares son: " + impar + "\nLa cantidad total de números es: " + total);
    }

}
