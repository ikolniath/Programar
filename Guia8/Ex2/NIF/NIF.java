/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra (String o char) que le corresponde. En NIFService se dispondrá de los siguientes métodos:
 */
package Guia8.Ex2.NIF;

public class NIF {
    private long Dni;
    private char letra; 

    public NIF() {
    }

    public NIF(long Dni, char letra) {
        this.Dni = Dni;
        this.letra = letra;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Su DNI, con digito NIF es: " + Dni + "-"+letra;
    }
    
    
    
}
