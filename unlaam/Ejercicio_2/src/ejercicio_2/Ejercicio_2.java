
package ejercicio_2;
/*
 cear un programa que haga un bucle de 0 a 3 elementos
y solo muestre el primer valor par. Se solicita usar la sentencia break.
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
    
        int vec[] = new int[3];
        boolean esPar = false;
        
        // lleno el vector
        
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random()*99);
        }
        
        // muestro si hubo numero par
        
        for (int i = 0; i < vec.length; i++) {
            if(vec[i]%2 == 0){
                System.out.println(vec[i]);
                esPar = true;
                break;
            }
         }
        
        if (!esPar) { // esPar == false
                System.out.println("No hubo numero par");
            }
    }
    
}
