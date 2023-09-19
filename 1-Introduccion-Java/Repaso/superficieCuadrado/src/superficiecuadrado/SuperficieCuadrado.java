package superficiecuadrado;

import java.util.Scanner;

public class SuperficieCuadrado
{

    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el lado del cuadrado:   ");
        
        int lado;
        int area;
        
        lado = entrada.nextInt();
        
        area = lado * lado;
        
        System.out.print("El area del cuadrado es: " + area);
        System.out.println("cm^2");
        
        System.out.println("Ahora voy con la suma de los 3 numeros");
        
        Scanner teclado = new Scanner(System.in);
        
        int n1;
        int i;
        int acum = 0;
        
        System.out.println("Ingrese un numero");
        
        n1 = teclado.nextInt();
        
        for(i = 0; i < 3; i++)
        {
            acum += n1;
            n1++;
        }
        System.out.println("El numero es: " + acum);
    }
    
}
