package complejos;

import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        NumeroComplejo primerNumero;
        NumeroComplejo segundoNumero;
        NumeroComplejo suma;
        NumeroComplejo multiplicacion;
        double a; // parte real del 1° numero
        double b; // parte imaginaria del 1° numero
        double c; // parte real del 2° numero
        double d; // parte imaginaria del 2° numero
        
        int opcion;
        int numeroEntero;
        int numeroComplejo;  
        
        do {
            System.out.println("\n\t\t MENU\n");
            System.out.println("1 . Sumar  2 numeros complejos");
            System.out.println("2 . Multiplicar 2 numeros complejos");
            System.out.println("3 . comprobar igualdad de 2 numeros complejos");
            System.out.println("4 . Multiplicar entero por complejo");
            System.out.println("5 . Salir");
            
            System.out.println("Digite una opcion");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la parte real del primer numero complejo: ");
                    a = teclado.nextDouble();
                    
                    System.out.println("Ingrese la parte imaginaria: ");
                    b = teclado.nextDouble();
                    
                    System.out.println("Ingrese la parte real del segundo numero complejo:");
                    c = teclado.nextDouble();
                    
                    System.out.println("Ingrese la parte imaginaria: ");
                    d = teclado.nextDouble();
                    
                    primerNumero = new NumeroComplejo(a, b);
                    segundoNumero = new NumeroComplejo(c, d);
                    
                    suma = primerNumero.calcularSuma(segundoNumero);
                    System.out.println("La suma es : " + suma.getParteReal()
                                       + "+" + suma.getParteImaginaria() + "i");
                    break;
                case 2:
                    System.out.println("Ingrese la parte real del primer numero complejo: ");
                    a = teclado.nextDouble();
                    
                    System.out.println("Ingrese la parte imaginaria: ");
                    b = teclado.nextDouble();
                    
                    System.out.println("Ingrese la parte real del segundo numero complejo:");
                    c = teclado.nextDouble();
                    
                    System.out.println("Ingrese la parte imaginaria: ");
                    d = teclado.nextDouble();
                    
                    primerNumero = new NumeroComplejo(a, b);
                    segundoNumero = new NumeroComplejo(c, d);
                    
                    multiplicacion = primerNumero.calcularSuma(segundoNumero);
                    System.out.println("La multiplicacion es : " + multiplicacion.getParteReal()
                                       + "*" + multiplicacion.getParteImaginaria() + "i");
                    break;
                case 3:
                    
                    System.out.println("Ingrese la parte real del primer numero complejo: ");
                    a = teclado.nextDouble();
                    
                    System.out.println("Ingrese la parte imaginaria: ");
                    b = teclado.nextDouble();
                    
                    System.out.println("Ingrese la parte real del segundo numero complejo:");
                    c = teclado.nextDouble();
                    
                    System.out.println("Ingrese la parte imaginaria: ");
                    d = teclado.nextDouble();
                    
                    primerNumero = new NumeroComplejo(a, b);
                    segundoNumero = new NumeroComplejo(c, d);
                    
                    if(primerNumero.comprobarIgualdad(segundoNumero))
                        System.out.println("Los numeros son iguales.");
                    else
                        System.out.println("los numeros son distintos");
                    
                    break;
                case 4:
                    System.out.println("Ingrese la parte real del numero complejo:");
                    a = teclado.nextDouble();
                    
                    System.out.println("Ingrese la parte imaginaria");
                    b = teclado.nextDouble();
                    
                    System.out.println("Ingrese el numero entero");
                    numeroEntero = teclado.nextInt();
                    
                    primerNumero = new NumeroComplejo(a, b);
                    multiplicacion = primerNumero.multiplicarPorEntero(numeroEntero);
                    System.out.println("La multiplicacion es:" + multiplicacion.getParteReal()
                                        + "+" + multiplicacion.getParteImaginaria()+"i");
                    
                    break;
                case 5:
                    System.out.println("Gracias por participar");
                    opcion = 5;
                    break;
                default:
                    System.out.println("Cuaquier cosa pa");
                    break;
            }
            
        } while (opcion != 5);
        
    }
}
