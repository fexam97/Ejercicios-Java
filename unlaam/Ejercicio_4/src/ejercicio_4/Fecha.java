package ejercicio_4;

public class Fecha {
    
    public int dia;
    public int mes;
    public int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Fecha() {
    }
    
    
    
    public boolean validarFecha(Fecha fecha) {
        
       int cantDiaMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       
       if(cantDiaMes[getMes() - 1] < getDia()) {
           if(fecha.getMes() == 2 && fecha.getDia() == 29) {
               if(fecha.getAño() % 4 == 0 && (fecha.getAño() % 400 == 0)) {
                   System.out.println("la fecha es valida");
                   return true;
               }
               else{
                   System.out.println("La fecha es invalida");
                   return false;
               }
           }
           
       }
        return false;
    }
    
}
