package agenda;

public class Contacto {

    private String nombre;
    private int telefono;

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefono = 0; // le doy valor de inicio
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    // equals lo que hace es comprobar que no existan valores repetidos en el vector
    
    // equalsIgnoreCase es como el strcpm pero ignora si son mayusculas o minusculas
    
    public boolean equals(Contacto contacto){
        if(nombre.trim().equalsIgnoreCase(contacto.getNombre().trim())){
            // pepe
            //pepe          -> lo que hace trim es sacar los espacios qus estan de sobra
            
           return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return " \nombre:=" + nombre + "\ntelefono=" + telefono + "\n";
    }
    
    
}
