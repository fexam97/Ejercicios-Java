package estaticos;
public class Registro {
    
    
    public static int CalcularEdad(int fechaActual, int fechaNacimiento){
        return fechaActual - fechaNacimiento;
    }
    
    public void saludar(String nombre){
        System.out.println("Hola , mi nombre es : " + nombre);
    }
    
    
    public static void main(String[] args) {
     
       // Persona.hablar();
        Registro persona = new Registro();
        
        persona.saludar(" Fernando");
        int edad = CalcularEdad(2022, 1997); // todo gracias al static // se puede llamar directamente.
        System.out.println("Tiene" + edad + "años");
    }
}
