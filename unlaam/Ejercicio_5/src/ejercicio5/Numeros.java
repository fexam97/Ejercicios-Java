package ejercicio5;

/*
Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza
el bucle que desees.

*/

public class Numeros {

    public static void main(String[] args) {
        
    int vec[] = new int[100];
    
    System.out.println("Numeros del 1 a 100");
    
    for(int i = 0 ; i < vec.length ; i++) {
        vec[i] = i+1;
        System.out.println(vec[i]);
    }
        
        System.out.println("\n*********************************");
    
        System.out.println("\n Numeros divisibles entre 2");
    
        for (int i = 0; i < vec.length; i++) {
            if(vec[i] % 2 == 0)
                System.out.println(vec[i]);
        }
        
        System.out.println("\n*********************************");
        
        System.out.println("\n Numeros divisibles entre 3");
        
        for (int i = 0; i < vec.length; i++) {
            if(vec[i] % 3 == 0)
                System.out.println(vec[i]);
        }
        
    
    }
    
}
