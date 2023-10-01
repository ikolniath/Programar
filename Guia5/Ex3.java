// Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.
package Guia5;

public class Ex3 {

    public static void main(String[] args) {
        int[] vec = new int[5];
            
        aleatorio(vec);
        mostrar(vec);
    }
    
    public static void aleatorio(int [] vec){
        
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random() * 10);
        }
    }
    
    public static void mostrar(int [] vec){
        for (int i = 0; i < vec.length; i++) {
            System.out.print("["+vec[i]+ "] ");
        }
        System.out.println("");
    }
    
}
