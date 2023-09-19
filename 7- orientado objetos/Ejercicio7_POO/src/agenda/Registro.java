package agenda;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Registro {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int telefono;
        String nombre;
        Contacto contacto;
        
        int tamañoAgenda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de contactos"));
        Agenda agendaTelefonica = new Agenda(tamañoAgenda);
        
        do {
            
            System.out.println("\n\t MENU");
            System.out.println("Bienvenido a la telefonica  \n\n");
            System.out.println("1. añadir contacto");
            System.out.println("2. listar contactos");
            System.out.println("3. buscar contacto");
            System.out.println("4. comprobar si existe el contacto");
            System.out.println("5. eliminar contacto");
            System.out.println("6. comprobar contactos disponibles");
            System.out.println("7. comprobar si la agenda esta llena");
            System.out.println("8. salir");
            
            System.out.println("\n ingrese una opcion: ");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    // añadimos el contacto
                    System.out.println("Ingrese el nombre");
                    nombre = teclado.next();
                    System.out.println("Ingrese el telefono");
                    telefono = teclado.nextInt();
                    
                    contacto = new Contacto(nombre, telefono);
                    agendaTelefonica.AñadirContacto(contacto);
                    System.out.println("");
                    break;
                case 2:
                    // listamos el contacto
                    agendaTelefonica.listarContactos();
                    System.out.println("");
                    break;
                case 3:
                    // buscamos el contacto
                    System.out.println("Ingrese el nombre: ");
                    nombre = teclado.next();
                    
                    agendaTelefonica.BuscarContacto(nombre);
                    System.out.println("");
                    break;
                case 4:
                    // comprobamos si el contacto existe
                    System.out.println("ingrese el nombre");
                    nombre = teclado.next();
                    
                    contacto = new Contacto(nombre);
                    
                    if(agendaTelefonica.ComprobarSiExisteContacto(contacto))
                        System.out.println("El contacto existe\n");
                    else
                        System.out.println("El contacto no existe\n");
                    
                    break;
                case 5:
                    // eliminamos el contacto
                    System.out.println("Ingrese el nombre");
                    nombre = teclado.next();
                    
                    contacto = new Contacto(nombre);
                    agendaTelefonica.EliminarContacto(contacto);
                    System.out.println("");        
                    break;
                case 6:
                    // comprobamos los contactos disponibles
                    System.out.println("\n Hay" + agendaTelefonica.comprobarSiHayHuecosLibres() + "contactos.");
                    break;
                case 7:
                    // compobramos si la agenda esta llena
                    if(agendaTelefonica.ComprobarSiLaAgendaEstaLlena())
                        System.out.println("la agenda esta llena");
                    else
                        System.out.println("Aun puedes registar contactos \n");
                    
                    break;
                case 8:
                    //salimos
                    System.out.println("Gracias por usar nuestros servicios");
                    opcion = 8;
                    break;
                default:
                    System.out.println("nada pa"); break;
            }
            
        } while (opcion != 8);
        
        
    }
}
