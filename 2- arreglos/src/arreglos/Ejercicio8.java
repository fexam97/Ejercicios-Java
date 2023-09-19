package arreglos;

import java.util.Scanner;

public class Ejercicio8
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        String vec[] = new String[10];
        
        for(int i = 0; i < vec.length ; i++)
        {
            System.out.println("vec["+i+"] : ");
            vec[i] = teclado.nextLine();
        }
        
        int longitud = vec[0].length();
        String CadenaMayor = "";
        
        for(int i = 0 ; i < vec.length ; i++)
        {
            if(longitud < vec[i].length()) // yo creo que en el primer intento sale del if
            {                              // recien empieza a comparar en el segundo ciclo.
                longitud = vec[i].length();
                CadenaMayor = vec[i];
            }
        }
        
        
        System.out.println("La cadena con mas letras es : " + CadenaMayor);
        
    }
}
