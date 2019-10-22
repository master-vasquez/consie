package controlador;

import static consie.Consie.ventana;
import static controlador.CVentana.marco;
import static controlador.CVentana.panelPrincipal;
import general.Funciones;
import general.Validaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import modelo.MFuncion;
import modelo.MFuncionario;
import modelo.MUsuario;
import vista.VUsuario;

/**
 *
 * @author Diego
 */
public class CUsuario implements ActionListener, MouseListener, KeyListener {

    VUsuario vista;
    MUsuario modelo;

    MFuncionario funcionario;

    MFuncion modeloFuncion;
    MFuncion[] datosFuncion;

    DefaultListModel modeloLstFuncion;
    DefaultTableModel modeloTabla;

    Validaciones val = new Validaciones();

    String msj = "";
    boolean bol = true;
    HashMap<Integer, String> preguntas;
    DefaultComboBoxModel<String> modelP = new DefaultComboBoxModel<String>();

    Funciones f = new Funciones();

    public CUsuario() {
        System.out.println("Iniciando CUsuario");
        vista = new VUsuario();
        modelo = new MUsuario();

        funcionario = new MFuncionario();

        modeloFuncion = new MFuncion();

        try {
            datosFuncion = modeloFuncion.selectTodo();
            crearLstFunciones(datosFuncion);
            System.out.println("List Funciones creada");
        } catch (SQLException ex) {
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            actualizarTabla(modelo.selectTodo());
            System.out.println("Table Usuario actualizada");
        } catch (SQLException ex) {
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        ventana.setTitle("Usuario");
        marco.remove(panelPrincipal);
        vista.setBounds(290, 70, 670, 590);
        marco.add(vista);
        panelPrincipal = vista;
        ventana.repaint();
        ventana.validate();

        iniciarPreguntas();
        vista.getCbxPregunta().setModel(modelP);

        vista.getBtnModificar().setEnabled(false);
        vista.getBtnEliminar().setEnabled(false);

        preguntas = new HashMap<Integer, String>();
        preguntas.put(1, "¿Deporte Favorito?");
        preguntas.put(2, "¿Actividad Favorita?");
        preguntas.put(3, "¿Nacimiento de tu Hija/Hijo?");
        preguntas.put(4, "¿Cumpleaños de tu padre?");
        preguntas.put(5, "¿Nombre de tu primera mascota?");

        addListeners();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == vista.getBtnContrasenia()) {
            System.out.println("Se activo");
            vista.getTxtContrasenia().setEnabled(true);
            vista.getTxtContrasenia2().setEnabled(true);
            vista.getTxtUsuario().setEnabled(false);
            vista.getTxtRespuesta().setEnabled(false);
            vista.getBtnAgregar().setEnabled(false);
            vista.getBtnContrasenia().setEnabled(false);
            vista.getBtnEliminar().setEnabled(false);
            vista.getCbxPregunta().setEnabled(false);
        }
        if (ae.getSource() == vista.getBtnNuevo()) {
            limpiar();
            vista.getTxtContrasenia().setEnabled(true);
            vista.getTxtContrasenia2().setEnabled(true);
            vista.getTxtUsuario().setEnabled(true);
            vista.getTxtRespuesta().setEnabled(true);
            vista.getCbxPregunta().setEnabled(true);
            vista.getBtnAgregar().setEnabled(true);
            vista.getBtnModificar().setEnabled(false);
            vista.getBtnEliminar().setEnabled(false);
            vista.getBtnContrasenia().setEnabled(false);

            try {
                actualizarTabla(modelo.selectTodo());
            } catch (SQLException ex) {
                Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (ae.getSource() == vista.getBtnAgregar()) {
            agregar();
        } else if (ae.getSource() == vista.getBtnModificar()) {
            modificar();
        } else if (ae.getSource() == vista.getBtnEliminar()) {
            eliminar();
        } else if (ae.getSource() == vista.getTxtFuncionario()) {
            buscarFuncionario();
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == vista.getTabla()) {
            llenarFormulario();
        }
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
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Validaciones
        if (e.getSource() == vista.getTxtUsuario()) {
            val.Espacio(e);
            val.evitarPegar(e);
            val.Limite(e, vista.getTxtUsuario().getText(), 15);

        } else if (e.getSource() == vista.getTxtContrasenia()) {

            val.evitarPegar(e);
            val.Limite(e, vista.getTxtContrasenia().getText(), 15);

        } else if (e.getSource() == vista.getTxtContrasenia2()) {

            val.evitarPegar(e);
            val.Limite(e, vista.getTxtContrasenia2().getText(), 15);

        } else if (e.getSource() == vista.getTxtRespuesta()) {

            val.evitarPegar(e);
            val.Limite(e, vista.getTxtRespuesta().getText(), 30);

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    private void crearLstFunciones(MFuncion[] datos) {
        modeloLstFuncion = new DefaultListModel();

        for (MFuncion datosX : datos) {
            modeloLstFuncion.addElement(datosX.getNombre());
        }

        vista.getLstFunciones().setModel(modeloLstFuncion);
    }

    private void actualizarTabla(MUsuario[] datos) {
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Usuario");
        modeloTabla.addColumn("Cedula");
        modeloTabla.addColumn("Funcionario");

        vista.getTabla().setModel(modeloTabla);

        f.ocultarColumnas(vista.getTabla(), new int[]{0});

        if (datos != null) {
            for (MUsuario datosX : datos) {
                modelo = datosX;
        funcionario = new MFuncionario();

                try {
                    funcionario.selectPorUsuario(modelo.getId());
                } catch (SQLException ex) {
                    Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (funcionario.getCedula() != null) {
                    modeloTabla.addRow(new Object[]{modelo.getId(), modelo.getUsuario(), funcionario.getCedula(), funcionario.getPrimerNombre().concat(" ").concat(funcionario.getPrimerApellido())});
                } else {
                    modeloTabla.addRow(new Object[]{modelo.getId(), modelo.getUsuario()});
                }
            }
        }
    }

    private void iniciarPreguntas() {
        modelP.addElement("Seleccione");
        modelP.addElement("¿Deporte Favorito?");
        modelP.addElement("¿Actividad Favorita?");
        modelP.addElement("¿Nacimiento de tu Hija/Hijo?");
        modelP.addElement("¿Cumpleaños de tu padre?");
        modelP.addElement("¿Nombre de tu primera mascota?");
    }

    private void addListeners() {
        vista.getBtnNuevo().addActionListener(this);
        vista.getBtnAgregar().addActionListener(this);
        vista.getBtnModificar().addActionListener(this);
        vista.getBtnEliminar().addActionListener(this);
        vista.getBtnContrasenia().addActionListener(this);
        vista.getTxtFuncionario().addActionListener(this);
        vista.getTabla().addMouseListener(this);
        vista.getTxtUsuario().addKeyListener(this);
        vista.getTxtContrasenia().addKeyListener(this);
        vista.getTxtContrasenia2().addKeyListener(this);
        vista.getTxtRespuesta().addKeyListener(this);
    }

    public void limpiar() {
        vista.getTxtUsuario().setText("");
        vista.getTxtContrasenia().setText("");
        vista.getTxtContrasenia2().setText("");
        vista.getTxtRespuesta().setText("");
    }

    private void agregar() {
        funcionario.setCedula(vista.getTxtFuncionario().getText());
        modelo.setUsuario(vista.getTxtUsuario().getText());
        modelo.setContrasenia(f.encriptar(vista.getTxtContrasenia().getText()));
        modelo.setPreguntaSeguridad(Integer.toString(vista.getCbxPregunta().getSelectedIndex()));
        modelo.setRespuestaSecreta(vista.getTxtRespuesta().getText());
        int[] indice = vista.getLstFunciones().getSelectedIndices();
        MFuncion[] funciones = new MFuncion[indice.length];

        for (int i = 0; i < indice.length; i++) {
            funciones[i] = datosFuncion[indice[i]];
        }

        modelo.setFunciones(funciones);

        try {
            modelo.insert();
            funcionario.setUsuario(modelo);
            funcionario.crearUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            actualizarTabla(modelo.selectTodo());
        } catch (SQLException ex) {
            Logger.getLogger(CCargo.class.getName()).log(Level.SEVERE, null, ex);
        }

        limpiar();
        vista.getBtnModificar().setEnabled(false);
        vista.getBtnEliminar().setEnabled(false);
    }

    private void modificar() {
        if (!vista.getTxtContrasenia().isEnabled()) {
            modelo.setUsuario(vista.getTxtUsuario().getText());
            modelo.setContrasenia(modelo.getContrasenia());
            modelo.setPreguntaSeguridad(Integer.toString(vista.getCbxPregunta().getSelectedIndex()));
            modelo.setRespuestaSecreta(vista.getTxtRespuesta().getText());
            modelo.update();

        } else {

            String pass = vista.getTxtContrasenia().getText();
            String pass2 = vista.getTxtContrasenia().getText();
            System.out.println(pass);

            if (pass.length() == pass2.length()) {

                modelo.setContrasenia(f.encriptar(pass));

            }

            modelo.updatePass();
        }
        try {
            actualizarTabla(modelo.selectTodo());
        } catch (SQLException ex) {
            Logger.getLogger(CCargo.class.getName()).log(Level.SEVERE, null, ex);
        }

        limpiar();
        vista.getTxtUsuario().setEnabled(true);
        vista.getTxtRespuesta().setEnabled(true);
        vista.getTxtContrasenia().setEnabled(true);
        vista.getTxtContrasenia2().setEnabled(true);
        vista.getBtnModificar().setEnabled(false);
        vista.getBtnEliminar().setEnabled(false);
        vista.getBtnContrasenia().setEnabled(false);
    }

    private void eliminar() {
        int filaSeleccionada = vista.getTabla().getSelectedRow();

        if (filaSeleccionada >= 0) {
            int id;
            id = Integer.parseInt(vista.getTabla().getValueAt(vista.getTabla().getSelectedRow(), 0).toString());
            modelo.setId(id);
            modelo.delete();

            try {
                actualizarTabla(modelo.selectTodo());
            } catch (SQLException ex) {
                Logger.getLogger(CCargo.class.getName()).log(Level.SEVERE, null, ex);
            }

            limpiar();
            vista.getBtnAgregar().setEnabled(true);
            vista.getBtnModificar().setEnabled(false);
            vista.getBtnEliminar().setEnabled(false);
        }
    }

    private void llenarFormulario() {
        int filaSeleccionada = vista.getTabla().getSelectedRow();

        if (filaSeleccionada >= 0) {
            int id;
            id = Integer.parseInt(vista.getTabla().getValueAt(filaSeleccionada, 0).toString());

            try {
                modelo.select(id);
            } catch (SQLException ex) {
                Logger.getLogger(CEstado.class.getName()).log(Level.SEVERE, null, ex);
            }

            vista.getTxtUsuario().setText(modelo.getUsuario());
            vista.getTxtRespuesta().setText(modelo.getRespuestaSecreta());
            vista.getCbxPregunta().getModel().setSelectedItem(preguntas.get(Integer.parseInt(modelo.getPreguntaSeguridad())));
            vista.getTxtContrasenia().setEnabled(false);
            vista.getTxtContrasenia2().setEnabled(false);
            vista.getBtnAgregar().setEnabled(false);
            vista.getBtnModificar().setEnabled(true);
            vista.getBtnEliminar().setEnabled(true);
            vista.getBtnContrasenia().setEnabled(true);
        }
    }

    private void buscarFuncionario() {
        String cedula = vista.getTxtFuncionario().getText();

        try {
            funcionario.select(cedula);
        } catch (SQLException ex) {
            Logger.getLogger(CUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        vista.getTxtNombre().setText(funcionario.getPrimerNombre());
        vista.getTxtApellido().setText(funcionario.getPrimerApellido());
    }

}
