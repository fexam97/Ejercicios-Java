package agenda;

public class Agenda {
    
    private Contacto contactos[];

    // le establecemos un tamaño por defecto de 10 contactos
    public Agenda() {   // el constructor vacio
        
        // le vamos a enseñar un tamaño por defecto 
        contactos = new Contacto[10];
    }
    
    // sobrecarga de constructores
    public Agenda(int tamaño){
        contactos = new Contacto[tamaño];
    }
    
    // Creamos el metodo para añadir contactos a la agenda
    
    public void AñadirContacto(Contacto contacto){
        if(ComprobarSiExisteContacto(contacto))
            System.out.println("\n Ya existe un contacto con ese nombre, ingrese otro \n");
        else if(ComprobarSiLaAgendaEstaLlena()){
                System.out.println("\n la agenda esta llena");
            } 
            else{
                boolean registrado = false;
                for (int i = 0; i < contactos.length && !registrado; i++) {
                    if(contactos[i] == null){ // si queda un espacio vacio en el vector
                        contactos[i] = contacto;
                        registrado = true;
                    }
                    
                }
                if(registrado == true)
                    System.out.println("\n El contacto se ha registrado con exito  ");
                else
                    System.out.println("No se ha podido registar el contacto");
            }
    }
    
    // Creamos el metodo para comprobar si existe un contacto con el mismo nombre
    
    public boolean ComprobarSiExisteContacto(Contacto contacto){
        for (int i = 0; i < contactos.length; i++) {
            if(contactos[i] != null && contactos[i].equals(contacto))
                return true;
        }
        return false; 
    }
    // Creamos el metodo para comprobar si la agenda esta llena
    public boolean ComprobarSiLaAgendaEstaLlena(){
        for (int i = 0; i < contactos.length; i++) {
            if(contactos[i] != null)
                return false; 
        }
        return true; // la agenda esta llena
    }
    // Creamos el metodo para lista los contactos
    public void listarContactos(){
        if(comprobarSiHayHuecosLibres() == contactos.length)
            System.out.println("No hay contactos para lista");
        else{
            for (int i = 0; i < contactos.length; i++) {
                if(contactos[i] != null){
                    System.out.println("nombre:" + contactos[i].getNombre());   // el get me hace acordar cuando usaba esctructuras en c
                    System.out.println("Telefono" + contactos[i].getTelefono());
                    System.out.println("");
                }
            }
        }
    }
    // Creamos el metodo para comprobar si hay espacios libres en el vector.
    public int comprobarSiHayHuecosLibres(){
        int contadorVacio = 0;
        for (int i = 0; i < contactos.length; i++) {
            if(contactos[i] == null)
                contadorVacio++;
        }
        return contadorVacio;
    }
    
    // Creamos el metodo para buscar un contacto por nombre
    
    public void BuscarContacto(String nombre){
        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if(contactos[i] == null && contactos[i].getNombre().trim().equalsIgnoreCase(nombre.trim())){
                System.out.println("\n Contacto encontrado, su telefono es:" + contactos[i].getTelefono());
                encontrado = true;
            }
        }
        
        if(!encontrado){ // !encontrado -> encontrado == false 
            System.out.println("No se ha encontrado el contacto");
        }
    }
    // Creamos el metodo para elminar el contacto
    public void EliminarContacto(Contacto contacto){
        boolean eliminado = false;
        for (int i = 0; i < contactos.length && !eliminado; i++) {
            if(contactos[i] != null && contactos[i].equals(contacto)){
                contactos[i] = null;
                eliminado = true;
            }
        }
        if(eliminado == true)
            System.out.println("El contacto se ha eliminado !");
        else
            System.out.println("El contacto no se ha eliminado ");
    }
}

