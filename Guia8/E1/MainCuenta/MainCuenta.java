package Guia8.E1.MainCuenta;

import Guia8.E1.CuentaBancaria.CuentaBancaria;
import Guia8.E1.CuentaBancariaServicio.CuentaBancariaServicio;

public class MainCuenta {

    public static void main(String[] args) {
        
        CuentaBancariaServicio N = new CuentaBancariaServicio();
        CuentaBancaria C = N.crearCuenta();        
        //C.setSaldoActual(N.ingresarBancaria(C.saldo()));
        N.ingresar(C);
        N.retirar(C);
        N.extracionRapida(C);
        N.mostrarSaldo(C);
        N.mostrarDatos(C);
        System.out.println(C.toString());
        
        
        
    }
    
}
