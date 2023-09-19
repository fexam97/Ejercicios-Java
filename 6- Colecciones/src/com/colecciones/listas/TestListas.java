package com.colecciones.listas;

/*
    add() - añade
    remove() - elimina
    size() - tamaño
    get(posicion) - obtiene
    indexOf() - posicion de un elemento
    clear() - elimina los elementos 
    isEmpty() - indica si esta vacio
    sort() - ordena
    reverse() - invierte
    max() - maximo elemento
    min() - minimo elemento

*/
import java.util.*;

public class TestListas {

    public static void main(String[] args) {
        
        List<Integer> listasDeNumeros = new ArrayList<>();
        listasDeNumeros.add(1363);
        listasDeNumeros.add(22);
        listasDeNumeros.add(5);
        listasDeNumeros.add(53);
        listasDeNumeros.add(537);
        listasDeNumeros.add(123);
        listasDeNumeros.add(77);
        
        //listasDeNumeros.remove(0);
        
        
        System.out.println("Lista desordenada :");
        for(Integer valor : listasDeNumeros) {
            System.out.println(valor);
        }
 
        // el size es parecido al length
        System.out.println("\n El tamaño de la lista es : " + listasDeNumeros.size());
        
        // es para mostrar el elemento
        System.out.println(" Obtengo un elemento : " + listasDeNumeros.get(3));
        
        // lee el elemento y me muestra la posicion
        System.out.println( " posicion : " + listasDeNumeros.indexOf(5));
        
        /*  EL CLEAR TE ELIMINA TODA LA LISTA
        
        listasDeNumeros.clear();
        */
        
        
        Collections.sort(listasDeNumeros);
        
        System.out.println("\n Lista ordenada de menor a mayor :");
        for(Integer valor : listasDeNumeros) {
            System.out.println(valor);
                
        }
        
        System.out.println("\n ¿La lista está vacia ?  " + listasDeNumeros.isEmpty());
        
        System.out.println("\nEl mayor elemento es  : " + Collections.max(listasDeNumeros));
        System.out.println("El menor elemento es  : " + Collections.min(listasDeNumeros));
        
        
        System.out.println("\nRevertimos la lista : ");
        
        Collections.reverse(listasDeNumeros);
        
        for(Integer valor : listasDeNumeros) {
            System.out.println(valor);
        }
    }
}
