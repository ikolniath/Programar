
package Guia7.E4;

public class Main_rectangulo {


    public static void main(String[] args) {
        
        Rectangulo r = new Rectangulo();
        r.datos();
        System.out.println("El perimetro es "+ r.perimetro() );
        System.out.println("La superficies es "+ r.superficie() );
        r.dibujar();
        
        Rectangulo r1 = new Rectangulo(7,5);
        System.out.println("El perimetro es "+ r1.perimetro() );
        System.out.println("La superficies es "+ r1.superficie() );
        r1.dibujar();
    }
    
}
