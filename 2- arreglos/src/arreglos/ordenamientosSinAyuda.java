package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ordenamientosSinAyuda 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int dato;
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos"));
        int vec[] = new int[nElementos];
        
        System.out.println("Vector desordenado: ");
        
        for(int i = 0 ; i < vec.length ; i++)
        {
            vec[i] = (int)(Math.random()*95);
            System.out.print(" " + vec[i]);
        }
        
        
        System.out.println("\nElija el metodo de ordenamiento: ");
        System.out.println(" 1. burbuja:");
        System.out.println(" 2. Insercion: ");
        System.out.println(" 3. Seleccion: ");
        System.out.println(" 4. nada");
        
        dato = teclado.nextInt();
        
        switch(dato)
        {
            case 1:
                    int aux;
        
                    for(int i = 0 ; (i < vec.length-1) ; i++)
                    {
                        for(int j = 0 ; j < (vec.length-1) ; j++)
                        {
                            if(vec[j] > vec[j+1])
                            {
                                aux = vec[j];
                                vec[j] = vec[j+1];
                                vec[j+1] = aux;
                            }
                        }
                    }
                
                break;
                
            case 2:
                int pos;
                int auxiliar;
        
                for(int i = 0 ; i < vec.length ; i++)
                {
                    pos = i;
                    auxiliar = vec[i];
            
                    while( (pos > 0) && (vec[i-1] > auxiliar)) //aux seria el vec[0]
                    {
                        vec[pos] = vec[pos - 1];
                        pos--;
                    }
                    vec[pos] = auxiliar;
                }
                
                break;
                
            default : break;    
        }
                          
        System.out.println("\n Vector ordenado : \n ");
        
        for(int i = 0 ; i < vec.length ; i++)
            System.out.print("  " + vec[i]);               
       
    }
}
