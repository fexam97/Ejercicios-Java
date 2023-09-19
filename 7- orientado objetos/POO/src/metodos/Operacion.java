package metodos;

import java.util.Scanner;

public class Operacion {
    
 
    int numeroUno;
    int numeroDos;
    int suma;
    int resta;
    int multiplicacion;
    
    public void mostrarMenu(){
        Scanner teclado = new Scanner("System.in");
        
        int dato = 1;
        
        System.out.println("  Ingrese una opcion: ");
        System.out.println("1. Sumar numeros: ");
        System.out.println("2. Restar numeros: ");
        System.out.println("3. Multiplicar numeros: ");
        
        
      
        switch(dato){
            case 1: 
                    pedirNumeros();
                    sumarNumeros(); break;
            case 2:
                    pedirNumeros();
                    restarNumeros(); break;
            case 3:
                    pedirNumeros();
                    MultiplicarNumeros(); break;
            default:
                    System.out.println(" pusiste cualquier cosa flaco: "); break;
        }
        
    }
   
    
    public void pedirNumeros(){
        Scanner teclado = new Scanner("System.in");
        System.out.println("Ingrese el primer numero:");
        numeroUno = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numeroDos = teclado.nextInt();
    }
    
    public void sumarNumeros(){
        suma = numeroUno + numeroDos;
        System.out.println("La suma de los numeros es : " + suma);
    }
    
    public void restarNumeros(){
        resta = numeroDos - numeroUno;
        System.out.println("La resta de los numeros es: " + resta);
    }
    
    public void MultiplicarNumeros(){
        multiplicacion = numeroUno * numeroDos;
        System.out.println("La multiplicacion de los numeros es: "  + multiplicacion);
    }
    
}
