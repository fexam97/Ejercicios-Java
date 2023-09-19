package archivosTexto;

import java.io.*;


public class ArchivosTexto {

    File archivo;
    
    private void crearArchivoDeTexto() {
        
        archivo = new File("archivo.txt");
        
        try{
            if(archivo.createNewFile())
                System.out.println("Archivo creado con exito");
            else
                System.out.println("Archivo ya existente, no se pudo crear");
        }
        catch(IOException exception) {
            exception.printStackTrace(System.out);
        }
        
    }
    
    private void eliminarArchivo() {
        
            if(archivo.delete())
                System.out.println("Archivo eliminado con exito");
            else
                System.out.println("Error al eliminar el archivo");
            
            // es innecesario el try y el catch
    }
      
    
    //Creamos el metodo para escribir el archivo de texto
    
    private void escribirAlArchivoDeTexto() {
        try {
            FileWriter escritura = new FileWriter(archivo);
            
            escritura.write("Saludos !!!");
            escritura.write("\n debo empezar base de datos !");
            escritura.close();
          
            System.out.println("\n Texto añadido");
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
        }
    }
    
    // Creamos el metodo para leer un archivo de texto
    
    private void leerArchivoDeTexto() {
        
        String contenido;
        
        try {
            FileReader lector = new FileReader(archivo); // Indicamos el archivo a leer
            BufferedReader lectura = new BufferedReader(lector);
            
            contenido = lectura.readLine();
            
            while(contenido != null) {
            System.out.println(contenido);
            contenido = lectura.readLine();
            }
            
        } catch (IOException excepcion) {
            excepcion.printStackTrace(System.out);
        }
        
    }
    
    public static void main(String[] args) {
        
        ArchivosTexto archivoTexto = new ArchivosTexto();
        
        archivoTexto.crearArchivoDeTexto();
        //archivoTexto.escribirAlArchivoDeTexto();
        archivoTexto.leerArchivoDeTexto();
        
    }
}
    

