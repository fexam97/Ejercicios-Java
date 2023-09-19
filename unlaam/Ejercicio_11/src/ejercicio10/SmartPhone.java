package ejercicio10;

public class SmartPhone extends Celular{
    
    private float camara;
    private double memoriaRam;
    private double almacenamiento;

    public SmartPhone(float camara, double memoriaRam, double almacenamiento) {
        this.camara = camara;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
    }

    @Override
    public void informarDetalles() {
        System.out.println("El Celular tiene: \n");
        System.out.println(camara + " megapixeles ");
        System.out.println(memoriaRam + "GB  memoria ram");
        System.out.println(almacenamiento + "GB  de amacenamiento");
    }

    public void setCamara(float camara) {
        this.camara = camara;
    }

    public void setMemoriaRam(double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    
    
    
    
}
