package estaticos;

// Un atributo o metodo estatico, ya no le pertenecen a los objetos,
// Ahora le pertenecen a la clase.

// No existe el metodo constructor static

public class Persona {
    
    public static int edad = 25;
    public static final String nombre = "Fernando ";
    public static int id = 123456;
    public static double altura = 1.71;
    
    public static void saludar(){
        System.out.println("Hola....");
        System.out.println("Mi nombre es  " + nombre);
        System.out.println("Tengo " + edad + "años");
        System.out.println("Mi id es : " + id);
        System.out.println("mido : " + altura);
    }
    
    public static void hablar(){
        System.out.println("Estoy hablando");
    }
}
