package arreglos;

import java.util.Scanner;

/*
desarrollar un programa que permita cargar 5 nombres de personas y sus edades respectivas.
luego de realizar la carga por teclado de todos los datos,
imprimir los nombres de las personas mayores de edad (mayores o iguales a 18 años).
*/

public class Ejercicio9
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        // pide que ingrese los datos, necesitare dos vectores. uno de string y otro de int.
        
       String personas[] = new String[5];
       int edades[] = new int[5];
       
       
       // vamos a cargar los datos.
       
       for(int i = 0 ; i < edades.length ; i++)
       {
           System.out.print("nombre nro " + i + " : ");
           personas[i] = teclado.next();
           
           do{
           System.out.print("Edad:");
           edades[i] = teclado.nextInt(); 
           }while( edades[i] < 0);
           
           System.out.println("");
       }
       
       // ahora vamos a imprimir.
       
        System.out.println("personas mayores de 18 años:");
       
        for(int i = 0 ; i < edades.length ; i++)
        {
            if(edades[i] >= 18)
                System.out.println("" + personas[i]);
        }
    }
}
