package ecuacion;

public class Raices {

    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private double obtenerDiscriminante(){
        return Math.pow(b, 2) - 4 * a*c;
    }
    
    private void obtenerRaices(){
        double xUno = - b + obtenerDiscriminante() / 2*a;
        double xDos = - b - obtenerDiscriminante() / 2*a;
        
        System.out.println("La solucion x1 es: " + xUno);
        System.out.println("La solucion x2 es: " + xDos);
    }
    
    private void obtenerRaiz(){
        double solucion = -b / 2*a;
        System.out.println("La unica solucion es: " + solucion);
    }
    
    private boolean comprobarSiTieneRaices(){
        
        return obtenerDiscriminante() > 0;
    }
    
    private boolean comprobarSiTieneRaiz(){
        return obtenerDiscriminante() == 0;
    }
    
    public void calcular(){
        if(comprobarSiTieneRaices() ){
            obtenerRaiz();
        }
        else
            System.out.println("no tiene solucion");
    }
}
