package setters_getters;

import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite el nombre:");
        persona.setNombre(teclado.next());
        
        System.out.println("Digite la edad");
        persona.setEdad(teclado.nextInt());
        
        System.out.println("Digite la altura");
        persona.setAlture(teclado.nextDouble());
        
        
        System.out.println("El nombre es:" + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("mide" + persona.getAlture());
        
        
   }
 
    
    
}
