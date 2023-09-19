package archivosBinarios;

import java.io.*;

public class TestBinarios {
    
    private void escribirBinarios() {
        
        try{
        FileOutputStream archivo = new FileOutputStream("personas.bin");
        ObjectOutputStream escritura = new ObjectOutputStream(archivo);
        
        escritura.writeObject(new Persona(25, "Fernando Meza"));
        escritura.writeObject(new Persona(22, "nahuel"));
        escritura.writeObject(new Persona(35, "Lionel Messi"));
        System.out.println("\nobjeto añadido con exito !");
        escritura.close();
        
        }
        catch(IOException error) {
            error.printStackTrace(System.out);
        }
    }
    
    private void LeerBiario() throws ClassNotFoundException{
    
        Persona persona;
        try{
            FileInputStream archivo = new FileInputStream("personas.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while(true) {
                persona = (Persona) lectura.readObject();
                persona.mostrarDatos();
                
            }
        }catch(Exception error) {
            error.printStackTrace(System.out);
        }
    
    }
    
    private void añadirBinario() {
        try{
            
        FileOutputStream archivo = new FileOutputStream("personas.bin", true);
        AñadirContenido escritura = new AñadirContenido(archivo);
        
        escritura.writeObject(new Persona(25, "Nelson salto"));
        escritura.writeObject(new Persona(25, "Pablo bukavec"));
        escritura.writeObject(new Persona(27, "Gaston luna"));
        System.out.println("\nobjeto añadido con exito !");
        escritura.close();
        
        }
        catch(IOException error) {
            error.printStackTrace(System.out);
        }
    }
    
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        TestBinarios test = new TestBinarios();
        test.escribirBinarios();
        test.añadirBinario();
        test.LeerBiario();
    }
    
}
