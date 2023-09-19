package com.softwarepeliculas.datos;

import com.softwarepeliculas.domain.Pelicula;
import com.softwarepeliculas.excepciones.AccesoDatosExcepcion;
import com.softwarepeliculas.excepciones.EscrituraDatosExcepcion;
import com.softwarepeliculas.excepciones.LecturaDatosExcepcion;
import java.util.List;
import java.io.*;
import java.util.ArrayList;

public class AccesoDatosImpl implements IAccesoDatos{

    @Override
    public boolean comprobarSiExisteArchivo(String nombreRecurso) throws AccesoDatosExcepcion {
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosExcepcion {
        File archivo = new File(nombreRecurso);
        
        List<Pelicula> peliculas = new ArrayList<>(); // hay que retornar esto
       
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo)); //BufferedReader es una clase de Java para leer el texto de una secuencia de entrada (como un archivo) 
                                                                                  //almacenando en el búfer caracteres que leen a la perfección caracteres, matrices o líneas.
            String contenido = null;   
            contenido = entrada.readLine();
            
            while(contenido != null) {
                Pelicula pelicula = new Pelicula(contenido);
                peliculas.add(pelicula);
                contenido = entrada.readLine();
            }
            entrada.close();
            
        }catch(IOException error){
            error.printStackTrace(System.out);
            throw new LecturaDatosExcepcion("Excepcion a listar peliculas" + error.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosExcepcion {
        
        File archivo = new File(nombreRecurso);
        try{
            
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.print(pelicula.toString());
            salida.close();
            System.out.println("Se ha añadido la pelicula " + pelicula + "\n");
            
        }catch(IOException error){
            error.printStackTrace(System.out);
            throw new EscrituraDatosExcepcion("Excepcion al escribir en el archivo : " + error.getMessage());
        }
   }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosExcepcion {
        
        File archivo = new File(nombreRecurso);
        String resultado = null;
        
        try{
            
            BufferedReader entrada = new BufferedReader(new FileReader(archivo)); // vamos a crear un crear una memoria temporal y le pasamos el archivo a leer.
            String linea = null;
            linea = entrada.readLine();
            int indice = 1;
            
            while(linea != null) {
                
                if(buscar != null && buscar.equalsIgnoreCase(linea)) {
                    System.out.println("");
                    resultado = "pelicula" + linea + "encontrada en el indice " + indice;
                    break;
                }
                linea = entrada.readLine();
                indice++;
            }
            
            entrada.close();
            
        }catch(IOException excepcion) {
            excepcion.printStackTrace(System.out);
            throw new LecturaDatosExcepcion("Excepcion al buscar la pelicula" + excepcion.getMessage());
        }
        
        return resultado;
      }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosExcepcion {
        File archivo = new File(nombreRecurso);
        
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
            
        }catch(IOException excepcion) {
            excepcion.printStackTrace(System.out);
            throw new AccesoDatosExcepcion("Excepcion al crear el archivo" + excepcion.getMessage());
        }
     }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosExcepcion {
        
        File archivo = new File(nombreRecurso);
        
        if(archivo.exists()) {
            archivo.delete();
        }
        System.out.println("Se ha borrado el archivo ");
    }    
}
