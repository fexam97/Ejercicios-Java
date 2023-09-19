package com.softwarepeliculas.presentacion;

import com.softwarepeliculas.servicio.ControlPeliculasImpl;
import com.softwarepeliculas.servicio.IControlPeliculas;
import java.util.Scanner;

public class PresentacionControlPeliculas {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int opcion;
        IControlPeliculas controlPeliculas = new ControlPeliculasImpl(); // primero llamar a la interfaz, despues a la clase implementacion
        Scanner useDelimiter = teclado.useDelimiter("\n");
        
        System.out.println("------------------------------");
        System.out.println("SOFTWARE CONTROL DE PELICULAS ");
        System.out.println("------------------------------");
        
        do{
            
            System.out.println("1 - Iniciar control de peliculas : ");
            System.out.println("2 - Agregar pelicula : ");
            System.out.println("3 - Listar Pelicula");
            System.out.println("4 - Buscar pelicula");
            System.out.println("5 - Salir");
            
            System.out.print("\n Ingrese una opcion : ");
            opcion = teclado.nextInt();
            
            System.out.println("\n");
            
            switch (opcion) {
                case 1:
                    controlPeliculas.iniciarControlDePeliculas();
                    break;
                case 2:
                    System.out.println("\n Ingrese el nombre de la pelicula");
                    String nombrePelicula = teclado.nextLine();
                    controlPeliculas.agregarPelicula(nombrePelicula);
                    System.out.println("Pelicula agregada con exito ! \n");
                    break;
                case 3:
                    System.out.println("");
                    controlPeliculas.listarPeliculas();
                    
                    break;
                case 4:
                    System.out.println("\n Ingrese pelicula a buscar : ");
                    String peliculaABuscar = teclado.next();
                    controlPeliculas.buscarPelicula(peliculaABuscar);
                    break;
                case 5:
                    System.out.println("-----------------------------------");
                    System.out.println("Gracias por usar nuestros servicios1");
                    System.out.println("------------------------------------");
                    opcion = 5;
                    break;
                default:
                    System.out.println("-------------------------");
                    System.out.println("error, vuelva a ingresar ");
                    System.out.println("-------------------------");
                    break;
            }
            
        }while(opcion != 5);
    }
}
