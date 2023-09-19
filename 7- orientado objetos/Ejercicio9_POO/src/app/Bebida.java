package app;

public class Bebida {

    private static int idActual = 1;

    // Creamos los atributos de la clase bebida
    private int id;
    private double cantidad;
    private double precio;
    private String marca;

    public Bebida(double cantidad, double precio, String marca) {
        this.id = idActual++; // mientras que cada registro vaya ingresando el id va incrementando
        this.cantidad = cantidad;
        this.precio = precio;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "\nid : " + id + "\nCantidad : " + cantidad + " Precio : " + precio + "Marca : " + marca;
    }

}
