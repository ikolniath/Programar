
package Guia7.E3;


public class Main_operacion {


    public static void main(String[] args) {
        
        Operacion cuentaOperacion = new Operacion();
        cuentaOperacion.crear_operacion();
        System.out.println("la suma es "+ cuentaOperacion.suma());
        System.out.println("La resta es "+cuentaOperacion.resta()); 
        System.out.println("La multiplicación es " +cuentaOperacion.multiplica());
        System.out.println("La División es "+ cuentaOperacion.division());
                
        
        
    }
    
}
