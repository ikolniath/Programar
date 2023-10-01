/*
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 */
package Guia8.E3.PersonaServicio;

import Guia8.E3.Persona.Persona;
import java.util.Scanner;

public class PersonaServicio {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
   public boolean esMayorDeEdad(Persona P1){
       
       return P1.getEdad() >= 18;
       
   }
    
   public Persona creaPersona(){
       
       System.out.println("Ingrese Nombre");
       String nombre = input.next();
       System.out.println("Ingrese edad");
       int edad = input.nextInt();
       String sexo;
       do{
       System.out.println("Ingrese sexo\nPara Masculino ingrese M/m\nPara femenino ingrese F/f\nPara otro genero ingrese O/o");
       sexo = input.next();
       }while(!"m".equalsIgnoreCase(sexo) && !"f".equalsIgnoreCase(sexo) && !"o".equalsIgnoreCase(sexo));
       
       System.out.println("Ingrese peso en kilogramos, use coma para los decimales (xx,xx)");
       double peso = input.nextDouble();
       System.out.println("Ingrese altura en metros, use coma para los decimales (xx,xx)");
       double altura = input.nextDouble();

       return new Persona(nombre, edad, sexo, peso, altura);
   }
   
   public int calcularIMC(Persona P1){
       
       double pesoIdeal = P1.getPeso()/Math.pow(P1.getAltura(),2);
       
       if (pesoIdeal < 20){
           return -1;
       } else if (pesoIdeal > 20 && pesoIdeal <= 25){
           return 0;  
       } else { return 1;}   
       
   }
   
   
  
   
    public void mensaje(int n, boolean x){
        
            if (x == false){
                System.out.println("Es menor de edad ");
            } else { System.out.println("Es mayor de edad");}
            
            if (n == -1){
                System.out.println("Esta por debajo de su peso ideal");
            } else if (n == 0){
                System.out.println("Esta en su peso ideal");
            }else {
                System.out.println("Esta por encima de su peso ideal");
            }
       
    } 
    
    public void mayor (boolean [] x){
        double mayor =0;
        double menor = 0;
        
        
         for (int i = 0; i < x.length; i++) {
            
            if (x [i] == true){menor++;}
            else {
                mayor ++;
            }   
        }
         System.out.println("El %"+mayor/x.length*100+" son mayores de edad. El %"+menor/x.length*100+" son menores de edad");
    }
    
    public void peso(int [] x){
        
        int pd = 0;
        int pi = 0;
        int pm = 0;
        
        
         for (int i = 0; i < x.length; i++) {
            
            if (x [i] == -1 ){
                pd ++;
            } else if(x[i] == 0) {
                pi ++;
            }
            else {pm++;}   
        }
        
         
         System.out.println(pd+" Estan debajo de su peso");
         System.out.println(pi+" Estan en su peso ideal");
         System.out.println(pm+" Estan por encima de su peso");
         
    }
    

}
