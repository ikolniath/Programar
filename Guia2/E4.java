package Guia2;

import java.util.Scanner;

 class E4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la temperatura a pasar a °Farenheit ");
        double grados = input.nextDouble();
        
        double F = 32 + (9*grados/5);
        
        System.out.println("Los grados centigrados en Fareneheit son: "+ F);
    }
    
}
