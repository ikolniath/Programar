package Guia7.Ex2;

public class Main_puntos {


    public static void main(String[] args) {
        
        Puntos P = new Puntos();
        P.crearpuntos();
        P.calcularpuntos();
        System.out.println(P.toString());
       
        Puntos P1 = new Puntos(5, 7, 10, 15);
        P1.calcularpuntos();
        System.out.println(P1.toString());

    }
    
}
