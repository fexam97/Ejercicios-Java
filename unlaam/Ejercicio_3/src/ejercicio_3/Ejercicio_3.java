package ejercicio_3;

public class Ejercicio_3 {
    public static void main(String[] args) {
        
        int vec[] = new int[3];
        boolean esPar = false;
        
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random()*99);
       }
        
        System.out.println("");
        
       
        for (int i = 0; i < vec.length; i++) {
            
            if(vec[i] % 2 != 0) {
                continue;
            }
            else{
                System.out.println(vec[i]);
                esPar = true;
            }
        }
        
        if(!esPar)
            System.out.println("No hubo numero Par");
        
    }    
}
