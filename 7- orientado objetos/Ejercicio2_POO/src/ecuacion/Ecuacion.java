package ecuacion;

import java.util.Scanner;

public class Ecuacion {
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        double a;
        double b;
        double c;
        boolean estado = true;
        String respuesta;
        Raices raiz;
        int contador = 0;
        
        for (int i = 0; estado; i++) {
            System.out.println("Ingrese el valor de a:");
            a = teclado.nextDouble();
            System.out.println("Ingrese el valor de b:");
            b = teclado.nextDouble();
            System.out.println("Ingrese el valor de c:");
            c = teclado.nextDouble();
            
            System.out.println("");
            
            raiz = new Raices(a, b, c);
            raiz.calcular();
            
            System.out.println("\n Desea continuar?? : ");
            respuesta = teclado.next();
            
            if (respuesta.equalsIgnoreCase("si")) {
                contador++;
                estado = true;
            }
            else{
                contador++;
                System.out.println("La cantidad de veces que se calculo fueron:" + contador);
                estado = false;
            }
        }
        
    }
    
}
