//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
package Guia4;

import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {
        int op = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = input.nextInt();
        System.out.println("Ingrese segundo número");
        int num1 = input.nextInt();
        System.out.println("");

        System.out.println("");
        System.out.println("Ingrese una opción");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        op = input.nextInt();

        switch (op) {
            case 1:
                int suma = suma(num, num1);
                System.out.println("La suma de " + num + "+" + num1 + " = " + suma);
                break;
            case 2:
                int resta = resta(num, num1);
                System.out.println("La resta de " + num + "-" + num1 + " = " + resta);
                break;
            case 3:
                int multiplica = multiplicar(num, num1);
                System.out.println("La multiplicación de " + num + "*" + num1 + " = " + multiplica);
                break;
            case 4:
                int dividir = dividir(num, num1);
                System.out.println("La división de " + num + "/" + num1 + " = " + dividir);
                break;
            default:
                System.out.println("Usted ingreso opción incorrecta");
                break;

        }
    }

    public static int suma(int n, int n1) {
        int x = n + n1;
        return x;
    }

    public static int resta(int n, int n1) {
        int x = n - n1;
        return x;
    }

    public static int multiplicar(int n, int n1) {
        int x = n * n1;
        return x;
    }

    public static int dividir(int n, int n1) {
        int x = n / n1;
        return x;
    }
}
