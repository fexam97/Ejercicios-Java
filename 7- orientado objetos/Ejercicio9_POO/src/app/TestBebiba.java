package app;

import java.util.Scanner;

public class TestBebiba {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Bebida bebida;
        Almacen almacen = new Almacen();
        int opcion;

        do {
            System.out.println("\t\n MENU");
            System.out.println("1 Agregar bebida");
            System.out.println("2 Eliminar bebida");
            System.out.println("3 Mostrar bebidas");
            System.out.println("4 Calcular precio bebidas");
            System.out.println("5 Salir");

            System.out.println("Ingrese una opcion");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                        double porcentajeAzucar;
                        boolean promocionAzucar;
                        
                        double cantidadAzucar;
                        double precioAzucar;
                        String marcaAzucar;
                       
                        System.out.println("Ingrese el procentaje de azucar : ");
                        porcentajeAzucar = teclado.nextDouble();
                        
                        System.out.println("Ingrese la promocion de la azcuar : ");
                        promocionAzucar = teclado.nextBoolean();
                        
                        System.out.println("Ingrese la cantidad de azucar : ");
                        cantidadAzucar = teclado.nextDouble();
                        
                        System.out.println("Ingrese el precio del azucar : ");
                        precioAzucar = teclado.nextDouble();
                        
                        System.out.println("Ingrese la marca del azucar : ");
                        marcaAzucar = teclado.next();
                        
                        bebida = new BebidaAzucarada(cantidadAzucar, precioAzucar, marcaAzucar, porcentajeAzucar, promocionAzucar);
                        almacen.agregarBebida(bebida);
                        
                    break;
                case 2:
                        System.out.println("nose");
                    break;
                case 3:
                    System.out.println("nose");
                    break;
                   
                case 4:
                     System.out.println("nose");
                    break;
                default:
                    System.out.println("Cualquier cosa flaco: ");
                    opcion = 5;
                    break;
            }

        } while (opcion != 5);

    }
}
