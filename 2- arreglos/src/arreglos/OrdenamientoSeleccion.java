package arreglos;

/*
    Es un algoritmo de ordenamiento que requiere algunas
operaciones para ordenar una lista de n numeros.
 Su funcionamiento es en siguente:

1. buscar el menor elemento
2. Intercambiar con el primer elemento
3. Buscar el minimo del resto de los elementos.
4. Intercambiar con el segundo
5. Y asi sucesivamente

*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoSeleccion 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        //int nElementos;
        
       // nElementos = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de elementos: "));
        //int vec[] = new int[nElementos];
       int vec[] = {95, 64, 3, 8 ,12, 55, 6, 9, 78, 51, 1}; 
        
        
        System.out.println("Vector desordenado: ");
        
        for(int i = 0 ; i < vec.length ; i++)
        {
            //vec[i] = (int)(Math.random()*98);
            System.out.print (" " + vec[i]);
        }
        
        System.out.println(" ");
        
        // procedo a ordenarlo con el metodo de seleccion.
        
        int minimo;
        int aux;
        
        for(int i = 0 ; i < vec.length ; i++)
        {
            minimo = i;
            
            for(int j = i + 1 ; j < vec.length ; j++)
            {
                if(vec[j] < vec[minimo])
                    minimo = j;
            }
            
            aux = vec[i];
            vec[i] = vec[minimo];
            vec[minimo] = aux;
            
        }
        
        System.out.println("Vector ordenado: ");
        
        for(int i = 0 ; i < vec.length ; i++)
            System.out.print(" " + vec[i]);
        
        System.out.println("");
                
    }
}
