package Guia8.E2.MainCafetera;

import Guia8.E2.Cafetera.Cafetera;
import Guia8.E2.CafeteraServicio.CafeteraServicio;

public class MainCafetera {

    public static void main(String[] args) {
        
        Cafetera C1 = new Cafetera();
        CafeteraServicio Cs = new CafeteraServicio();
        C1.inicial();
        System.out.println(C1.toString());
        System.out.println("");
        
        Cs.agregarCafe(C1);
        System.out.println("");
        
        System.out.println(Cs.llenarCafetera(C1));
        System.out.println("");
        
        Cs.servirTaza(C1);
        System.out.println("");
        System.out.println(Cs.vaciarCafetera(C1));
        System.out.println("");
        
        
    }
    
}
