package condicionales;

import javax.swing.JOptionPane;

public class ordenarNumeroMayorAMenor // todavia no vi nada de vector y tengo que hacer como 20 if
{
    public static void main(String[] args)
    {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tercer numero"));
        
        
        if(numero1 > numero2 && numero1> numero3 && numero2 > numero3) // bien
            JOptionPane.showMessageDialog(null, "Los numeros ordenados son:" + numero1 + " " + numero2 + " " + numero3 );
        else
        {
            if(numero2 > numero1 && numero2 > numero3 && numero1 > numero3) // bien
                JOptionPane.showMessageDialog(null, "Los numeros ordenados son:" + numero2 + " " + numero1 + " " + numero3 );
            else
            {
                if(numero3 > numero1 && numero3 > numero2 && numero1 > numero2) // bien
                    JOptionPane.showMessageDialog(null, "Los numeros ordenados son:" + numero3 + " " + numero1 + " " + numero2 );
                else
                {
                    if(numero1 > numero2 && numero1 > numero3 && numero3 > numero2) //bien
                        JOptionPane.showMessageDialog(null, "Los numeros ordenados son:" + numero1 + " " + numero3 + " " + numero2 );
                    else
                    {
                        if(numero2 > numero1 && numero2 > numero3 && numero3 > numero1) // bien
                            JOptionPane.showMessageDialog(null, "Los numeros ordenados son:" + numero2 + " " + numero3 + " " + numero1 );
                        else
                            JOptionPane.showMessageDialog(null, "Los numeros ordenados son:" + numero3 + " " + numero2 + " " + numero1 );
                    }
                        
                }
            }
                
        }
    }    
}
