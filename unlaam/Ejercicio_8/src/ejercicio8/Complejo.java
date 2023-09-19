package ejercicio8;

    /*

Contendrá, además de los setters y getters, los siguientes métodos:
- sumar : para sumar dos números complejos. (a, b) + (c, d) = (a + c, b + d);
- restar : para restar dos números complejos. (a, b) - (c, d) = (a - c, b - d);
- multiplicar : para multiplicar dos números complejos. (a, b) * (c, d) = (a*c – b*d, a*d + b*c)
- multiplicar : para multiplicar un número complejo por un número double: (a, b) * n = (a * n, b * n)
- dividir: para dividir dos números complejos: (a, b) / (c, d) = ((a*c + b*d) / (c2 + d2) , (b*c – a*d) / (c2 + d2))

Todos los métodos anteriores devuelven el objeto número complejo resultado de la operación
*/

public class Complejo {

    private double parteReal;
    private double parteImaginaria;

    // Constructor por defecto
    public Complejo() {
        
    }
    
    public Complejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }
    
    public Complejo sumar(Complejo numero){
        
        Complejo suma = new Complejo();
        
        suma.parteReal = parteReal + numero.parteReal;
        suma.parteImaginaria = parteImaginaria + numero.parteImaginaria;
        
       return suma;
    }
    
    public Complejo restar(Complejo numero) {
        
        Complejo resta = new Complejo();
        
        resta.parteReal = (parteReal - numero.parteReal);
        resta.parteImaginaria = parteImaginaria - numero.parteImaginaria;
 
        return resta;
        
    }
    public Complejo multiplicar(Complejo numero) {
        
        Complejo producto = new Complejo();
        
        producto.parteReal = (parteReal * numero.parteReal) - (parteImaginaria * numero.parteImaginaria); //(a, b) * (c, d) = (a*c – b*d, a*d + b*c)
        producto.parteImaginaria = (parteReal * numero.parteImaginaria) + (parteImaginaria * numero.parteReal);
        
        return producto;
    }
    
    public Complejo multiplicarPorDouble(double c) {
        
        Complejo producto = new Complejo();
        
        producto.parteReal = parteReal * c;
        producto.parteImaginaria = parteImaginaria * c;
        
        return producto;
    }
    
    public Complejo Dividir(Complejo numero) {
        
        Complejo cociente = new Complejo();
        
        cociente.parteReal = (parteReal * numero.parteReal + parteImaginaria * numero.parteImaginaria)  / ((numero.parteReal * numero.parteReal) + (numero.parteImaginaria * numero.parteImaginaria ));
        cociente.parteImaginaria = (parteImaginaria * parteReal - parteReal * numero.parteImaginaria)  / ((numero.parteReal * numero.parteReal) + (numero.parteImaginaria * numero.parteImaginaria ));
        return cociente;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Complejo other = (Complejo) obj;
        if (Double.doubleToLongBits(this.parteReal) != Double.doubleToLongBits(other.parteReal)) {
            return false;
        }
        if (Double.doubleToLongBits(this.parteImaginaria) != Double.doubleToLongBits(other.parteImaginaria)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return " (" + parteReal + ", " +  parteImaginaria + "i )";
    }
    
    
    
}
