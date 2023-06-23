/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VISTAS;
import MODELO.modeloalergias;
import MODELO.modelopaciente;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import CONTROLADOR.ControladorAlergias;
import CONTROLADOR.ControladorPacientes;
import DAO.DAOpaciente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VentanaPaciente extends javax.swing.JFrame {
    
    private ControladorPacientes informacionPacientes;
    private ControladorAlergias informacionAlergias;

    /**
     * Creates new form VentanaPaciente
     */
    public VentanaPaciente() {
        initComponents();
        
        informacionPacientes = new ControladorPacientes();
        informacionAlergias = new ControladorAlergias();
        
        DAOpaciente mapa = new DAO.DAOpaciente();
        
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
        idp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellidop = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombrep = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefonop = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        direccionp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        boxAlergiasp = new javax.swing.JComboBox<>();
        btnAlergias = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btnagregarusuario = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAlergiasp = new javax.swing.JTextArea();
        btnbuscar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setText("IDENTIFICACION");

        idp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpActionPerformed(evt);
            }
        });

        jLabel2.setText("APELLIDO");

        apellidop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidopActionPerformed(evt);
            }
        });

        jLabel3.setText("NOMBRE");

        jLabel4.setText("TELEFONO");

        jLabel6.setText("DIRECCION");

        jLabel7.setText("ALERGIAS");

        boxAlergiasp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LACTEOS", "LEGRUMBRES", "POLEN", "ACETAMINOFEN", "AZUCAR" }));

        btnAlergias.setText("AGREGAR ALERGIAS");
        btnAlergias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlergiasActionPerformed(evt);
            }
        });

        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btnagregarusuario.setText("GRABAR");
        btnagregarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarusuarioActionPerformed(evt);
            }
        });

        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        listAlergiasp.setColumns(20);
        listAlergiasp.setRows(5);
        jScrollPane2.setViewportView(listAlergiasp);

        btnbuscar.setText("BUSCAR");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(apellidop, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(telefonop)))
                                        .addGap(140, 140, 140)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel6)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(idp, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnbuscar)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nombrep, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                        .addComponent(direccionp))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boxAlergiasp, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btnAlergias)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(limpiar)
                            .addComponent(btnactualizar)
                            .addComponent(btnagregarusuario)
                            .addComponent(btnsalir))))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apellidop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nombrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(telefonop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(direccionp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxAlergiasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlergias)
                    .addComponent(limpiar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnactualizar)
                        .addGap(33, 33, 33)
                        .addComponent(btnagregarusuario)
                        .addGap(42, 42, 42)
                        .addComponent(btnsalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apellidopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidopActionPerformed

    private void btnAlergiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlergiasActionPerformed
       
        String cc = idp.getText();
        
        
        if("".equals(idp.getText())){
            JOptionPane.showMessageDialog(this, "Poner la identificacion");
        }else{
            String alergiaSelected = (String) boxAlergiasp.getSelectedItem();
            String textoAnterior = listAlergiasp.getText();
            String nuevoTexto = textoAnterior + "\n" + alergiaSelected;
            modelopaciente paciente = informacionPacientes.buscarPaciente(cc);
            listAlergiasp.setText(nuevoTexto);
            paciente.setAlergias(nuevoTexto);
        }
        
       
       
       
       
        
    }//GEN-LAST:event_btnAlergiasActionPerformed

    private void idpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        String cc = idp.getText();

        modelopaciente paciente = informacionPacientes.buscarPaciente(cc);

        if (paciente == null) {
            JOptionPane.showMessageDialog(this, "Usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            
        } else {
            nombrep.setText(paciente.getNombrep());
            apellidop.setText(paciente.getApellidop());
            telefonop.setText(String.valueOf(paciente.getTelefonop()));
            direccionp.setText(paciente.getDireccionp());
            listAlergiasp.setText(paciente.getAlergias().toString());
            
            
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnagregarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarusuarioActionPerformed
        
        
        String nombre = nombrep.getText();
        String apellido = apellidop.getText();
        String cc = idp.getText();
        String direccion = direccionp.getText();
        String telefono = telefonop.getText();

        modelopaciente paciente = new modelopaciente(cc, nombre, direccion, telefono, apellido, new ArrayList<>());
        
        informacionPacientes.agregarPaciente(paciente);

        // Mostrar un mensaje indicando que el paciente se ha agregado correctamente
        JOptionPane.showMessageDialog(this, "agregado Exitosamente");
    }//GEN-LAST:event_btnagregarusuarioActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        String nombre = nombrep.getText();
        String apellido = apellidop.getText();
        String cc = idp.getText();
        String direccion = direccionp.getText();
        String telefono = telefonop.getText();

        modelopaciente paciente = informacionPacientes.buscarPaciente(cc);

        if (paciente != null) {
            paciente.setApellidop(apellido);
            paciente.setNombrep(nombre);
            paciente.setDireccionp(direccion);
            paciente.setTelefonop(telefono);

            JOptionPane.showMessageDialog(this, "actualizada correctamente");
        } else {
            
            JOptionPane.showMessageDialog(this, "no está registrado");
        }   
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        nombrep.setText("");
        apellidop.setText("");
        idp.setText("");
        direccionp.setText("");
        telefonop.setText("");
        listAlergiasp.setText("");
        
        JOptionPane.showMessageDialog(this, "Limpieza correctamente");
    }//GEN-LAST:event_limpiarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField apellidop;
    public javax.swing.JComboBox<String> boxAlergiasp;
    public javax.swing.JButton btnAlergias;
    public javax.swing.JButton btnactualizar;
    public javax.swing.JButton btnagregarusuario;
    public javax.swing.JButton btnbuscar;
    public javax.swing.JButton btnsalir;
    public javax.swing.JTextField direccionp;
    public javax.swing.JTextField idp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiar;
    public javax.swing.JTextArea listAlergiasp;
    public javax.swing.JTextField nombrep;
    public javax.swing.JTextField telefonop;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getboxAlergias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public JTextField getnombrep() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public JTextField getidp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public JTextField getdireccion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public JTextField gettelefono() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public JTextField getapellidop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public JTextArea getlistAlergias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}