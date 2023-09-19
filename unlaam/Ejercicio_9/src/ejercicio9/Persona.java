package ejercicio9;

/*
    crear una class Persona con: Atributos privados
-   nombre (string)
-   idPersona (int) 
-   atributo estático contadoPersona (int).
-   Getters y setters correspondientes.
-   Constructor parametrizado que solicite el nombre e inserte un idPersona.
Crear un método mostrar que muestre id y nombre.
En el main:
Crear 3 personas, solicitar los nombres por teclado y mostrarlos junto con su
id.
Finalmente mostrar la cantidad de personas registradas
*/

public class Persona {
    
    private String nombre;
    private int idPersona;
    private static int contadoPersona;

    public Persona(String nombre, int idPersona) {
        this.nombre = nombre;
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public static int getContadoPersona() {
        return contadoPersona;
    }

    public static void setContadoPersona(int contadoPersona) {
        Persona.contadoPersona = contadoPersona;
    }
    
    public void mostrarPersona(Persona persona) {
        System.out.println("nombre : " + persona.getNombre() + " id : " + persona.getIdPersona());
    }
    
    
}
