/*
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
 */
package guia9.E4.FechaService;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class FechaService {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Date FechaNacimiento(){
        
        System.out.println("Ingrese el día de nacimiento");
        int dia = input.nextInt();
        System.out.println("Ingrese el mes (en número) de nacimiento");
        int mes = input.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        int anio = input.nextInt();
        
        return new Date(anio-1900,mes-1,dia);
        
    }
    
    public Date fechaActual(){
        
        return new Date();
        
    }
    
    public void diferencia(Date x){
        
        Calendar fecha = new GregorianCalendar();
        Date fecha1 = new Date();
        
        System.out.println(fecha.getWeekYear());
        int anio = fecha.get(Calendar.YEAR);
        
        System.out.println("La diferencia de años entre la dos fechas es de: "+ (anio-x.getYear()) );
        
    }
    
}
