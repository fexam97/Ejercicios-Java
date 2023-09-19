package ejercicio13;

public class Electrodomesticos {
    
    private double precioBase = 100;
    private String color = "Blanco";
    private char consumoEnergetico = 'F';
    private double peso = 5;

    public Electrodomesticos() {
        
    }
    
    public Electrodomesticos(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
    
    public void ComprobarConsumoEnergetico(char letra) {
                
        if(getConsumoEnergetico() != letra) {
            
            letra = getConsumoEnergetico();
            System.out.println("Son distintos");
        }
        else
            System.out.println("Son inguales");
        
    }
    
    void precioFinal() {
       
        if(getPrecioBase() > 3) {
           precioBase = getPrecioBase() + 10;
        }
    }

    @Override
    public String toString() {
        return "precio: " + getPrecioBase() + "$\nColor: " + color + "\nConsumo energetico: " + consumoEnergetico + "Watts\nPeso:" + peso + " kg";
    }
    
    
}
