package clasesMetodoFinal;

public class Figura {
    
    protected double tamaño;
    
    public void dibujar(){
        System.out.println("Dibujando figura");
    }
    
    public void pintar(){
        System.out.println("Pintado la figura ");
    }

    public Figura(double tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
