package T02P2Interfacesgraficas;
// Fig. 12.6: LabelFrame.java
// Componentes Jlabel con texto e iconos.
// especifica como se van a ordenar los componontes
import java.awt.FlowLayout;
// proporciona las caracteristicas basicas de una ventana
import javax.swing.JFrame;
//

public class MarcoPanel extends JFrame
{
    public static void main(String[] args){
        MarcoPanel demoPanel = new MarcoPanel();
        demoPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        demoPanel.setSize(450, 200);
        demoPanel.setVisible(true);
    }
} // fin de la clase MarcoPanel

