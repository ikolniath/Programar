//Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
package Guia4;

import java.util.Scanner;


public class E2 {


    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de usuarios que desea ingresar\n Ingrese el número");
        int num = input.nextInt();
        
        nombre(num);
    }
    
    public static void nombre(int num){
    
        for (int i = 0; i < num; i++) {
            
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el nombre");
            String nom = input.nextLine();
            System.out.println("Ingrese la edad");
            int edad = input.nextInt();
            
            if (edad < 18){
                System.out.println(nom +" tiene "+edad+", es menor de edad");
            } else {System.out.println(nom +" tiene "+edad+", es mayor de edad");}
            
            Scanner leer = new Scanner(System.in);
            System.out.println("Si no quiere ingresar más personas ingrese la palabra 'no'\nDe lo contrario, ingrese cualquier otra palabra");
            String op = leer.nextLine();
            
            if (op.equalsIgnoreCase("no")) { break;}
            
        }
    }
    
    
}
