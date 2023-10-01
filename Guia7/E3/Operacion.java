
package Guia7.E3;

import java.util.Scanner;


public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crear_operacion(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese primer número");
        int num1 = input.nextInt();
        setNumero1(num1);
        System.out.println("Ingrese segundo número");
        int num2 = input.nextInt(); 
        setNumero2(num2);
    }
    
    public int suma (){
       return (this.numero1+this.numero2); 
    }
    
    public int resta (){
       return (this.numero1-this.numero2); 
    }
    
    public int multiplica() {

        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Usted ingreso un cero");
            return 0;
        } else {
            return (this.numero1 * this.numero2);
        }

    }

    public int division() {
        if ((this.numero1 == 0) || (this.numero2 == 0)) {
            System.out.println("Usted ingreso un cero");
            return 0;
        } else {
            return (this.numero1 / this.numero2);
        }
    }

    
    
    
}
