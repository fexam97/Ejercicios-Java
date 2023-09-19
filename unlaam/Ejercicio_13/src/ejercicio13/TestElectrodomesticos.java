package ejercicio13;

public class TestElectrodomesticos {

    public static void main(String[] args) {
        
        Electrodomesticos microndas = new Electrodomesticos(500, "Celeste", 'a', 60);
        Electrodomesticos heladera = new Electrodomesticos();
        
        microndas.toString();
        System.out.println("");
        heladera.toString();
        
    }
    
}
