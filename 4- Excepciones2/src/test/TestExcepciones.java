package test;

import arimetica.Division;

public class TestExcepciones {
    
    public static void main(String[] args) {
        
        int resultado = 0;
        try{
            resultado = Division.dividir(10, 0);
        }catch(Exception excepcion){
            excepcion.printStackTrace(System.out); 
        }finally{
            System.out.println("Fin del programa");
        }
        
        System.out.println("Resultado : " + resultado);
        
    }
    
}
