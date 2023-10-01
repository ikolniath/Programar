//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para cargar un Libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del Libro y el número de páginas.
package Guia7.E1;

import java.util.Scanner;

public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numero_pagina;
    
    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int Numero_pagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numero_pagina = Numero_pagina;
    }
    

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumero_pagina() {
        return numero_pagina;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.autor = Autor;
    }

    public void setNumero_pagina(int Numero_pagina) {
        this.numero_pagina = Numero_pagina;
    }
    
    Scanner input = new Scanner(System.in);
    
    public void cargar() {

        
        System.out.println("Ingrese el ISBN");
        this.ISBN = input.nextInt();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Titulo");
        this.titulo = leer.nextLine();
        System.out.println("Ingrese el Autor");
        this.autor = leer.nextLine();
        System.out.println("Ingrese Número de Página");
        this.numero_pagina = input.nextInt();

    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN= " + ISBN + ", titulo= " + titulo + ", autor= " + autor + ", numero_pagina= " + numero_pagina + '}';
    }
    
   
}

