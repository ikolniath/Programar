/*
Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRai?ces() y si devolvió? true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió? true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): este? método llamara? tieneRaices() y a tieneRai?z(), y mostrara? por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrara? un mensaje.
 */
package Guia8.Ex1.RaicesServicio;

import Guia8.Ex1.Raices.Raices;
import java.util.Scanner;

public class RaicesServicio {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Raices num(){
        
        System.out.println("Ingrese el número A");
        double numa = input.nextDouble();
        
        System.out.println("Ingrese el número A");
        double numb = input.nextDouble();
        
        System.out.println("Ingrese el número A");
        double numc = input.nextDouble();
        
        return new Raices(numa, numb, numc);
        
    }
    
    
    public double getDiscriminante(Raices X){
        
       double Dis = (Math.pow(X.getB(), 2))-(4*X.getA()*X.getC());       
       return Dis;
       
       
    }    
    
    public boolean tienesRaices(Double getDiscriminante){
        
        return getDiscriminante >= 0;
          
    }
    
     public boolean tienesRaiz(Double getDiscriminante){
        
        return getDiscriminante == 0;
          
    }
     
//     public double obtenerRaices(boolean tieneRaices, Raices X){
//         double num1 = 0;
//         double num2 = 0;
//         
//         if (tieneRaices){
//             num1 = ((-(X.getB())) - Math.sqrt(Math.pow(X.getB(), 2) - (4 * X.getA() * X.getC()))) / (2 * X.getA());
//             num2 = ((-(X.getB())) + Math.sqrt(Math.pow(X.getB(), 2) - (4 * X.getA() * X.getC()))) / (2 * X.getA());
//         }
//         
//         return num1;   
//     }
     
     
     
         public void obtenerRaices(Raices X){
         
         
            double num1 = ((-(X.getB())) - Math.sqrt(Math.pow(X.getB(), 2) - (4 * X.getA() * X.getC()))) / (2 * X.getA());
            double num2 = ((-(X.getB())) + Math.sqrt(Math.pow(X.getB(), 2) - (4 * X.getA() * X.getC()))) / (2 * X.getA());
         
             System.out.println("La solución 1 es: "+num1+"\nLa solución 2 es: "+num2);  
     }
         
         
      public void obtenerRaiz(Raices X){
       
            double num1 = (Math.pow(X.getB(), 2) - (4 * X.getA() * X.getC()));
         
             System.out.println("La solución es: "+num1);  
     }
    
      
      public void calcular(boolean tieneRaices, boolean tieneRaiz, Raices X){
          
          if (tieneRaices){
              obtenerRaices(X);
          } else if (tieneRaiz){
              obtenerRaiz(X);
          } else {System.out.println("No se obtienen raices");}
          
      }
      
}
