package archivosTexto;

import java.io.File;
import java.io.IOException;

public class ClaseFile {

    public static void main(String[] args) throws IOException {

        // Clase File
        
        
        
        //File archivo = new File("prueba.rxt");
        
        File archivo = new File("prueba.txt");
        
        
       /* 
       EL mkdir te crea carpetas !!
        
        if(archivo.mkdir()) 
            System.out.println("La carpeta ha sido creada con exito");
        else
            System.out.println("Ya existe eso, error.");
        */
       
       /*
       if(archivo.createNewFile())
            System.out.println("Archivo creado con exito");
       else
            System.out.println("Ya existe un archivo con ese nombre ");
        */
        
        System.out.println("nombre del archivo : " + archivo.getName());
        System.out.println("Ruta del archivo : " + archivo.getPath());
        System.out.println("Ruta absoluta del archivo : " + archivo.getAbsolutePath());
        System.out.println("¿Existe el archivo? : " + archivo.exists());
        System.out.println("¿Se puede escribir en el archivo?" + archivo.canWrite());
        System.out.println("¿Se puede leer el archivo" + archivo.canRead());
        System.out.println("¿ Es archivo ? : " + archivo.isFile());
        System.out.println("¿ Es directorio ? : " + archivo.isDirectory());
        System.out.println("Longitud : " + archivo.length());
    }

}
