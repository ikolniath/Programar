//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
package Guia3;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        int num = 0;
        int flag = 0;
        int aux = 0;
        int aux2 = 0; 
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de números a introducir, mayor a 0");
            System.out.println("Le indicaremos el mayor y el menor número ingresado");
            num = input.nextInt();

        } while (num < 1);
           
       /* while (flag != num){
            
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese su número");
            int num1 = input.nextInt();
            flag ++;
            
            if (aux2 == 0){aux2 = num1;}
            
            if (num1 > aux ) { aux = num1; }
            else if (num1 < aux2 ){aux2 = num1;}
        } */
        
        do {
           Scanner input = new Scanner(System.in);
            System.out.println("Ingrese su número");
            int num1 = input.nextInt();
            flag ++;
            
            if (aux2 == 0){aux2 = num1;}
            
            if (num1 > aux ) { aux = num1; }
            else if (num1 < aux2 ){aux2 = num1;}
            
        } while (flag != num);
        
        System.out.println("El número mayor ingresado es: "+aux+"\nEl número menor ingresado es: "+aux2);
        
        
    }

}
