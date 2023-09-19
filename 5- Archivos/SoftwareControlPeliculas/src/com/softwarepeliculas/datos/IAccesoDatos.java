package com.softwarepeliculas.datos;

// una lista es como un arreglo dinamico , algo dinamico es no tiene un tamaño
// Contiene las operaciones a ejercutar en el archivo
import com.softwarepeliculas.domain.Pelicula;
import com.softwarepeliculas.excepciones.AccesoDatosExcepcion;
import com.softwarepeliculas.excepciones.EscrituraDatosExcepcion;
import com.softwarepeliculas.excepciones.LecturaDatosExcepcion;
import java.util.List;

public interface IAccesoDatos {

    // Creamos los metodos necesarios para ejecutar operaciones al archivo
    public boolean comprobarSiExisteArchivo(String nombreRecurso) throws AccesoDatosExcepcion;

    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosExcepcion;

    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosExcepcion;

    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosExcepcion;

    public void crear(String nombreRecurso) throws AccesoDatosExcepcion;

    public void borrar(String nombreRecurso) throws AccesoDatosExcepcion;
}
