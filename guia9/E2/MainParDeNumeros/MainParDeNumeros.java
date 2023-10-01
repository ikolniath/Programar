package guia9.E2.MainParDeNumeros;

import guia9.E2.ParDeNumerosService.ParDeNumerosService;

public class MainParDeNumeros {

    public static void main(String[] args) {
        
        ParDeNumerosService P1 = new ParDeNumerosService();
        
        P1.mostrarValores();
        System.out.println("El número mayor es: "+P1.devolverMayor());
        P1.calcularPotencia();
        P1.calcularRaiz();
    }
    
}
