package modificadores;

public class Modificadores {
   
    public int edad;
    public String nombre;
    
    public Modificadores(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }
     
    public void describir(){
        System.out.println("El alumno " + nombre + " tiene " + edad + "años");
    }
    
    public void saludar(){
        describir();
        System.out.println("Buenos dias !!");
    }
    
    void despedir(){
        System.out.println("adios. ");
    }
}
