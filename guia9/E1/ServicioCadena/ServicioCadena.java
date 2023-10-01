/*
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras ?a? que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package guia9.E1.ServicioCadena;

import guia9.E1.Cadena.Cadena;
import java.util.Scanner;


public class ServicioCadena {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    
    private Cadena ingresarFrase(){
        
        System.out.println("Ingrese una frase");
        String frase = input.nextLine();
        
        return new Cadena(frase);
    }
    
    public void mostrarVocales(){
        
        Cadena cad = ingresarFrase();
        int conteo = 0;
        //int longitud = Array.getLength(le);
        int longitud = cad.getLongitud();
        
        for (int i = 0; i < longitud; i++) {
                char l = cad.getFrase().charAt(i);
            if ('a'== l || 'e'== l || 'i'== l || 'o'== l || 'u'== l ){conteo++;}
        }
        
        System.out.println("La cantidad de vocales son "+conteo);
    }
    
    public void invertirFrase(){
        
        Cadena cad = ingresarFrase();
        int conteo = cad.getLongitud();
        char [] frase = new char[cad.getLongitud()];
        
        for (int i = 0 ; i < cad.getLongitud(); i++) {
                char l = cad.getFrase().charAt(i);
                conteo--;                
                frase[conteo] = l;
                
        }
        
        String alreves = new String(frase);
        System.out.println(frase);
        
        for (int i = 0; i < cad.getLongitud(); i++) {
            System.out.print(frase[i]);
        }
        System.out.println("");
    }
    public void vecesRepetido(){
        
        Cadena cad = ingresarFrase();
        System.out.println("Ingrese la letra a buscar");
        String letra = input.next();
        
        char le = letra.charAt(0);
        
        int conteo = 0;
        //int longitud = Array.getLength(le);
        int longitud = cad.getLongitud();
        
        for (int i = 0; i < longitud; i++) {
                char l = cad.getFrase().charAt(i);
            if (l== le ){conteo++;}
        }
        
        System.out.println("La letra "+letra+ " se repite "+conteo+ " veces.");
    }
    
        public void compararLongitud(){
        
        Cadena cad = ingresarFrase();
        System.out.println("Ingrese la frase a comparar");        
        int igual = cad.getFrase().compareTo(input.nextLine());
        
        if (igual == 0){
            System.out.println("La frases son iguales ");}
        else{System.out.println("La frase no son iguales");}
        
    }
        
         public void unirFrase(){
            
            Cadena cad = ingresarFrase();
            System.out.println("Ingrese la otra frase");
            
             System.out.println(cad.getFrase().concat(" "+input.nextLine()));
             
        }
         
         public void reemplazar(){
             
             Cadena cad = ingresarFrase();
             System.out.println("ingrese la letra para cambiar");
             String letra = input.next();
             char le = letra.charAt(0);
             
             String frase = cad.getFrase().replace('a', le);
             
             System.out.println(frase);
             
         }
         
         
         public void contiene(){
           Cadena cad = ingresarFrase();
           System.out.println("ingrese la letra para buscar");
           String letra = input.next();
           //char le = letra.charAt(0);
           
           System.out.println("la letra se encuentra "+cad.getFrase().contains(letra));
         }
          
        
}
