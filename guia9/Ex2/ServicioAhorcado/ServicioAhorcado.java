/*
Definir los siguientes métodos en AhorcadoService:
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
 */
package guia9.Ex2.ServicioAhorcado;


import guia9.Ex2.Ahorcado.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;


public class ServicioAhorcado {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    Ahorcado A = new Ahorcado();
    
    private void crearJuego(){
        
        System.out.println("Comienzo del juego\nIngrese la palabra a adivinar");
        String palabra = input.next().toLowerCase();
        System.out.println("Ingrese la cantidad de veces que puede intentar el jugador");
        A.setJugadasMaximas(input.nextInt());
        
        A.setPalabra(palabra.toCharArray());
        
    }
    
    public void mostrar(){
        
        System.out.println("La longitud de la palabra es: "+A.getPalabra().length);
    }
    
    public void buscar(char x){
        
        int flag = 0;
        
        for (int i = 0; i < A.getPalabra().length; i++) {
            
            if (A.getPalabra() [i] == x){
                flag++;
            }
        }
        
        
        if(flag != 0){System.out.println("La letra se encuentra en la palabra");}
        else {System.out.println("La letra no se encuentra en la palabra");}
        
    }
    
    public boolean encontrada(char x) {
            
        int flag = 0;
        int letras = A.getLetrasEncontradas();

        for (int i = 0; i < A.getPalabra().length; i++) {

            if (A.getPalabra()[i] == x) {
                flag++;
            }
        }

        A.setLetrasEncontradas(letras+flag);
        
        System.out.println("Usted ya encontro "+ A.getLetrasEncontradas() + " letras\nLe restan encontrar "+ (A.getPalabra().length-A.getLetrasEncontradas()) + " letras");
        return flag != 0;

    }

    
    public void intentos(){
        
        System.out.println("A usted le quedan "+ A.getJugadasMaximas() + " Intentos");
        
    }
    
    
    public void juego() {
        
        int fin = 0;
        int nr = 0;
        int conteo;
        char l;
        char [] repetidas = new char[100];
        
        crearJuego();
        mostrar();
        
        do {
            
            do {
                conteo = 0;
                System.out.println("");
                System.out.println("");
                System.out.println("Ingrese una letra a buscar");
                String letra = input.next().toLowerCase();
                l = letra.charAt(0);

                repetidas[nr] = l;

                for (char r : repetidas) {
                    if (r == l) {
                        conteo++;
                    }
                }

//                for (int i = 0; i < repetidas.length; i++) {
//                    if (repetidas[i] == l){conteo ++;}  
//                }
                nr++;

                if (conteo > 1) {
                    System.out.println("Usted ya ingreso esa letra\n");
                }

            } while (conteo > 1);
            
            
            
            buscar(l);
            if (!encontrada(l)) {
                A.setJugadasMaximas(A.getJugadasMaximas() - 1);
            }
            intentos();
            
            if (A.getJugadasMaximas()<1){
                System.out.println("");
                System.out.println("Usted se ha quedado sin intentos\nPERDIO!!!");
                fin++;
            }else if (A.getLetrasEncontradas() == A.getPalabra().length){
                System.out.println("");
                System.out.println("Usted Ha encontrado todas las letras de la palabra " + Arrays.toString(A.getPalabra()) + "\n¡¡USTED HA GANADO!!" );
                fin++;
            }

        } while (1 != fin);

    }
}
