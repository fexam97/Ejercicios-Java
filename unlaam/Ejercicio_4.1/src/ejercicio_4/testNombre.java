package ejercicio_4;

import java.util.Scanner;

/*
    Declara un String que contenga tu nombre, después muestra un mensaje de
bienvenida por consola. Por ejemplo: si introduzco "Fernando", me aparezca "Bienvenido Fernando".

*/

public class testNombre {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String persona;
        Nombre nombre = new Nombre();
        
        
        System.out.println("Ingrese un nombre:  ");
        persona = teclado.next();
        
        nombre.Mensaje(persona);
        
        
        
    }
}
