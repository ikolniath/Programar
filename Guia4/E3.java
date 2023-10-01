//Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
package Guia4;

import java.text.DecimalFormat;
import java.util.Scanner;


public class E3 {

    public static void main(String[] args) {
        String op;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los euros a convertir");
        double euros = input.nextDouble();
        
        do{
        System.out.println("Ingrese la divisa convertir");
        System.out.println("Ingrese la opción a elegir");
        System.out.println("a. Dolar");
        System.out.println("b. Yen");
        System.out.println("c. Libras");
        op = input.next();  
        } while ((!"a".equalsIgnoreCase(op)) && (!"b".equalsIgnoreCase(op)) && (!"c".equalsIgnoreCase(op)));
                
        cambio(euros, op);
              
    }
    
    public static void cambio(double moneda, String op){
        
        DecimalFormat df = new DecimalFormat("#.00");
        if (op.equalsIgnoreCase("a")){ System.out.println("La cantidad de Euros, a dólares son: "+(df.format(moneda*1.28611))); }
        else if (op.equalsIgnoreCase("b")){System.out.println("La cantidad de Euros, a Yenes son: "+(df.format(moneda*129.852)));}
        else if(op.equalsIgnoreCase("c")){System.out.println("La cantidad de Euros, a libra son: "+(df.format(moneda*0.86)));}
        
    }
    
}
