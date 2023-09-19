package operadoresparte2;

import java.util.Scanner;

public class OperadoresParte2 
{
    public static void main(String[] args) 
    {
        // promedio de un alumno con 5 notas
        
        Scanner entrada = new Scanner(System.in);
        
        int i;
        float acum = 0f;
        float nota;
        
        for(i = 1; i <= 5; i++)
        {
            System.out.println("Ingrese la nota n°" + i + ": ");
            nota = entrada.nextFloat();
            acum += nota;
        }
        
        System.out.println("El promedio de las notas es:" + acum/5 );
    }
}
