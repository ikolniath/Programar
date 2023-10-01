/*
Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */
package guia9.E5.Persona1Servicio;
import guia9.E5.Persona1.Persona1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;





public class Persona1Servicio {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    // Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
        Persona1 P1 = new Persona1();
    
    public void crearPersona() throws ParseException{
        
        System.out.println("Ingrese su nombre");
        String nombre = input.nextLine();
        System.out.println("Ingrese Fecha de nacimiento, con el siguiente formato\nDia/Mes/Año (todo en formato númerico, con '/' para separar)");
        String fe = input.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha1 = df.parse(fe);
        
        
        P1.setFecha(fecha1);
        P1.setNombre(nombre);
        
//        Date actual = new Date();
        
//        long fecha3 = actual.getTime();
//        long fecha2 = fecha1.getTime();
//        Long diasDesde = (long) Math.floor(fecha2 / (1000*60*60*24));
//        Long diasHasta = (long) Math.floor(fecha3 / (1000*60*60*24));
        
//        System.out.println(fecha2+ " " + diasDesde+" "+actual);
//        
//        System.out.println((diasHasta-diasDesde)/365+" Años");
//        
//        System.out.println(P1.toString());
 
    }
    
    
    public Persona1 crearPersona1(){
        
        System.out.println("Ingrese su nombre");
        String nombre = input.nextLine();
        System.out.println("Ingrese el año de nacimiento, en formato (1989)");
        int anio = input.nextInt();
        System.out.println("Ingrese el mes de nacimiento en formato número, ejemplo: 1 para enero");
        int mes = input.nextInt();
        System.out.println("Ingrese el día en número de nacimiento ");
        int dia = input.nextInt();
        
        Date fecha = new Date(anio,mes,dia);
                
        return new Persona1(nombre,fecha);
    }
    
    public int calcularEdad(Persona1 P1){
       
        
        LocalDate actual =  LocalDate.now();
        
        //int edad = actual.getYear() - (P1.getFecha().getYear()+1900);
        
        int edad = actual.getYear() - P1.getFecha().getYear();
        
        if (actual.getMonthValue() >= P1.getFecha().getMonth()){
                if (actual.getDayOfMonth() >= P1.getFecha().getDay()){
                    edad--;}    
        } 
        
        return edad;
        
    }
    
    public boolean menorQue(Persona1 x){
        
        System.out.println("Ingrese la edad a comparar");
        int edad = input.nextInt();
        
        return (edad > calcularEdad(x));
        
        
    }
    
    
    public void mostraPersona(){
        
        System.out.println(P1.toString());
        
    }
    
}
