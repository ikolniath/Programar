/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. 
 */
package guia9.E5.Persona1;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Persona1 {
    
    private String nombre;
    private Date Fecha;

    public Persona1() {
    }

    public Persona1(String nombre, Date Fecha) {
        this.nombre = nombre;
        this.Fecha = Fecha;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

//    @Override
//    public String toString() {
//
//        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//        return "La persona se llama " + nombre + ", su fecha de nacimiento es " + df.format(Fecha);
//    }

    @Override
    public String toString() {
        return "Persona1{" + "nombre=" + nombre + ", Fecha=" + Fecha + '}';
    }
    
    
    
  
    
}
