//Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
package Guia7.Ex4;

import java.util.Scanner;

public class Cuenta {
    
    private String titular = "Pepito Perez";
    private double saldo = 100000;

    public Cuenta() {
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void retirar_dinero(){
        
        
        System.out.println(this.titular+" Su saldo actual es $"+this.saldo);
        System.out.println("");
        System.out.println("¿Cuanto desea retirar?\nRecuerde que para centavos debe usar la coma (xxx,00)");
        Scanner input = new Scanner(System.in);
        double retira = input.nextDouble();
        
        if ((this.saldo-retira) < 0){
            System.out.println("Usted intenta retirar un monto superior a su saldo"); 
            retira = 0;
        }
        
        System.out.println("");
        System.out.println(this.titular +" su saldo $" + (this.saldo-retira));
        
    }
    
}
