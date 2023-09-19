package clasesMetodoFinal;

public class FiguraCerrada extends Figura{
    
    public FiguraCerrada(double tamaño) {
        super(tamaño);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando figura cerrada de tamaño :  " + tamaño);
    }

    @Override
    public void pintar() {
        System.out.println("Pintando figura cerrada de tamaño :  " + tamaño);
    }
   
    
}
