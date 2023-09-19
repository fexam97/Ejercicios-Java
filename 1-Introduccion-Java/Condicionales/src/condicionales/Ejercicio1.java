package condicionales;

import java.util.Scanner;

public class Ejercicio1 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        
        System.out.println(" Digite el primer numero");
        numero1 = entrada.nextInt();
        
        System.out.println(" Digite el segundo numero: ");
        numero2 = entrada.nextInt();
        
        if( numero1 > numero2)
            System.out.println("El primer numero es mayor:  ");
        else
        {
            if(numero1 < numero2)
                System.out.println("El segundo numero es mayor");
        else
            System.out.println("Ambos numeros son iguales ");   
        }    
    }
}
