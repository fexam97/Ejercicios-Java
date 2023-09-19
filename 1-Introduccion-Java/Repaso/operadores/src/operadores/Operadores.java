package operadores; // concatencacion variables
import java.util.Scanner;



public class Operadores
{

  public static void main(String[] args)
  {
    /*
    String cadena = "Hola mi nombre es christian ";
    
      System.out.println(cadena);
      
      cadena += "soy de venezuela";
      
      System.out.println(cadena);
   */
      
      Scanner entrada = new Scanner(System.in); 
    
      String nombre;
      
      System.out.print("Digite su nombre: ");
      nombre = entrada.next();
      
      System.out.println("El nombre es: " + nombre);
      
      nombre += " perez";
      
      System.out.println("El nombre completo es: " + nombre);
  }
    
}
