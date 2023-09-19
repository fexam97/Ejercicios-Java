package arreglos;

// vamos a ver porque no compila un vector normal

import java.util.Scanner;

public class Arreglos {

    
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        int vec[] = {1, 2, 3, 4, 5};
        int vecInv[] = new int[vec.length];
        int pos = vec.length - 1;
        
        for(int i = 0 ; i < vec.length ; i++)
        {
            vecInv[i] = vec[pos];
            pos--;
        }
        
        
        System.out.println("Vector normal: ");
        for(int i = 0 ; i < vec.length ; i++)
            System.out.print("  " + vec[i] );
        
        System.out.println("Vector Invertido");
        for(int i = 0 ; i < vec.length ; i++)
            System.out.print("  " + vecInv[i]);
        
        
    }
    
}
