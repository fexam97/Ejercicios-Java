package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdernamientoBurbujaString
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        int nElemento;
        
        nElemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos"));
        String nombres[] = new String[nElemento];
        
        for(int i = 0; i < nombres.length ; i++)
        {
            System.out.println("Ingrese el nombre: ");
            nombres[i] = teclado.next();
        }
        
        
        System.out.println("Vector desordenado: ");
        
        for(int i = 0 ; i < nombres.length ; i ++)
            System.out.println(" " + nombres[i]);
        
        // procedo a ordenar el vector
        
        String aux;
        
        for(int i = 0 ; i < (nombres.length-1) ; i++)
        {
            for(int j = 0 ; j < (nombres.length-1) ; j++)
            {
                if(nombres[j].compareTo(nombres[j+1]) > 0) // ordena la primera letra de menor a mayor
                {
                   aux = nombres[j];
                   nombres[j] = nombres[j+1];
                   nombres[j+1] = aux;
                }
            }
        }
        
        System.out.println("Vector ordenado: ");
         
        for(int i = 0 ; i < nombres.length ; i ++)
            System.out.println(" " + nombres[i]);
        
    }
}
