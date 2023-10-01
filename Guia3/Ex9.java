//Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas es el cociente.
package Guia3;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        int num = 0;
        int num1 = 0;
        int div = 0;

        do {

            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese dos numeros para dividir, el primero debe ser mayor al segundo");
            System.out.println("Ingrese el numero mayor");
            num = input.nextInt();
            System.out.println("Ingrese el número menor");
            num1 = input.nextInt();

        } while (num < num1);
        
        while (((num - num1) <= num) &  ((num - num1) >= 0) ) {
                    num  = num - num1;
                     div++;
            } 
        
        System.out.println(num+" "+div+" "+num1);
    }

}
