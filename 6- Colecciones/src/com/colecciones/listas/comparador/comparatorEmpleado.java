
package com.colecciones.listas.comparador;

import java.util.Comparator;

public class comparatorEmpleado implements Comparator<Empleado>{

@Override
    public int compare(Empleado primerEmpleado, Empleado segundoEmpleado) {
        
        return primerEmpleado.getNombre().compareTo(segundoEmpleado.getNombre());
        
    }
    
}

