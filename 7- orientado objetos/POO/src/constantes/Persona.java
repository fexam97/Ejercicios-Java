package constantes;

public class Persona {
    
    private int edad = 25;
    private final String nombre = "Fernando"; // es una constante
    
    public void saludar(){
        edad = 26;
        System.out.println("Hola, mi nombre es " + nombre + ", mi edad es " + edad);
    }
    
    
}
