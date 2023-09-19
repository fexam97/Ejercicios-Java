package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoInsercion
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos: "));
        int vec[] = new int[nElementos];
        
        System.out.println("Vector desordenado: ");
        
        for(int i = 0 ; i < vec.length ; i++)
        {
            vec[i] = (int)(Math.random()*98);
            System.out.print(" " + vec[i]);
        }
        
        System.out.println(" ");
        
        
        // metodo de insercion
        
        int posicion;
        int aux;
        
        for(int i = 0 ; i < vec.length ; i++)
        {
            posicion = i;
            aux = vec[i];
            
            while((posicion > 0) && (vec[i-1]) > aux)
            {
                vec[posicion] = vec[posicion - 1];
                posicion--;
            }
            
            vec[posicion] = aux;
        }
      
        
        System.out.println("Vector ordenado: ");
        for(int i = 0 ; i < vec.length ; i++)
            System.out.print(" " + vec[i]);
    }
}
