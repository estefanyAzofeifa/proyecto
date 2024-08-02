/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PruebaProyecto;

/**
 *
 * @author estef
 */
public class RegistroDeHabitats extends javax.swing.JFrame {

    /**
     * Creates new form RegistroDeHabitats
     */
    public RegistroDeHabitats() {
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
        AgregarHabi = new javax.swing.JButton();
        EliminarInfo = new javax.swing.JButton();
        ConsultarHabi = new javax.swing.JButton();
        ModificaHabi = new javax.swing.JButton();
        AtrasAAL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Habitat");

        AgregarHabi.setBackground(new java.awt.Color(0, 0, 0));
        AgregarHabi.setForeground(new java.awt.Color(255, 255, 255));
        AgregarHabi.setText("Agregar Habitat");
        AgregarHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarHabiActionPerformed(evt);
            }
        });

        EliminarInfo.setBackground(new java.awt.Color(0, 0, 0));
        EliminarInfo.setForeground(new java.awt.Color(255, 255, 255));
        EliminarInfo.setText("Eliminar Habitat");
        EliminarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarInfoActionPerformed(evt);
            }
        });

        ConsultarHabi.setBackground(new java.awt.Color(0, 0, 0));
        ConsultarHabi.setForeground(new java.awt.Color(255, 255, 255));
        ConsultarHabi.setText("Consultar Habitat");
        ConsultarHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarHabiActionPerformed(evt);
            }
        });

        ModificaHabi.setBackground(new java.awt.Color(0, 0, 0));
        ModificaHabi.setForeground(new java.awt.Color(255, 255, 255));
        ModificaHabi.setText("Modificar Habitat");
        ModificaHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaHabiActionPerformed(evt);
            }
        });

        AtrasAAL.setBackground(new java.awt.Color(0, 0, 0));
        AtrasAAL.setForeground(new java.awt.Color(255, 255, 255));
        AtrasAAL.setText("Atras");
        AtrasAAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasAALActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(648, 648, 648)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgregarHabi, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(EliminarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConsultarHabi, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModificaHabi, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(691, 691, 691)
                        .addComponent(AtrasAAL)))
                .addContainerGap(710, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addComponent(AgregarHabi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(EliminarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(ConsultarHabi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(ModificaHabi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(AtrasAAL)
                .addContainerGap(298, Short.MAX_VALUE))
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

    private void AgregarHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarHabiActionPerformed
        AgregarHabi aHbi = new AgregarHabi();
        aHbi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregarHabiActionPerformed

    private void EliminarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarInfoActionPerformed
        EliminarHabi Ehabi= new EliminarHabi();
        Ehabi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EliminarInfoActionPerformed

    private void ConsultarHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarHabiActionPerformed
        ConsultarHabi Chabi = new ConsultarHabi();
        Chabi.setVisible(true);
        this.dispose();
        
      
    }//GEN-LAST:event_ConsultarHabiActionPerformed

    private void ModificaHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificaHabiActionPerformed
       ModificarHabi Mhabi = new ModificarHabi();
       Mhabi.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_ModificaHabiActionPerformed

    private void AtrasAALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasAALActionPerformed
        Menu atrasMenu = new Menu();
        atrasMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasAALActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroDeHabitats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeHabitats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeHabitats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeHabitats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeHabitats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarHabi;
    private javax.swing.JButton AtrasAAL;
    private javax.swing.JButton ConsultarHabi;
    private javax.swing.JButton EliminarInfo;
    private javax.swing.JButton ModificaHabi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}