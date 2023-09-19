
package ejercicio7;

import java.util.Scanner;

/*
    Crear una clase Libro que contenga los siguientes atributos:
    ISBN Titulo Autor Número de páginas

    Crear sus respectivos métodos getters y setters correspondientes para cada
    atributo. Crear el método toString() para mostrar la información relativa al libro con el
    siguiente formato:

    "El libro su_título con ISBN su_ISBN creado por el autor su_autor tiene num_paginas páginas"
    En el main, crear 2 objetos Libro, los valores que se quieran, y mostrarlos por
    pantalla. Por último, indicar cuál de los 2 tiene más páginas.

*/
public class main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Libro libroUno;
        Libro libroDos;
        
        int isbn;
        int numeroPaginas;
        String autor;
        String titulo;
        
        
        System.out.println("\n\n LIBRO 1:");
        
        System.out.print("Ingrese el International Standard Book Number: ");
        isbn = teclado.nextInt();
        
        System.out.print("Ingrese el titulo: ");
        titulo = teclado.next();
        
        System.out.print("Ingrese el autor: ");
        autor = teclado.next();
        
        System.out.print("Ingrese el numero de paginas: ");
        numeroPaginas = teclado.nextInt();
                
        libroUno = new Libro(isbn, titulo, autor, numeroPaginas);
        System.out.println(libroUno.toString());
        
        
        System.out.println("\n\n LIBRO 2: ");
        
        System.out.print("Ingrese el International Standard Book Number: ");
        isbn = teclado.nextInt();
        
        System.out.print("Ingrese el titulo: ");
        titulo = teclado.next();
        
        System.out.print("Ingrese el autor: ");
        autor = teclado.next();
        
        System.out.print("Ingrese el numero de paginas: ");
        int numeroPaginas2 = teclado.nextInt();
                
        libroDos = new Libro(isbn, titulo, autor, numeroPaginas);
        System.out.println(libroDos.toString());
        
        if(libroUno.getNumeroPaginas() > libroDos.getNumeroPaginas())
            System.out.println("El libro " + libroUno.getTitulo() + " tiene mas paginas");
        else
            System.out.println("El libro " + libroDos.getTitulo() + " tiene mas paginas");
    }
    
}
