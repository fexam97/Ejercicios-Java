package com.colecciones.listas.comparador;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestEmpleado {

    public static void main(String[] args) {

        List<Empleado> listaDeEmpleados = new ArrayList<>();

        listaDeEmpleados.add(new Empleado("Allison", "Becker", "Brasil", 30, 25000));
        listaDeEmpleados.add(new Empleado("Trent", "Alexander Arnold", "Inglaterra", 26, 40000));
        listaDeEmpleados.add(new Empleado("Virgil", "Van Dijk", "Holanda", 31, 22000));
        listaDeEmpleados.add(new Empleado("Joe", "Gomez", "Inglaterra", 25, 10000));
        listaDeEmpleados.add(new Empleado("Andrew", "Robertson", "Inglaterra", 28, 20000));
        listaDeEmpleados.add(new Empleado("Stefan", "Bajčetić", "España", 18, 5000));
        listaDeEmpleados.add(new Empleado("Fabinho", "Tabares", "Brasil", 29, 55500));
        listaDeEmpleados.add(new Empleado("Jordan", "Henderson", "Inglaterra", 31, 105000));
        listaDeEmpleados.add(new Empleado("Darwin ", "Nuñez", "Uruguay", 23, 23500));
        listaDeEmpleados.add(new Empleado("Mo", "Salah", "Egipto", 30, 65000));
        listaDeEmpleados.add(new Empleado("Cody", "Gakpo", "Holanda", 21, 54400));
        
        
        Collections.sort(listaDeEmpleados, new comparatorEmpleado());
        
        System.out.println("\t\t  Equipo del Liverpool 2022-23 ");
        
        for(Empleado empleado : listaDeEmpleados ) {
            //System.out.println(empleado); -> asi no porque tenemos que obtener los atributos de los objetos
            System.out.println("Nombre : " + empleado.getNombre());
            System.out.println("Apellido : " + empleado.getApellido());
            System.out.println("Pais : " + empleado.getPais());
            System.out.println("Sueldo : $" + empleado.getSueldo() + "\n");
        }

        
        
    }

}
