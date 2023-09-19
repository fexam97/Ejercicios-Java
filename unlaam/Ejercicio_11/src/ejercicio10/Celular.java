package ejercicio10;

public class Celular {
    
    private String color;
    private String modelo;
    private String marca;

    public Celular() {
        
    }
    
    public Celular(String color, String modelo, String marca) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void llamar(String nombre) {
        System.out.println("Llamando a " + nombre + "...");
    }
    
    public void cortar() {
        System.out.println("cortando llamada.");
    }
    
    public void informarCaracteristicas() {
        System.out.println("\n El celular  " + getMarca() + " modelo " + getModelo() + " es de color  " + getColor());
    }
    
    public  void informarDetalles() {
        
    }
    
    
}
