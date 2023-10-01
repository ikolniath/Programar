//Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
package Guia7.Ex2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Puntos {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double distancia;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    public void crearpuntos(){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero cordenada x1");
        int p1 = input.nextInt();
        setX1(p1);
        System.out.println("Ingrese el número coordenada y1");
        int p2 = input.nextInt();
        setY1(p2);
        System.out.println("Ingrese la número de la coordenada x2");
        int f1 = input.nextInt();
        setX2(f1);
        System.out.println("Ingrese el número de la coordenada Y2");
        int f2 = input.nextInt();
        setY2(f2);
        
        
    }
    
    public double calcularpuntos(){
        
        double puntox = Math.pow((this.x2-this.x1),2);
        double puntoy = Math.pow((this.y2-this.y1),2);
        
        this.distancia = Math.sqrt(puntox+puntoy);
        return distancia;
        
    }


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "La distancia entre los puntos es: " + df.format(distancia);
    }
    
    
    
}
