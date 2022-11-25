package T02P2Interfacesgraficas;
// Fig. 12.2: Suam.java
// Programa de suma que utiliza a JOptionPane para la entrada y la salida.
import javax.swing.JOptionPane;

public class Suma
{
    public static void main(String[] args)
    {
        // obtiene la entrada del usuario de los dialogos de entrada de JOptionPane
        String primerNumero =
                JOptionPane.showInputDialog("Introduzca el primer entero");
        String segundoNumero =
                JOptionPane.showInputDialog("Introduzca el segundo entero");

        // convierte las entradas String en valores int para usarlos en un calculo
        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);

        int suma = numero1 + numero2;

        // muestra los resultados en un dialogo de mensajes de JOptionPane
        JOptionPane.showMessageDialog(null, "La suma es " + suma, "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE);
    }
} // fin de la clase Suma
