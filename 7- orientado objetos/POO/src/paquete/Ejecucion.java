package paquete;

public class Ejecucion {
    public static void main(String[] args) {
        
        //Creamos el objeto
        
        Lavadora lavadora = new Lavadora();
        
        String color = lavadora.color = "rojo";
        String modelo = lavadora.modelo = "ultimo modelo";
        int numeroSerie = lavadora.numeroSerie = 1234567;
        float precio = lavadora.precio = 900.9f;
        
        
        System.out.println("La lavadora tiene las siguientes caracteristicas: ");
        System.out.println("El color es: " + color);
        System.out.println("El modelo es: " + modelo);
        System.out.println("El numero de serie es: " + numeroSerie);
        System.out.println("El precio es: " + precio);
    }
}
