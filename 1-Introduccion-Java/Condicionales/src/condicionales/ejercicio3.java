package condicionales; // calcular el mayor de los 3 numeros

import java.util.Scanner;


public class ejercicio3
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int numero1,
            numero2,
            numero3;
        
        System.out.println(" Ingrese el primer numero: ");
        numero1 = entrada.nextInt();
        
        System.out.println(" Ingrese el segundo numero: ");
        numero2 = entrada.nextInt();
        
        System.out.println(" Ingrese el tercer numero: ");
        numero3 = entrada.nextInt();
        
        if((numero1 > numero2)&&(numero1 > numero3))
        {
            System.out.println("El primer numero es mayor");
        }
        else
        {
            if((numero2 > numero1)&&(numero2 > numero3))
                System.out.println("El segundo numero es el mayor");
            
            System.out.println("El tercer numero es el mayor");
        }
    }
}
