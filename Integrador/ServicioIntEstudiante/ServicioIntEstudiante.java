/*
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.
1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
 */
package Integrador.ServicioIntEstudiante;

import Integrador.IntEstudiante.IntEstudiante;
import java.util.Scanner;

public class ServicioIntEstudiante {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    private IntEstudiante cargar() {

        int nota = 0;

        System.out.println("Ingrese el nombre del estudiante");
        String nombre = input.next();
        do {
            System.out.println("Ingrese la nota del estudiante entre 1 y 10");
            nota = input.nextInt();

        } while (nota < 1 || nota > 10);

        return new IntEstudiante(nombre, nota);
    }

    public String[] promedio() {

        int prom = 0;
        int con = 0;

        System.out.println("Ingrese la cantidad de alumnos a cargar");
        IntEstudiante[] alumnos = new IntEstudiante[input.nextInt()];

        for (int i = 0; i < alumnos.length; i++) {

            alumnos[i] = cargar();
            prom += alumnos[i].getNota();
        }

        System.out.println(prom);
        prom = prom / alumnos.length;

        System.out.println("El promedio general es de: " + prom);

        for (IntEstudiante al : alumnos) {

            if (al.getNota() > prom) {
                System.out.println("El Alumno " + al.toString() + "\nConsiguió una nota mayor al promedio!");
                con++;
            }
        }

        String[] Alprom = new String[con];
        con = 0;

        for (int i = 0; i < alumnos.length; i++) {

            if (alumnos[i].getNota() > prom) {
                Alprom[con] = alumnos[i].getNombre();
                con++;
            }
        }

        return Alprom;

    }
    
    
    
}
