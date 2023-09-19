package concatenarchar;

import java.util.Scanner;

public class ConcatenarChar 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        char caracter1, caracter2;
        String sumaCaracteres = " "; // si o si tengo que inicializarlo con vacio, porque tiene basura
        
        System.out.println("Ingrese el primer caracter");
        caracter1 = entrada.next().charAt(0); // el 0 es cantidad de cartacter que voy a poner
        
        System.out.println("Ingrese el segundo caracter:");
        caracter2 = entrada.next().charAt(0);
        
        sumaCaracteres = caracter1 + "" + caracter2;
        
        System.out.println("La contatenacion de:   " + caracter1 + "  y  " + caracter2 + "    es igual a: " + sumaCaracteres);
    }
    
}
