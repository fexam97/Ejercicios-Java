package ejercicio_4;

import java.util.Scanner;

public class TestFecha {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int dia;
        int mes;
        int año;
        
        Fecha fecha;
        
        System.out.println("Ingrese el dia");
        dia = teclado.nextInt();
        System.out.println("ingrese el mes");
        mes = teclado.nextInt();
        System.out.println("Ingrese el año");
        año = teclado.nextInt();
        
        fecha = new Fecha(dia, mes, año);
        
        fecha.validarFecha(fecha);
        
        System.out.println(fecha.validarFecha(fecha));
        
        
        
    /*    
        int opcion;
        
        do{
            System.out.println("\t MENU");
            System.out.println(" 1 - mostrar fecha");
            System.out.println(" 2 - incrementar fecha");
            System.out.println(" 3 - decrementar fecha");
            System.out.println(" 4 - sumar fecha");
            System.out.println(" 5 - restar fecha");
            System.out.println(" 6 - salir");
            
            System.out.println("Ingrese una opcion");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Hasta pronto!");
                    opcion = 6;
                    break;
                default:
                    System.out.println("nada");
                    break;
            }
            
        }while(opcion != 6);
      */  
    }
}
