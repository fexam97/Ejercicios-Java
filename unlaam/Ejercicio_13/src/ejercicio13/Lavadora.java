package ejercicio13;

public class Lavadora extends Electrodomesticos{

    private int carga = 5;

    public Lavadora() {
        
    }
    
    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
    

    @Override
    void precioFinal() {
       if(getCarga() > 30) {
           System.out.println("Esta pesada la cosa");
       }
    }
    
    
    
    
}
