package complejos;
public class NumeroComplejo {

    //Creamos los atributos de un numero complejo
    private double parteReal;
    private double parteImaginaria;

    public NumeroComplejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public double getParteReal() {
        return parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }
    
    // Creamos el metodo  para calcular la suma  de los numeros complejos 
    public NumeroComplejo calcularSuma(NumeroComplejo numero){
        NumeroComplejo suma = new NumeroComplejo(parteReal + numero.parteImaginaria, parteImaginaria + numero.parteImaginaria);
        return suma;
    }
    
    /*
        numero1 = 3 + 2i
        numero2 = 4 + 3i
    
        mult = (3*4 - 2*3) + (3*3 + 4*2)i = 6 + 17i
    */
    
    // Creamos el metodo para calcular el producto
    public NumeroComplejo calcularProducto(NumeroComplejo numero){
        NumeroComplejo multiplicacion = new NumeroComplejo
                                            ((parteReal * getParteReal() - parteImaginaria * numero.getParteImaginaria())
                                            , (parteReal*numero.getParteImaginaria() + numero.getParteReal()* parteImaginaria));
        
        return multiplicacion;
    }
    
    // Creamos el metodo para comprobar la igualdad
    public boolean comprobarIgualdad(NumeroComplejo numero){
        boolean igualdad = false;
        
        if((parteReal == numero.getParteReal()) && parteImaginaria == numero.parteImaginaria)
            igualdad = true;
        
        return igualdad;
    }
    
    // Creamos el metodo para calcular el producto de entero por complejo
    
    public NumeroComplejo multiplicarPorEntero(int numero){
        NumeroComplejo multiplicacion = new NumeroComplejo(parteReal * numero, parteImaginaria * numero);
        return multiplicacion;
    }
}
