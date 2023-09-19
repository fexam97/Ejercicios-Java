package clasesMetodoFinal;

public class FiguraAbierta extends Figura{
    
    public FiguraAbierta(double tamaño) {
        super(tamaño);
    }

    @Override
    public void dibujar() {
        System.out.println("dibujando figura abierta de tamaño  : " + tamaño);
    }

    @Override
    public void pintar() {
        System.out.println("Pintando figura abierta de tamaño  : " + tamaño);
       }
    
    
    
}
