/*
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package guia9.E2.ParDeNumerosService;

import guia9.E2.ParDeNumeros.ParDeNumeros;
import java.text.DecimalFormat;

public class ParDeNumerosService {
    
    DecimalFormat df = new DecimalFormat("#.00");
    ParDeNumeros n1 = new ParDeNumeros();
    
    public void mostrarValores(){
        
        System.out.println("El primer numero random es: "+df.format(n1.getNum1())+"\nEl segundo número random es: "+n1.getNum2());
        
    }
    
    public double devolverMayor(){
        
//       if (n1.getNum1() > n1.getNum2()) {return n1.getNum1();}
//       else {return n1.getNum2();}
       
       return Math.max(n1.getNum1(), n1.getNum2());
    }
    
    public void calcularPotencia(){
        
        if (n1.getNum1() > n1.getNum2()) { System.out.println("El número "+Math.round(n1.getNum1()) +" elevado a la "+Math.round(n1.getNum2()) +" es igual a: " + df.format(Math.pow(Math.round(n1.getNum1()),Math.round(n1.getNum2()))));}
       else { System.out.println("El número "+ Math.round(n1.getNum2())+" elevado a la "+Math.round(n1.getNum1()) +" es igual a: " + df.format(Math.pow(Math.round(n1.getNum2()),Math.round(n1.getNum1()))));}
    }
    
    public void calcularRaiz(){
        
        if (n1.getNum1() > n1.getNum2()) { System.out.println("La raíz cuadrada del número "+df.format(n1.getNum2())+" es igual "+ (int) Math.sqrt((int) n1.getNum2()));}
       else {  System.out.println("La raíz cuadrada del número "+df.format(n1.getNum1())+" es igual "+ (int) (Math.sqrt((int) n1.getNum1())));}
        
        //double num  = Math.random()*(5-(-6))-6;
        //double num1 = (Math.random()*21)-10;
        
    }
    
}
