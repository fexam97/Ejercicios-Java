package excepciones;

// la excepcion no es un error
// la excepcion indica en donde te estas equivocando

public class TestExcepciones {

    public static void main(String[] args) {

        
        int primerNumero = 9;
        int segundoNumero = 0;
        
        try{
            int division = primerNumero / segundoNumero;
            System.out.println("La division es" + division);
        }catch(Exception excepcion){
            System.out.println("Ocurrio una excepcion");
             System.out.println("Excepcion : " + excepcion.getMessage());
             excepcion.printStackTrace(System.out);
        }
        
    }
             
}

