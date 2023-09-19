package arreglos;

import java.util.Scanner;

/*
    leer un arreglo de 10 elementos numericos enteros con las posiciones
    del 0 al 9. Eliminar el elemento situado en la posicion dada.
*/

public class Ejercicio15
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        int vec[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int posicionEliminar;
        
        for(int i = 0 ; i < vec.length ; i++)
            System.out.print(" " + vec[i]);
       
        do
        {
            System.out.println("Ingrese la posicion a eliminar");
            posicionEliminar = teclado.nextInt();
            
        }while( posicionEliminar > vec.length); // el do while sale del ciclo cuando la condicion es falsa
            
        for(int i = posicionEliminar ; i < 9 ; i++)
            vec[i] = vec[i+1];
        
        for(int i = 0 ; i < vec.length ; i++)
            System.out.print(" " + vec[i]);
    }
}
