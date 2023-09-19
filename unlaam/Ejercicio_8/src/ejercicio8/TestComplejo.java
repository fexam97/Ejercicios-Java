package ejercicio8;

import java.util.Scanner;

public class TestComplejo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double numeroReal;
        double numeroImaginario;
        double numeroAMultiplicar;
        Complejo numero1;
        Complejo numero2;

        int opcion;

        do {
            System.out.println("\n\t MENU ");
            System.out.println("1 - Sumar 2 numeros complejos:");
            System.out.println("2 - Restar 2 numeros complejos:");
            System.out.println("3 - Multiplicar 2 numeros complejos");
            System.out.println("4 - Multiplicar por un numero double");
            System.out.println("5 - Dividir 2 numeros complejos");
            System.out.println("6 - Comparar si los numeros complejos son iguales ");
            System.out.println("7 - Salir");

            System.out.println("\nIngrese una opcion");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el numero real :  ");
                    numeroReal = teclado.nextInt();
                    System.out.print("Ingese el numero imaginario :  ");
                    numeroImaginario = teclado.nextInt();

                    numero1 = new Complejo(numeroReal, numeroImaginario);
                    numero2 = new Complejo(5, 7);
                    Complejo suma;

                    System.out.println("Numero 1: " + numero1.toString());
                    System.out.println("Numero 2: " + numero2.toString());

                    suma = numero1.sumar(numero2);

                    System.out.println("\nLa suma es : " + suma);
                    break;
                case 2:

                    System.out.print("Ingrese el numero real :  ");
                    numeroReal = teclado.nextInt();
                    System.out.print("Ingese el numero imaginario :  ");
                    numeroImaginario = teclado.nextInt();

                    numero1 = new Complejo(numeroReal, numeroImaginario);
                    numero2 = new Complejo(5, 7);
                    Complejo resta;

                    System.out.println("Numero 1: " + numero1.toString());
                    System.out.println("Numero 2: " + numero2.toString());

                    resta = numero1.restar(numero2);

                    System.out.println("\nLa resta es : " + resta);
                    break;
                case 3:

                    System.out.print("Ingrese el numero real :  ");
                    numeroReal = teclado.nextInt();
                    System.out.print("Ingese el numero imaginario :  ");
                    numeroImaginario = teclado.nextInt();

                    numero1 = new Complejo(numeroReal, numeroImaginario);
                    numero2 = new Complejo(5, 7);
                    Complejo producto;

                    System.out.println("Numero 1: " + numero1.toString());
                    System.out.println("Numero 2: " + numero2.toString());

                    producto = numero1.multiplicar(numero2);

                    System.out.println("\nLa multiplicacion de los 2 numeros es: " + producto);

                    break;
                case 4:

                    System.out.print("Ingrese el numero real :  ");
                    numeroReal = teclado.nextInt();
                    System.out.print("Ingese el numero imaginario :  ");
                    numeroImaginario = teclado.nextInt();

                    numero1 = new Complejo(numeroReal, numeroImaginario);
                    Complejo resultado;

                    System.out.print("\nIngrese un numero de tipo double : ");
                    numeroAMultiplicar = teclado.nextInt();

                    resultado = numero1.multiplicarPorDouble(numeroAMultiplicar);

                    System.out.println("La multiplicacion es : " + resultado);
                    break;
                    
                case 5:
                    System.out.print("Ingrese el numero real :  ");
                    numeroReal = teclado.nextInt();
                    System.out.print("Ingese el numero imaginario :  ");
                    numeroImaginario = teclado.nextInt();

                    numero1 = new Complejo(numeroReal, numeroImaginario);
                    numero2 = new Complejo(16, 8);
                    Complejo cociente;

                    System.out.println("Numero 1: " + numero1.toString());
                    System.out.println("Numero 2: " + numero2.toString());

                    cociente = numero1.Dividir(numero2);

                    System.out.println("La division es : " + cociente);
                    break;

                case 6:
                    System.out.print("Ingrese el numero real :  ");
                    numeroReal = teclado.nextInt();
                    System.out.print("Ingese el numero imaginario :  ");
                    numeroImaginario = teclado.nextInt();

                    numero1 = new Complejo(numeroReal, numeroImaginario);
                    numero2 = new Complejo(5, 7);

                    if (!numero1.equals(numero2)) {
                        System.out.println("Los numeros son distintos");
                    } else {
                        System.out.println("Los numeros son iguales");
                    }

                    break;

                case 7:
                    System.out.println("Hasta luego amigo");
                    opcion = 7;
                    break;

                default:
                    System.out.println("Usted ha seleccionado cualquier cosa");
                    break;
            }

        } while (opcion != 7);

    }

}
