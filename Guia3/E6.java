//Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
package Guia3;

import java.util.Scanner;



public class E6 {

    public static void main(String[] args) {

        int op = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = input.nextInt();
        System.out.println("Ingrese segundo número");
        int num1 = input.nextInt();
        System.out.println("");

        while (op != 5) {

            System.out.println("");
            System.out.println("Ingrese una opción");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.println("La suma de " + num + "+" + num1 + " = " + (num + num1));
                    op = 0;
                    break;
                case 2:
                    System.out.println("La resta de " + num + "-" + num1 + " = " + (num - num1));
                    op = 0;
                    break;
                case 3:
                    System.out.println("La multiplicación de " + num + "*" + num1 + " = " + (num * num1));
                    op = 0;
                    break;
                case 4:
                    System.out.println("La división de " + num + "/" + num1 + " = " + (num / num1));
                    op = 0;
                    break;
                case 5:
                    System.out.println("Realmente desea salir oprima (s/S)");
                    Scanner leer = new Scanner(System.in);
                    String salida = leer.nextLine();
                    if (!salida.equalsIgnoreCase("s")) {
                        System.out.println("Usted seguira en el programa");
                        op = 0;
                    } else {
                        System.out.println("Gracias por usar el programa");
                        op = 5;
                    }
                    break;
                default:
                    System.out.println("Usted ingreso opción incorrecta");
                    op = 0;
                    break;

            }

        }

    }

}
