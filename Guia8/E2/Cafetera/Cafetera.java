//Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters.
package Guia8.E2.Cafetera;

public class Cafetera {
    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    public void inicial(){  
        setCapacidadActual(500);
        setCapacidadMaxima(1000);   
    }

    @Override
    public String toString() {
        return "La carga actual de la cafetera es "+capacidadActual+"ml.\nLa capacidad máxima es "+capacidadMaxima+"ml.";
    }
    
    
    
    
}
