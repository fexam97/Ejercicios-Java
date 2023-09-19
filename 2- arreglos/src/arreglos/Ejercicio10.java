package arreglos;

// este no lo entendi

import java.util.Scanner;
import javax.swing.JOptionPane;


/*
    Cargar un arreglo de N elementos, imprimir el menor y  un mensaje 
    si se repite dentro del arreglo.
*/

public class Ejercicio10
{
    public static void main(String[] args)
    {
       Scanner teclado = new Scanner(System.in);
        
       int nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos"));
        
       int vec[] = new int[nElementos];
        
       for(int i = 0 ; i < vec.length ; i++)
       {
           System.out.println("vec["+ i +"]");
           vec[i] = teclado.nextInt();
       }
       
       // vamos a buscar el elemento menor.
       
       int menor = vec[0];
       int seRepite = 0;
       
       for(int i = 0; i < vec.length ; i++)
       {
           if(menor > vec[i])
               menor = vec[i];
           
           if( menor == vec[i])
               seRepite++;
       }
       
        System.out.println("Elemento menor del vector : " + menor);
        if(seRepite >= 1)
            System.out.println("El elemento se repite");
       
    }
}
