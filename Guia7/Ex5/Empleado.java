//Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
package Guia7.Ex5;

import java.util.Scanner;

public class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void Calcular_aumento(){
        
        double aumento = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        String n = input.nextLine();
        setNombre(n);
        
        System.out.println("Ingrese la edad del empleado");
        int e = input.nextInt();
        setEdad(e);
        
        System.out.println("Ingrese el salario del empleado");
        double s = input.nextDouble();
        setSalario(s);
        
        if (this.edad > 30) {
            aumento = this.salario*0.10;
        }
        
        if (this.edad < 30) {
            aumento = this.salario*0.5;
        }
        
        System.out.println(this.nombre + "con el aumento va a tener un salario de $"+(this.salario+aumento));
        
        
        
        
    }
}
