package controlador;

import static consie.Consie.ventana;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.VNivelPedagogico;

/**
 *
 * @author Diego
 */
public class CNivelPedagogico implements MouseListener {
    VNivelPedagogico vista;

    public CNivelPedagogico() {
        vista = new VNivelPedagogico();
        
        ventana.getContentPane().removeAll();
        ventana.add(vista);
        ventana.setTitle("Nivel Pedagógico");
        ventana.pack();
        addListeners();
    }

    private void addListeners() {
        /*vista.labelCerrar.addMouseListener(this);
        vista.labelMenu.addMouseListener(this);
        vista.panelMenu.addMouseListener(this);*/
    }

    @Override
    public void mouseClicked(MouseEvent me) {
       /* if (me.getSource() == vista.labelCerrar) {
            System.exit(0);
        } else if (me.getSource() == vista.labelMenu) {
            vista.panelMenu.setSize(200, 3000);
        }*/
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
        /*if (me.getSource() == vista.panelMenu) {
            vista.panelMenu.setSize(50, 3000);
        }*/
    }
}
