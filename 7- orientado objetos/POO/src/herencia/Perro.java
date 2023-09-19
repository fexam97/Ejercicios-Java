package herencia;

public class Perro extends Animal{
    
  //  public String ColorPelo;
    
    public Perro(String nombre, int id, int edad) {
        super(nombre, id, edad);
    }

    @Override
    public void comer() {
        System.out.println("El perro come dogui");
        System.out.println("El nombre del perro es :" + nombre);
        System.out.println("El id del perro es : " + id);
        System.out.println("La edad del perro es: " + edad);
    }
    
    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }
    
}
