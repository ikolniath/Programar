/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package Guia3;


//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
import java.util.Scanner;



public class E7 {
    /*public static void limpiarant() {
        try {
            System.out.println("Presione enter para continuar...");
            new java.util.Scanner(System.in).nextLine();

            Robot preesbot = new Robot();
            preesbot.keyPress(KeyEvent.VK_CONTROL);
            preesbot.keyPress(KeyEvent.VK_L);
            preesbot.keyRelease(KeyEvent.VK_CONTROL);
            preesbot.keyRelease(KeyEvent.VK_L);
        } catch (AWTException ex) {
            System.out.println("" + ex.getMessage());
        }
    }*/

    public static void main(String[] args) {
        
           

        int correcta = 0;
        int incorrecta = 0;
        String frase;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese cadenas de 5 caracteres\nLa cadenas correctas deben comenzar con 'x' y terminar con 'o'\nPara terminar el programa debe ingresar '&&&&&'\nAl final daremos la secuencias correctas ingresadas");
            System.out.println("Ingrese caracteres");
            frase = input.nextLine();

            String primera = frase.substring(0, 1);
            int num = frase.length();
            String ultima = frase.substring(num - 1, num);
            

            if (primera.equalsIgnoreCase("x") & (ultima.equalsIgnoreCase("o") & (num <= 5))) {
                    correcta++; 

            } else {
                if (!"&&&&&".equals(frase)){incorrecta++;}
            }
            
            System.out.println("");
            System.out.println("");
            
            //limpiarant();
            
        } while (!"&&&&&".equals(frase));
        
        System.out.println("La cantidad de cadenas correctas: "+correcta+"\nLa cantidad de cadenas Incorrectas: "+incorrecta);

    }


}
