package ejercicio10;

public class TestCelular {

    public static void main(String[] args) {
        
        Celular celularUno = new Celular();
        Celular celularDos = new Celular("Negro", "s22", "Samsung");
        
        celularUno.setColor("azul");
        celularUno.setMarca("Motorola");
        celularUno.setModelo("e20");
        
        celularUno.llamar("Rodrigo");
        celularUno.cortar();
        
        System.out.println("");
        
        celularUno.informarCaracteristicas();
        celularDos.informarCaracteristicas();
    }
    
}
