/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author walex
 */
public class Ventana extends javax.swing.JFrame {

    public DefaultTableModel modelo = new DefaultTableModel(); // Instancia del modelo;

    /**
     * Creates new form Principal
     */
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null); // Abre en el centro de la pantalla la ventana
        
        // COLUMNAS
        ArrayList columnas = new ArrayList<>(); // Traigo las columnas
        columnas.add("ID");
        columnas.add("Nombre");
        columnas.add("Categoria");
        columnas.add("Cantidad");
        columnas.add("Precio");
        
        for (Object i:columnas)
        {
            modelo.addColumn(i);
        }
        this.tblDatos.setModel(modelo); // Seteo las columnas en el JTable
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbdPnPrincipal = new javax.swing.JTabbedPane();
        jpRegistrar = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        txtFNombre = new javax.swing.JTextField();
        Cantidad = new javax.swing.JLabel();
        txtFCantidad = new javax.swing.JTextField();
        Precio = new javax.swing.JLabel();
        txtFPrecio = new javax.swing.JTextField();
        Cetegoria = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        cmbxCategoria = new javax.swing.JComboBox<>();
        jpConsultar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        ID = new javax.swing.JLabel();
        Nombre2 = new javax.swing.JLabel();
        txtFNombre2 = new javax.swing.JTextField();
        Cantidad2 = new javax.swing.JLabel();
        txtFCantidad2 = new javax.swing.JTextField();
        Precio2 = new javax.swing.JLabel();
        txtFPrecio2 = new javax.swing.JTextField();
        Categoria2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        cmbxCategoria2 = new javax.swing.JComboBox<>();
        txtFID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbdPnPrincipal.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        tbdPnPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdPnPrincipalMouseClicked(evt);
            }
        });

        Nombre.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Nombre.setText("Nombre:");

        txtFNombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtFNombre.setPreferredSize(new java.awt.Dimension(200, 30));

        Cantidad.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Cantidad.setText("Cantidad:");

        txtFCantidad.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtFCantidad.setPreferredSize(new java.awt.Dimension(100, 30));

        Precio.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Precio.setText("Precio:");

        txtFPrecio.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtFPrecio.setPreferredSize(new java.awt.Dimension(100, 30));

        Cetegoria.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Cetegoria.setText("Categoria:");

        btnGuardar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cmbxCategoria.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cmbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ASEO", "VIVERES" }));

        javax.swing.GroupLayout jpRegistrarLayout = new javax.swing.GroupLayout(jpRegistrar);
        jpRegistrar.setLayout(jpRegistrarLayout);
        jpRegistrarLayout.setHorizontalGroup(
            jpRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(17, 17, 17))
            .addGroup(jpRegistrarLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jpRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cantidad)
                    .addComponent(Nombre)
                    .addComponent(Precio)
                    .addComponent(Cetegoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jpRegistrarLayout.setVerticalGroup(
            jpRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistrarLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jpRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(txtFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cantidad))
                .addGap(9, 9, 9)
                .addGroup(jpRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio))
                .addGap(18, 18, 18)
                .addGroup(jpRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cetegoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(16, 16, 16))
        );

        tbdPnPrincipal.addTab("Registrar", jpRegistrar);

        tblDatos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        ID.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        ID.setText("ID:");

        Nombre2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Nombre2.setText("Nombre:");

        txtFNombre2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtFNombre2.setEnabled(false);
        txtFNombre2.setPreferredSize(new java.awt.Dimension(200, 40));

        Cantidad2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Cantidad2.setText("Cantidad:");

        txtFCantidad2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtFCantidad2.setPreferredSize(new java.awt.Dimension(200, 40));

        Precio2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Precio2.setText("Precio:");

        txtFPrecio2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtFPrecio2.setPreferredSize(new java.awt.Dimension(200, 40));

        Categoria2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Categoria2.setText("Categoria:");

        btnEliminar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnEliminar.setText("Eliminar");

        btnActualizar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        cmbxCategoria2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cmbxCategoria2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ASEO", "VIVERES" }));

        txtFID.setEditable(false);
        txtFID.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtFID.setPreferredSize(new java.awt.Dimension(60, 40));

        javax.swing.GroupLayout jpConsultarLayout = new javax.swing.GroupLayout(jpConsultar);
        jpConsultar.setLayout(jpConsultarLayout);
        jpConsultarLayout.setHorizontalGroup(
            jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jpConsultarLayout.createSequentialGroup()
                        .addGroup(jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Precio2)
                            .addComponent(Categoria2))
                        .addGap(31, 31, 31)
                        .addGroup(jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbxCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(296, 296, 296))
                    .addGroup(jpConsultarLayout.createSequentialGroup()
                        .addGroup(jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpConsultarLayout.createSequentialGroup()
                                .addGroup(jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nombre2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ID, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultarLayout.createSequentialGroup()
                                .addComponent(Cantidad2)
                                .addGap(31, 31, 31)))
                        .addGroup(jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFCantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addGap(21, 21, 21))
        );
        jpConsultarLayout.setVerticalGroup(
            jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID)
                    .addComponent(txtFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre2)
                    .addComponent(btnConsultar))
                .addGroup(jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConsultarLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar))
                    .addGroup(jpConsultarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFCantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cantidad2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Precio2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbxCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Categoria2))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tbdPnPrincipal.addTab("Consultar", jpConsultar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbdPnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbdPnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void tbdPnPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdPnPrincipalMouseClicked

    }//GEN-LAST:event_tbdPnPrincipalMouseClicked

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        llenarCampos(evt);
    }//GEN-LAST:event_tblDatosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

    }//GEN-LAST:event_btnActualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ventana().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cantidad;
    private javax.swing.JLabel Cantidad2;
    private javax.swing.JLabel Categoria2;
    private javax.swing.JLabel Cetegoria;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel Precio2;
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnConsultar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JComboBox<String> cmbxCategoria;
    public javax.swing.JComboBox<String> cmbxCategoria2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpConsultar;
    private javax.swing.JPanel jpRegistrar;
    private javax.swing.JTabbedPane tbdPnPrincipal;
    public javax.swing.JTable tblDatos;
    public javax.swing.JTextField txtFCantidad;
    public javax.swing.JTextField txtFCantidad2;
    public javax.swing.JTextField txtFID;
    public javax.swing.JTextField txtFNombre;
    public javax.swing.JTextField txtFNombre2;
    public javax.swing.JTextField txtFPrecio;
    public javax.swing.JTextField txtFPrecio2;
    // End of variables declaration//GEN-END:variables

//    public void setControlador(Controlador miControl) {
//        this.miControl = miControl; // Paso el objeto de controlador a la clase ventana
//    }
    
    private void llenarCampos(java.awt.event.MouseEvent evt)
    {
        int indiceFila = tblDatos.rowAtPoint(evt.getPoint());
        txtFID.setText(String.valueOf(tblDatos.getValueAt(indiceFila, 0)));
        txtFNombre2.setText(String.valueOf(tblDatos.getValueAt(indiceFila, 1)));
        txtFCantidad2.setText(String.valueOf(tblDatos.getValueAt(indiceFila, 3)));
        txtFPrecio2.setText(String.valueOf(tblDatos.getValueAt(indiceFila, 4)));
        switch(String.valueOf(tblDatos.getValueAt(indiceFila, 2)))
        {
            case "ASEO":
                cmbxCategoria2.setSelectedIndex(1);
                break;
            case "VIVERES":
                cmbxCategoria2.setSelectedIndex(2);
                break;
            default:
                cmbxCategoria2.setSelectedIndex(0);
                break;
        }
    }

    
}