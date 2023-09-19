package arimetica;

import excepciones.OperacionAritmetica;

public class Division {
 
    public static int dividir(int numerador, int denominador) throws OperacionAritmetica{
        
        if(denominador == 0){
           throw new OperacionAritmetica("Error al dividir entre cero."); // throw lanzar una excepcion
        }
        
        return numerador / denominador; 
    }
    
    
}
