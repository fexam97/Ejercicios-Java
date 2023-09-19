package bucleForEach;

public class Test {
    public static void main(String[] args) {
        
        // creamos el arreglo de objetos
        
        Persona personas[] = new Persona[4];
        
        personas[0] = new Persona("Lionel", "messi", 35, 5314314);
        personas[1] = new Persona("sergio", "aguero", 34, 16146133);
        personas[2] = new Persona("angel", "Di maria", 34, 1363451);
        personas[3] = new Persona("dibu", "martinez", 30, 53631613);
        
        for(Persona persona: personas){
            persona.mostrarDatos();
            System.out.println("");
        }
    }
}
