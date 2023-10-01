/*
 Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.

 */
package guia9.E6.ServicioCursoG9;

import guia9.E6.CursoG9.CursoG9;
import java.util.Locale;
import java.util.Scanner;



public class ServicioCursoG9 {

    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public String[] cargarAlumnos() {

        String[] x = new String[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese el nombre del Alumno");
            x[i] = input.next();
        }

        
    
        return x;
    }

    public CursoG9 crearCurso() {

        System.out.println("Ingrese el nombre del Curso");
        String nombreCurso = input.nextLine();
        System.out.println("Indique las horas por día que da clase");
        int cantidadHorasPorDia = input.nextInt();
        System.out.println("Ingrese la cantidad de días por semana que da clase");
        int cantidadDiasPorSemana = input.nextInt();
        System.out.println("Indique si el turno es Mañana o Tarde");
        String turno = input.next();
        System.out.println("Ingrese el precio que cobra por hora de clase");
        double precioPorHora = input.nextDouble();

        return new CursoG9(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora, cargarAlumnos());

    }
    
    
    public void calcularGananciaSemanal(CursoG9 x){
        
        System.out.println("Las Ganancias semanal por el Curso es $"+ (x.getCantidadHorasPorDia()*x.getPrecioPorHora()*x.getCantidadDiasPorSemana()*x.getAlumnos().length));
        
    }
    
    
}
