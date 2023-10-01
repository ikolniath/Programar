/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales.
 */
package guia9.E3.MainArreglo;

import guia9.E3.ArregloServicio.ArregloServicio;

public class MainArreglo {

    public static void main(String[] args) {
    
        double [] A = new double[50];
        double [] B = new double[20];
        
        ArregloServicio A1 = new ArregloServicio();
        
        A1.incializarA(A);
        A1.mostra(A);
        A1.ordenar(A);
        A1.IncializarB(A, B);
        A1.mostra(A);
        A1.mostra(B);
    }
    
}
