package app;

public class Almacen {

    private Bebida estanteria[][];

    // Con este constructor le vamos a indicar el tamaño de la matriz
    public Almacen(int filas, int columnas) {
        estanteria = new Bebida[filas][columnas];
    }

    // ccon este constructor le decimos a esta matriz que tiene un tamaño por defecto de 5x5. 
    public Almacen() {
        estanteria = new Bebida[5][5];
    }

    // Creamos el metodo para agregar la bebida
    public void agregarBebida(Bebida bebida) {
        boolean encontrado = false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
                if (estanteria[i][j] == null) {
                    estanteria[i][j] = bebida;
                    encontrado = true; //salgo del ciclo
                }
            }
        }
        if (encontrado) {
            System.out.println("\nBebida añadida");
        } else {
            System.out.println("\nNo se ha podido añadir la bebida");
        }
    }

    // Creamos el metodo para calcular el precio de las bebidas
    public double calcularPrecioBebidas() {
        double precioTotal = 0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {
                    precioTotal += estanteria[i][j].getPrecio();
                }
            }
        }

        return precioTotal;
    }

    // Creamos el metodo para mostrar las bebidas
    public void mostrarBebidas() {
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j] != null) {
                    System.out.println("\nFila : " + i + "\n Columna : " + j + "\nBebida:" + estanteria[i][j].toString());
                }
            }

        }
    }

    // Creamos el metodo para eliminar la bebida
    public void eliminarBebida(int id) {
        boolean encontrado = false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
                if (estanteria[i][j] == null) {
                    if (estanteria[i][j].getId() == id) {
                        estanteria[i][j] = null;
                        encontrado = true; //salgo del ciclo
                    }
                } else {
                    System.out.println("no se encontro la bebida");
                }
            }
        }

    }
}
