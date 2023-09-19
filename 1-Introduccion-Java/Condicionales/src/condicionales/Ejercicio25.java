package condicionales;

import javax.swing.JOptionPane;

/*
    crear un programa que pida un caracter y dado a ese caracter poder
    convertirlo a mayuscula o minusculas.
*/

public class Ejercicio25
{
    public static void main(String[] args)
    {
        char caracter = JOptionPane.showInputDialog("Ingrese un caracter").charAt(0);
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(" digite una opcion"
                                                                 + "\n  1 - convertir a mayuscula "
                                                                 + "\n  2 - convertir a minuscula "));
        
        if(opcion == 1)
        {
            if(Character.isUpperCase(caracter))
                JOptionPane.showMessageDialog(null, "El caracter ya está en mayusculas");
            else
            {
                char caracterMayuscula = Character.toUpperCase(caracter);
                JOptionPane.showMessageDialog(null, "el caracter:" + caracter + " ahora es: " + caracterMayuscula);
            }    
        }
        else
        {
            if(Character.isLowerCase(caracter))
                JOptionPane.showMessageDialog(null, "El caracter ya está en minuscula");
            else
            {
                char caracterMinuscula = Character.toLowerCase(caracter);
                JOptionPane.showMessageDialog(null, "el caracter: " + caracter + " ahora es: " + caracterMinuscula);
            }
        }    
    }
}
