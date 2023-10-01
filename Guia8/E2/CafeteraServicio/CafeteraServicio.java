/*
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café ?no alcanza? para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Guia8.E2.CafeteraServicio;
import Guia8.E2.Cafetera.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public String llenarCafetera(Cafetera Caf){
        
        if (Caf.getCapacidadActual() < Caf.getCapacidadMaxima()){
            Caf.setCapacidadActual(Caf.getCapacidadMaxima());
            return "La cafetera quedo llena al máximo";
        } else { return "la cafetera está al Máximo";}        
    }
    
    public void servirTaza(Cafetera Caf){
        
        int taza =0;
        do{
        System.out.println("Indique el Tamaño de su taza a llenar\n* 125 ml \n* 150 ml \n* 200 ml\nIngrese solamente el número de las opciones, no acepta otra opción!");
        taza = input.nextInt();   
        
        }while(taza != 150 && taza != 125 && taza != 200);
        
        if (Caf.getCapacidadActual() >= taza ){
            Caf.setCapacidadActual(Caf.getCapacidadActual()-taza);
            System.out.println("La taza quedo llena");
        } else if (Caf.getCapacidadActual() < taza){
            taza = Caf.getCapacidadActual();
            Caf.setCapacidadActual(0);
            System.out.println("La taza solo se pudo llenar con "+taza+"ml.");
        }                
    }
    
    public String vaciarCafetera(Cafetera Caf){
        
        Caf.setCapacidadActual(0);
        return "La cafetera ha quedado vacia";
        
    }
    
    public void agregarCafe(Cafetera Caf){
        
        int llenar = 0;
        System.out.println("La cafetera tiene " +Caf.getCapacidadActual()+"ml. El máximo de la cafetera es "+Caf.getCapacidadMaxima()+"ml.");
        do {            
            System.out.println("Ingrese la cantidad de Cafe a ingresar, recuerde no superar la capacidad máxima");
            llenar = input.nextInt();
        } while ((llenar+Caf.getCapacidadActual()) > Caf.getCapacidadMaxima());
        
        Caf.setCapacidadActual(llenar+Caf.getCapacidadActual());
        System.out.println("La capacidad de la cafetera actual es "+Caf.getCapacidadActual()+"ml.");
    }
}
