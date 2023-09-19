package modificadores;

public class Ejecucion {
    public static void main(String[] args) {
        
        //Modificadores persona = new Modificadores(25, "fer");
        //persona.hablar();
        
        Modificadores persona = new Modificadores(25, " Fernando ");
        
        persona.saludar();
        
        int edad = persona.edad = 18;
        String nombre = persona.nombre = "ramoncin";
        
        System.out.println("edad: " + edad +   "\nnombre:" + nombre );
    }
  
}
