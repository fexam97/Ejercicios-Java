package com.softwarepeliculas.servicio;

import com.softwarepeliculas.datos.AccesoDatosImpl;
import com.softwarepeliculas.datos.IAccesoDatos;
import com.softwarepeliculas.domain.Pelicula;
import com.softwarepeliculas.excepciones.AccesoDatosExcepcion;
import java.util.List;

public class ControlPeliculasImpl implements IControlPeliculas{

    
    private final IAccesoDatos datos;
  
    public ControlPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }        
            
    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        
        try{
            
            anexar = datos.comprobarSiExisteArchivo(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
            
        }catch(AccesoDatosExcepcion excepcion){
            System.out.println("Error a acceso datos ");
            excepcion.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        
        try{
            List<Pelicula> peliculas = this.datos.listar(NOMBRE_RECURSO);
            for(Pelicula pelicula : peliculas) {
                System.out.println("" + pelicula);
            }
            
        }catch(AccesoDatosExcepcion excepcion){
            System.out.println("Error a acceso datos ");
            excepcion.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String peliculaABuscar) {
        String resultado = null;
        
        try{
            resultado = this.datos.buscar(NOMBRE_RECURSO, resultado);
            
        }catch(AccesoDatosExcepcion excepcion){
            System.out.println("Error al acceso datos ");
            excepcion.printStackTrace(System.out);
        }
        
        if(resultado == null) {
            System.out.println("No se ha encontrado la pelicula");
        }
        else {
            System.out.println("Pelicula encontrada : " + resultado);
        }
    }

    @Override
    public void iniciarControlDePeliculas() {
        
        // Este metodo crear y elimina un archivo de texto 
        
        try{
            if(this.datos.comprobarSiExisteArchivo(NOMBRE_RECURSO)) {
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            }else {
                datos.crear(NOMBRE_RECURSO);
            }
            
        }catch(Exception excepcion) {
            System.out.println("Error acceso datos ");
            excepcion.printStackTrace(System.out);
        }
    }
    
}
