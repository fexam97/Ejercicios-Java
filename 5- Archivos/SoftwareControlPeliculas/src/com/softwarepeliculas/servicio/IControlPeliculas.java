package com.softwarepeliculas.servicio;

public interface IControlPeliculas {
    
    final String NOMBRE_RECURSO = "peliculas.txt";
    
    public void agregarPelicula(String nombrePelicula);
    
    public void listarPeliculas();
    
    public void buscarPelicula(String peliculaABuscar);
    
    public void iniciarControlDePeliculas();
    
}
