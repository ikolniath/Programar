//Una obra social tiene tres clases de socios:
/*Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.*/

package Guia3;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la letra del tipo de socio");
        String socio = input.next();
        System.out.println("Ingrese el valor real, para los decimales use ','(coma)");
        float valor = input.nextFloat();

        switch (socio.toLowerCase()) {
            case "a":
                System.out.println("El socio debe abonar $" + (valor * 0.50));
                break;
            case "b":
                System.out.println("El socio debe abonar $" + (valor * 0.35));
                break;
            case "c":
                System.out.println("El socio debe abonar $" + (valor));
                break;
            default:
                System.out.println("Ingrese un tipo de socio valido");
        }

    }

}
