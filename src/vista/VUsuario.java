package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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
 * @author Daniel
 */
public class VUsuario extends javax.swing.JPanel {

    /**
     * Creates new form VistaEstudiante1
     */
    public VUsuario() {
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
        jScrollPane3 = new JScrollPane();
        panelFormulario = new JPanel();
        jLabel5 = new JLabel();
        txtFuncionario = new JTextField();
        jLabel1 = new JLabel();
        txtNombre = new JTextField();
        jLabel10 = new JLabel();
        txtApellido = new JTextField();
        jLabel4 = new JLabel();
        txtUsuario = new JTextField();
        jLabel6 = new JLabel();
        txtContrasenia = new JPasswordField();
        jLabel7 = new JLabel();
        txtContrasenia2 = new JPasswordField();
        jLabel8 = new JLabel();
        cbxPregunta = new JComboBox<>();
        jLabel9 = new JLabel();
        txtRespuesta = new JTextField();
        jLabel2 = new JLabel();
        jScrollPane2 = new JScrollPane();
        lstFunciones = new JList<>();
        btnNuevo = new JButton();
        btnAgregar = new JButton();
        btnModificar = new JButton();
        btnEliminar = new JButton();
        btnContrasenia = new JButton();
        jScrollPane1 = new JScrollPane();
        tabla = new JTable();

        setBackground(new Color(255, 255, 255));

        jLabel3.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Usuario");
        jLabel3.setName("jLabel3"); // NOI18N

        jSeparator1.setName("jSeparator1"); // NOI18N

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        panelFormulario.setBackground(new Color(255, 255, 255));
        panelFormulario.setName("panelFormulario"); // NOI18N

        jLabel5.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Funcionario:");
        jLabel5.setName("jLabel5"); // NOI18N

        txtFuncionario.setName("txtFuncionario"); // NOI18N
        txtFuncionario.setNextFocusableComponent(txtUsuario);

        jLabel1.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nombre:");
        jLabel1.setName("jLabel1"); // NOI18N

        txtNombre.setEditable(false);
        txtNombre.setName("txtNombre"); // NOI18N

        jLabel10.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Apellido:");
        jLabel10.setName("jLabel10"); // NOI18N

        txtApellido.setEditable(false);
        txtApellido.setName("txtApellido"); // NOI18N

        jLabel4.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Usuario:");
        jLabel4.setName("jLabel4"); // NOI18N

        txtUsuario.setName("txtUsuario"); // NOI18N
        txtUsuario.setNextFocusableComponent(txtContrasenia);

        jLabel6.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Contraseña:");
        jLabel6.setName("jLabel6"); // NOI18N

        txtContrasenia.setName("txtContrasenia"); // NOI18N
        txtContrasenia.setNextFocusableComponent(txtContrasenia2);

        jLabel7.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Repetir Contraseña:");
        jLabel7.setName("jLabel7"); // NOI18N

        txtContrasenia2.setName("txtContrasenia2"); // NOI18N
        txtContrasenia2.setNextFocusableComponent(cbxPregunta);

        jLabel8.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Pregunta Secreta:");
        jLabel8.setName("jLabel8"); // NOI18N

        cbxPregunta.setName("cbxPregunta"); // NOI18N

        jLabel9.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Respuesta:");
        jLabel9.setName("jLabel9"); // NOI18N

        txtRespuesta.setName("txtRespuesta"); // NOI18N

        jLabel2.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Funciones:");
        jLabel2.setName("jLabel2"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        lstFunciones.setName("lstFunciones"); // NOI18N
        jScrollPane2.setViewportView(lstFunciones);

        btnNuevo.setBackground(new Color(238, 24, 24));
        btnNuevo.setFont(new Font("Tahoma", 0, 12)); // NOI18N
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

        btnContrasenia.setBackground(new Color(255, 0, 0));
        btnContrasenia.setForeground(new Color(255, 255, 255));
        btnContrasenia.setText("Contraseña");
        btnContrasenia.setBorder(new MatteBorder(null));
        btnContrasenia.setBorderPainted(false);
        btnContrasenia.setName("btnContrasenia"); // NOI18N

        GroupLayout panelFormularioLayout = new GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel1))))
                        .addGap(18, 18, 18)
                        .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContrasenia, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFuncionario, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContrasenia2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                                .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(btnContrasenia, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNuevo, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnModificar, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregar, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxPregunta, 0, 150, Short.MAX_VALUE)
                                    .addComponent(txtRespuesta, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel6)
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelFormularioLayout.setVerticalGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFuncionario, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtContrasenia, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtContrasenia2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(btnNuevo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnContrasenia, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbxPregunta, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtRespuesta, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(panelFormulario);

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
                    .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnAgregar;
    private JButton btnContrasenia;
    private JButton btnEliminar;
    private JButton btnModificar;
    private JButton btnNuevo;
    private JComboBox<String> cbxPregunta;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JSeparator jSeparator1;
    private JList<String> lstFunciones;
    private JPanel panelFormulario;
    private JTable tabla;
    private JTextField txtApellido;
    private JPasswordField txtContrasenia;
    private JPasswordField txtContrasenia2;
    private JTextField txtFuncionario;
    private JTextField txtNombre;
    private JTextField txtRespuesta;
    private JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public JButton getBtnContrasenia() {
        return btnContrasenia;
    }
    
    public JButton getBtnNuevo() {
        return btnNuevo;
    }

    public JList<String> getLstFunciones() {
        return lstFunciones;
    }

    public JPanel getPanelFormulario() {
        return panelFormulario;
    }

    public JTable getTabla() {
        return tabla;
    }

    public JPasswordField getTxtContrasenia() {
        return txtContrasenia;
    }

    public JPasswordField getTxtContrasenia2() {
        return txtContrasenia2;
    }

    public JTextField getTxtRespuesta() {
        return txtRespuesta;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public JComboBox<String> getCbxPregunta() {
        return cbxPregunta;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public JTextField getTxtFuncionario() {
        return txtFuncionario;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }
    
}
