package arreglos;

/*
    Mezclar 2 arreglos ordenados de formas creciente de 10 elementos en
    un tercer arreglo con un total de 20 elementos
*/

import java.util.Scanner;

public class Ejercicio17 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        int primerVector[] = new int[10];
        int segundoVector[] = new int[10];
        
        int tercerVector[] = new int[primerVector.length + segundoVector.length];
        
        for(int i = 0 ; i < primerVector.length ; i++)
        {
            primerVector[i] = (int)(Math.random()*100);
            segundoVector[i] = (int)(Math.random()*100);
        }
        
        System.out.println("Primer vector:");
        
        for(int i = 0 ; i < primerVector.length ; i++)
            System.out.print(" " + primerVector[i]);
        
        System.out.println("\n Segundo vector:");
        
        for(int i = 0 ; i < segundoVector.length ; i++)
            System.out.print(" " + segundoVector[i]);
        
        System.out.println("\nTercer vector concatenado:");
        
        int j = 0;
        for(int i = 0; i < primerVector.length ; i++)
        {
            tercerVector[j] = primerVector[i];
            j++;
            tercerVector[j] = segundoVector[i];
            j++;
        }
        
        for(int i = 0 ; i < tercerVector.length ; i++)
            System.out.print(" " + tercerVector[i]);
        
        
        System.out.println(" ");
        
        System.out.println("\nTercer vector ordenado:"); // con el metodo burbuja
        
        int aux;
        
        for(int i = 0 ; i < 20 ; i++)
        {
            for(int k = 0 ; k < 20; k++)
            {
                if(tercerVector[j] > tercerVector[j+1])
                {
                    aux = tercerVector[j];
                    tercerVector[j] = tercerVector[j+1];
                    tercerVector[j+1] = aux;
                }
            }
        }
        
        for(int i = 0 ; i < tercerVector.length ; i++)
            System.out.print(" " + tercerVector[i]);
        
    }
    
}
