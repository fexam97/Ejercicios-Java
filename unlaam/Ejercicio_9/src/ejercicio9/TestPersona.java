package ejercicio9;

import java.util.Scanner;

public class TestPersona {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Persona personaUno;
        Persona personaDos;
        Persona personaTres = null;
        String nombreUno, nombreDos, nombreTres;
        int idPersonaUno, idPersonaDos, idPersonaTres;
        
        System.out.print("Ingrese el nombre de la primera persona: ");
        nombreUno = teclado.next();
        System.out.print("Ingrese el id :");
        idPersonaUno = teclado.nextInt();
        
        personaUno = new Persona(nombreUno, idPersonaUno);
        
        System.out.println("Ingrese el nombre de la segunda persona :");
        nombreDos = teclado.next();
        System.out.println("Ingrese el id : ");
        idPersonaDos = teclado.nextInt();
        
        personaDos = new Persona(nombreDos, idPersonaDos);
        
        System.out.println("Ingrese el nombre de la tercera persona :");
        nombreTres = teclado.next();
        System.out.println("Ingrese el id : ");
        idPersonaTres = teclado.nextInt();
        
        personaTres = new Persona(nombreTres, idPersonaTres);
        
        personaUno.mostrarPersona(personaUno);
        personaDos.mostrarPersona(personaDos);
        personaTres.mostrarPersona(personaTres);
    
        
        
    }
}
