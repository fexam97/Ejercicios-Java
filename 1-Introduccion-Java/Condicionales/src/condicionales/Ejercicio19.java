package condicionales;

import java.util.Scanner;

public class Ejercicio19
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        String cadena1,
               cadena2;
        
        System.out.println("Ingrese la primera cadena: ");
        cadena1 = entrada.next();
        
        System.out.println("Ingrese la segunda cadena");
        cadena2 = entrada.next();
        
        int longitudCadena1 = cadena1.length(); // Hola , 1234 = 4//
        int longitudCadena2 = cadena2.length(); // Mundo, 12345 = 5 //
        
        if(longitudCadena1 > longitudCadena2)
            System.out.println("la primera cadena es mas larga");
        else
        {
            if(longitudCadena1 < longitudCadena2)
                System.out.println("la segunda cadena es mas larga");
            else
                System.out.println("Las cadenas miden lo mismo.");
        }
    }
}
