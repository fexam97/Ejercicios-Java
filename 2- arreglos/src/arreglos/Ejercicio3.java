package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
Definir un arreglo de n componentes de tipo float que representen
las alturas de 5 personas.
 Obtener el promedio de las mismas.
 Contar cuantas personas son mas altas que el promedio y cuantas mas bajas.
*/

public class Ejercicio3
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        
        float altura;
        float alturas[];
        int nElementos;
        float suma = 0;
        float promedio;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo"));
        alturas = new float[nElementos];
        
        for(int i = 0; i <= nElementos; i++)
        {
            System.out.println(" Digite " + i + " la altura ");
            alturas[i] = teclado.nextFloat();
            suma = suma + alturas[i];
        }
        
        System.out.println("Las alturas son: ");
        for(int i = 0; i < alturas.length; i++)
            System.out.println("" + alturas[i]);
        
        promedio = suma/nElementos;
        
        System.out.println("");
        System.out.println("El promedio de las alturas es :" + promedio);
        
        int mayor = 0;
        int menor = 0;
        
        for(int i = 0; i < alturas.length; i++)
        {
            if(alturas[i] > promedio)
                mayor++;
            
            else if(alturas[i] < promedio)
                menor++;
        }
        
        System.out.println("");
        System.out.println("La cantidad de elementos mayores al promedio es: " + mayor);
        System.out.println("La cantidad de elementos menors al promedio es: " + menor);
        
    }
}
