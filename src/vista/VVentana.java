package vista;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Diego
 */
public class VVentana extends javax.swing.JPanel {

    /**
     * Creates new form VInicio
     */
    public VVentana() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelCerrar = new javax.swing.JLabel();
        nonUsuario = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 72, 181));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Consie");
        jLabel1.setName("jLabel1"); // NOI18N

        labelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/icons8_cancel_30px.png"))); // NOI18N
        labelCerrar.setName("labelCerrar"); // NOI18N

        nonUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nonUsuario.setText("<Usuario>");
        nonUsuario.setName("nonUsuario"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nonUsuario)
                .addGap(18, 18, 18)
                .addComponent(labelCerrar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCerrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nonUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 30);

        panelMenu.setBackground(new java.awt.Color(0, 36, 92));
        panelMenu.setName("panelMenu"); // NOI18N
        panelMenu.setLayout(null);
        add(panelMenu);
        panelMenu.setBounds(0, 30, 250, 670);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCerrar;
    private javax.swing.JLabel nonUsuario;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables

    public JLabel getNonUsuario() {
        return nonUsuario;
    }

    public JLabel getLabelCerrar() {
        return labelCerrar;
    }

    public JPanel getPanelMenu() {
        return panelMenu;
    }

}
