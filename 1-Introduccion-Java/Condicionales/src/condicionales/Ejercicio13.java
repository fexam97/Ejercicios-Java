package condicionales;

import java.util.Scanner;

public class Ejercicio13
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        char caracter;
        
        System.out.println("Ingrese un caracter, despues te digo si esta en mayuscula o minuscula");
        caracter = entrada.next().charAt(0);
        
        /* ESTO  LO HACIA EN PROGRA y SIGUE ANDANDO BIEN.
        
        if(caracter >= 'a' && caracter <= 'z')
            System.out.println("La letra es minuscula");
        else
        {
            if(caracter >= 'A' && caracter <= 'Z')
                System.out.println("La letra es mayuscula");
            else
                System.out.println("eso no es una letra.");
        }
        */
        if(Character.isUpperCase(caracter))
            System.out.println("La letra es mayuscula");
        else
        {
            if(Character.isLowerCase(caracter))
                System.out.println("La letra es minuscula");
            else
                System.out.println("Eso no es una letra");
        }        
    }
}
