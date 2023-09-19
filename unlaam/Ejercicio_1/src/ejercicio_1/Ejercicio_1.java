package ejercicio_1;

/*
Dado un número entero y positivo que se introduce por teclado, determinar si es
par o impar.
*/

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;

        do {

            System.out.println("Ingrese un numero positivo y entero");
            numero = teclado.nextInt();

        } while (numero < 0);

        if(numero % 2 == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
    }

}
