package arreglos;

/*
    crear un programa que guarde 10 nombres de personas con sus dichas alturas,
    luego indicar la mayor y la menor altura con sus dichos nombre.
*/

import java.util.Scanner;

public class Ejercicio14 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        String personas[] = new String[10];
        float altura[] = new float[10];
        
        for(int i = 0 ; i < personas.length ; i++)
        {
            System.out.println("nombre nro " + i + " : ");
            personas[i] = teclado.next();
            
            System.out.println("Altura de la persona nro " + i + " ");
            altura[i] = teclado.nextFloat();
                    
        }
        
        float maxAlt = altura[0];
        float minAltu = altura[0];
        int posAlto = 0;
        int posBajo = 0;
        
        for(int i = 0 ; i < altura.length ; i++)
        {
            if(maxAlt < altura[i])
            {
                maxAlt = altura[i];
                posAlto = i;
            }
            
            else if(minAltu > altura[i])
            {
                minAltu = altura[i];
                posBajo = i;
            }
        }
        
            System.out.println(" La persona mas alta es :" + personas[posAlto] + "mide : " + maxAlt);
            
            System.out.println(" La persona mas baja es :" + personas[posBajo] + "mide : " + minAltu);
    }
}
