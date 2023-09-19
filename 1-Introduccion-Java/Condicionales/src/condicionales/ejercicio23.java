package condicionales;

/*
    crear un programa que permita cargar un numero entero positivo
    de hasta 3 cifras y muestre un mensaje indicando si tiene 1, 2 o 3 cifras.
     Mostrar un mensaje de error si el numero de cifras es mayor.
*/

import java.util.Scanner;

public class ejercicio23 // lo que me molesta de esto es usar muchos if 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("ingrese un numero");
        numero = entrada.nextInt();
        
        if(numero < 1000 && numero > 99)
            System.out.println("el numero es de 3 cifras");
        else
        {
            if(numero < 100 && numero > 9)
                System.out.println("El numero es de 2 cifras");
            else
            {
                if(numero < 9)
                    System.out.println("El numero es de una sola cifra");
                else
                    System.out.println("El numero tiene mas de 3 cifras.");
            }
        }
       
    }
}
