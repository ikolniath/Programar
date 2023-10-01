package Guia8.Ex1.MainRaices;

import Guia8.Ex1.Raices.Raices;
import Guia8.Ex1.RaicesServicio.RaicesServicio;

public class MainRaices {

    public static void main(String[] args) {
        
        RaicesServicio Rx = new RaicesServicio();
       
        Raices R1 = Rx.num();
        
        Rx.calcular(Rx.tienesRaices(Rx.getDiscriminante(R1)),Rx.tienesRaiz(Rx.getDiscriminante(R1)),R1);
        
        
    }
    
}
