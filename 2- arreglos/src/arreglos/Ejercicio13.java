package arreglos;

/*
 invertir un arreglo
*/

import java.util.Scanner;

public class Ejercicio13
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner("System.in");
        
        int vec[] = {1 ,2 ,3, 4, 5};
        int vecInv[] = new int[vec.length];
        int pos = vec.length - 1;
        
        System.out.println("vector normal: ");
        
        for(int i = 0; i < vec.length ; i++)
        {
            System.out.print("  " + vec[i]);
        }
        
        System.out.println("");
        
        System.out.println("vector invertido: ");
       
        for(int i = 0; i < vec.length ; i++)
        {
            vecInv[i] = vec[pos];
            pos--;
        }
        
        
        for(int i = 0; i < vec.length ; i++)
            System.out.print("  " + vecInv[i]);
    }
}
