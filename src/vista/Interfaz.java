/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorProducto;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author yeiim
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
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

        panel4 = new java.awt.Panel();
        PanelDatos = new java.awt.Panel();
        CajaTextoCedula = new javax.swing.JTextField();
        CajaTextoTelefono = new javax.swing.JTextField();
        CajaTextoNombre = new javax.swing.JTextField();
        BotonAceptar = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        PanelBaseDeDatos = new java.awt.Panel();
        TablaProductos1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        PanelProducto = new java.awt.Panel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductosAgregados = new javax.swing.JTable();
        PanelBotonesBaseDeDatos = new java.awt.Panel();
        BotonAgregar = new javax.swing.JButton();
        BotonEditar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel4.setBackground(new java.awt.Color(204, 255, 255));

        PanelDatos.setBackground(new java.awt.Color(204, 204, 255));

        CajaTextoCedula.setText("Cedula");

        CajaTextoTelefono.setText("Nombre Completo");
        CajaTextoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaTextoTelefonoActionPerformed(evt);
            }
        });

        CajaTextoNombre.setText("Nombre Completo");
        CajaTextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaTextoNombreActionPerformed(evt);
            }
        });

        BotonAceptar.setBackground(new java.awt.Color(153, 255, 153));
        BotonAceptar.setText("Aceptar");

        BotonLimpiar.setBackground(new java.awt.Color(255, 102, 102));
        BotonLimpiar.setText("Limpiar");

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDatosLayout.createSequentialGroup()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CajaTextoNombre)
                            .addComponent(CajaTextoCedula)
                            .addComponent(CajaTextoTelefono))))
                .addGap(20, 20, 20))
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(CajaTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CajaTextoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CajaTextoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PanelBaseDeDatos.setBackground(new java.awt.Color(204, 255, 204));

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "CC", "Telefono"
            }
        ));
        TablaProductos1.setViewportView(TablaProductos);

        javax.swing.GroupLayout PanelBaseDeDatosLayout = new javax.swing.GroupLayout(PanelBaseDeDatos);
        PanelBaseDeDatos.setLayout(PanelBaseDeDatosLayout);
        PanelBaseDeDatosLayout.setHorizontalGroup(
            PanelBaseDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseDeDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablaProductos1, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelBaseDeDatosLayout.setVerticalGroup(
            PanelBaseDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBaseDeDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablaProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        PanelProducto.setBackground(new java.awt.Color(255, 255, 204));

        TablaProductosAgregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Producto", "Precio"
            }
        ));
        jScrollPane2.setViewportView(TablaProductosAgregados);

        javax.swing.GroupLayout PanelProductoLayout = new javax.swing.GroupLayout(PanelProducto);
        PanelProducto.setLayout(PanelProductoLayout);
        PanelProductoLayout.setHorizontalGroup(
            PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelProductoLayout.setVerticalGroup(
            PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelBotonesBaseDeDatos.setBackground(new java.awt.Color(255, 204, 204));

        BotonAgregar.setText("Agregar");

        BotonEditar.setText("Editar");
        BotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");

        javax.swing.GroupLayout PanelBotonesBaseDeDatosLayout = new javax.swing.GroupLayout(PanelBotonesBaseDeDatos);
        PanelBotonesBaseDeDatos.setLayout(PanelBotonesBaseDeDatosLayout);
        PanelBotonesBaseDeDatosLayout.setHorizontalGroup(
            PanelBotonesBaseDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesBaseDeDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesBaseDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(BotonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelBotonesBaseDeDatosLayout.setVerticalGroup(
            PanelBotonesBaseDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesBaseDeDatosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(PanelBaseDeDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelBotonesBaseDeDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(PanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelBaseDeDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelBotonesBaseDeDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEditarActionPerformed

    private void CajaTextoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaTextoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaTextoTelefonoActionPerformed

    private void CajaTextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaTextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaTextoNombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Interfaz vista = new Interfaz();
        ControladorProducto controlador = new ControladorProducto(vista);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JTextField CajaTextoCedula;
    private javax.swing.JTextField CajaTextoNombre;
    private javax.swing.JTextField CajaTextoTelefono;
    public java.awt.Panel PanelBaseDeDatos;
    public java.awt.Panel PanelBotonesBaseDeDatos;
    public java.awt.Panel PanelDatos;
    public java.awt.Panel PanelProducto;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JScrollPane TablaProductos1;
    private javax.swing.JTable TablaProductosAgregados;
    private javax.swing.JScrollPane jScrollPane2;
    public java.awt.Panel panel4;
    // End of variables declaration//GEN-END:variables

    //Agregar getter
    
    

}
