package ejercicio6;

public class CuatroPuntos {
 
    /*
    Escribe un programa que instancie cuatro puntos: el origen, el punto (5,3), el
    punto (-8,90), y para el cuarto, el punto medio entre el segundo y el tercero.
    
    */
    
    public static void main(String[] args) {
        
     int x1 = 0, y1 = 0;
     int x2 = 5, y2 = 3;
     int x3 = -8, y3 = 90;
     int x4 = (x2 + x3) / 2;
     int y4 = (y2 + y3) / 2;
        
        System.out.println("punto 1 :("+ x1 + " , " + x1 +") "); // (0, 0)
        System.out.println("punto 2 :("+ x2 + " , " + y2 +") "); // (5, 3)
        System.out.println("punto 3 :("+ x3 + " , " + y3 +") "); // (-8, 90)
        System.out.println("punto 4 :("+ x4 + " , " + y4 +") ");
        
        /*
        
        punto medio es : M ( x1 + x2 / 2   ,   y1 + y2 / 2)
        
        */
        
       
        
    }
    
}
