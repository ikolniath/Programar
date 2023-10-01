
package Guia7.E2;

import java.util.Scanner;

public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crear(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        double nuevo_radio = input.nextDouble();
        setRadio(nuevo_radio);
        
    }
    
    public double area(){
        
        return (Math.PI*Math.pow(this.radio, 2));
    }
    
        public double perimetro(){
        
        return (2*Math.PI*this.radio);
    }

    @Override
    public String toString() {
        return "El area es = "+ area() + "\nEl perimetro es = "+perimetro();
    }
    
    
      
}
