package herencia;

public class Nutria extends Animal{

    public Nutria(String nombre, int id, int edad) {
        super(nombre, id, edad); // la palabra super sirbe para podes acceder a los atributos y metodos 
    }

    @Override
    public void comer() {
        System.out.println("la nutria come peces");
        System.out.println("El nombre de la nutria es :" + nombre);
        System.out.println("El id de la nutria es : " + id);
        System.out.println("La edad de la nutra es: " + edad);
    }
    
    
    public void nadar(){
        System.out.println("La nutria esta nadando");
    }
    
}
