package arreglos;

/*
    Crear un programa que lea elementos a un array y terminar el programa
    cuando digites el -1, por ultimo mostrar el array.
*/

import java.util.Scanner;

public class Ejercicio16
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        int vec[] = new int[100];
        int pos = 0;
       
        boolean pausa = false;
       
        do{
            for(int i = 0 ; i < vec.length ; i++)
            {
                 System.out.println("ingrese el elemento del vector: ");
                 vec[i] = teclado.nextInt();
             
                 if(vec[i] == -1)
                {
                     pausa = true;
                     pos = i;
                    break;
                }
            }    
        }while(pausa != true);    
        
        System.out.println("vector creado: ");
        
        for(int i = 0 ; i < pos ; i++)
            System.out.print(" " + vec[i]);
    }    
        
    /// nada, se usa mucho los booleanos. Tendre que acostumbrarme
    
}    
    

