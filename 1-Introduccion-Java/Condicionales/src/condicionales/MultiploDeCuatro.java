package condicionales;

import java.util.Scanner;

public class MultiploDeCuatro
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("ingrese un numero para saber si es multiplo de 4: ");
        numero = entrada.nextInt();
        
         if(numero%4 == 0)
             System.out.println("El numero " + numero  + "  es multiplo de 4");
        else
             System.out.println("El numero " + numero + "   no es multiplo de 4");
    }
}
