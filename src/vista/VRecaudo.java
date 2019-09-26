package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eggo
 */
public class VRecaudo extends javax.swing.JPanel {

    /**
     * Creates new form VistaEstudiante1
     */
    public VRecaudo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new JLabel();
        jSeparator1 = new JSeparator();
        jScrollPane2 = new JScrollPane();
        panelForm = new JPanel();
        jLabel4 = new JLabel();
        txtNombre = new JTextField();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        txtNumFrecuencia = new JTextField();
        comBoxFrecuencia = new JComboBox<>();
        btnNuevo = new JButton();
        btnAgregar = new JButton();
        btnModificar = new JButton();
        btnEliminar = new JButton();
        jScrollPane1 = new JScrollPane();
        tabla = new JTable();

        setBackground(new Color(255, 255, 255));

        jLabel3.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Recaudo");
        jLabel3.setName("jLabel3"); // NOI18N

        jSeparator1.setName("jSeparator1"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        panelForm.setBackground(new Color(255, 255, 255));
        panelForm.setName("panelForm"); // NOI18N

        jLabel4.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nombre:");
        jLabel4.setName("jLabel4"); // NOI18N

        txtNombre.setName("txtNombre"); // NOI18N

        jLabel5.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Frecuencia de entrega:");
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("cada");
        jLabel6.setName("jLabel6"); // NOI18N

        txtNumFrecuencia.setColumns(2);
        txtNumFrecuencia.setName("txtNumFrecuencia"); // NOI18N

        comBoxFrecuencia.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        comBoxFrecuencia.setModel(new DefaultComboBoxModel<>(new String[] { "Días", "Semanas", "Meses", "Años" }));
        comBoxFrecuencia.setName("comBoxFrecuencia"); // NOI18N

        btnNuevo.setBackground(new Color(238, 24, 24));
        btnNuevo.setForeground(new Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(new MatteBorder(null));
        btnNuevo.setBorderPainted(false);
        btnNuevo.setName("btnNuevo"); // NOI18N

        btnAgregar.setBackground(new Color(255, 0, 0));
        btnAgregar.setForeground(new Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(new MatteBorder(null));
        btnAgregar.setBorderPainted(false);
        btnAgregar.setName("btnAgregar"); // NOI18N

        btnModificar.setBackground(new Color(255, 0, 0));
        btnModificar.setForeground(new Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(new MatteBorder(null));
        btnModificar.setBorderPainted(false);
        btnModificar.setName("btnModificar"); // NOI18N

        btnEliminar.setBackground(new Color(255, 0, 0));
        btnEliminar.setForeground(new Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new MatteBorder(null));
        btnEliminar.setBorderPainted(false);
        btnEliminar.setName("btnEliminar"); // NOI18N

        GroupLayout panelFormLayout = new GroupLayout(panelForm);
        panelForm.setLayout(panelFormLayout);
        panelFormLayout.setHorizontalGroup(panelFormLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumFrecuencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comBoxFrecuencia, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelFormLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelFormLayout.setVerticalGroup(panelFormLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtNumFrecuencia, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(comBoxFrecuencia, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(panelForm);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tabla.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.setName("tabla"); // NOI18N
        jScrollPane1.setViewportView(tabla);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnAgregar;
    private JButton btnEliminar;
    private JButton btnModificar;
    private JButton btnNuevo;
    private JComboBox<String> comBoxFrecuencia;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JSeparator jSeparator1;
    private JPanel panelForm;
    private JTable tabla;
    private JTextField txtNombre;
    private JTextField txtNumFrecuencia;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public JButton getBtnNuevo() {
        return btnNuevo;
    }

    public JTable getTabla() {
        return tabla;
    }

    public JComboBox<String> getComBoxFrecuencia() {
        return comBoxFrecuencia;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtNumFrecuencia() {
        return txtNumFrecuencia;
    }
}
