//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
package Guia3;

public class Ex2 {

    public static void main(String[] args) {
        
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int Aux = B; 
        
        System.out.println("A= "+A+ " B= "+B+ " C= "+C+" D= "+D);
            
        B = C;
        C = A;
        A = D;
        D = Aux; 
         
        System.out.println("A= "+A+ " B= "+B+ " C= "+C+" D= "+D);

        
    }
    
}
