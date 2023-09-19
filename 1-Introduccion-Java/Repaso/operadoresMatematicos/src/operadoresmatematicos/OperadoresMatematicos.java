
package operadoresmatematicos;

import java.util.Scanner;

public class OperadoresMatematicos
{

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int lado;
        
        System.out.println("Ingrese el lado del cuadrado: ");
        
        lado = entrada.nextInt();
        
        System.out.println("El perimetro del cuadrado es " + 4*lado + "cm");
        
        
        
    }
    
}
