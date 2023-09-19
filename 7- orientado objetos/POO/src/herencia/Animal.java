package herencia;

public class Animal {

    protected String nombre; // los protected se usan cuando quiero heredar
    protected int id;
    protected int edad;

    public Animal(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }
    
    public void comer(){
        System.out.println("El animal está comiendo");
    }
    
    
    
}
