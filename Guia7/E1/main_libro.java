
package Guia7.E1;



public class main_libro {

    public static void main(String[] args) {
        
        Libro libro = new Libro();
        libro.cargar();
        System.out.println(libro.toString());
        
        
        Libro libro1 = new Libro(5, "Cien años de soledad", "Gabriel Garcia Marquez", 500);
       
        System.out.println(libro1);
    }
    
   
    
}
