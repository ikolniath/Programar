/*Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.*/

package Guia5;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double n4 = 0;
        double prom;
        int contador = 0;
        String op;
        double[] nota = new double[50];

        do {

            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese las notas para promediar al alumno, las notas deben ser entre 1 y 10");
            do {
                System.out.println("Primer trabajo práctico evaluativo, recuerde entre 1 y 10");
                n1 = input.nextDouble();

            } while (n1 < 0 || n1 > 10);
            do {
                System.out.println("Segundo trabajo práctico evaluativo, recuerde entre 1 y 10");
                n2 = input.nextDouble();

            } while (n2 < 0 || n2 > 10);
            do {
                System.out.println("Primer Integrador, recuerde entre 1 y 10");
                n3 = input.nextDouble();

            } while (n3 < 0 || n3 > 10);
            do {
                System.out.println("Segundo Integrador, recuerde entre 1 y 10");
                n4 = input.nextDouble();

            } while (n4 < 0 || n4 > 10);

            prom = (n1 + n2 + n3 + n4) / 4;
            nota[contador] = prom;

            contador++;

            do {
                System.out.println("Desea cargar otro alumno? Para si ingrese S/s, para ver los promedios ingrese N/n");
                op = input.next();
            } while (!"s".equalsIgnoreCase(op) && !"n".equalsIgnoreCase(op));

        } while (!"n".equalsIgnoreCase(op));

        n1 = 0;
        n2 = 0;

        for (int i = 0; i < contador; i++) {

            if (nota[i] >= 7) {
                n1++;
            } else {
                n2++;

            }

        }
        
        System.out.println(" la cantidada de alumnos aprobados es: "+ n1);
        System.out.println(" la cantidad de alumnos desaprobados es: "+n2);

    } 

}
