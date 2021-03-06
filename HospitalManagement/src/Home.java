
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Home extends javax.swing.JFrame {

    public int arrow = 0;
    
    public Home() {
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

        Arrow = new javax.swing.JToggleButton();
        NewPatient = new javax.swing.JToggleButton();
        DiagnosisInformation = new javax.swing.JToggleButton();
        DeletePatient = new javax.swing.JToggleButton();
        HistoryPatient = new javax.swing.JToggleButton();
        UpdatePatient = new javax.swing.JToggleButton();
        Logout = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/two arrow.png"))); // NOI18N
        Arrow.setPreferredSize(new java.awt.Dimension(240, 59));
        Arrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArrowActionPerformed(evt);
            }
        });
        getContentPane().add(Arrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 27, 59, -1));

        NewPatient.setIcon(new javax.swing.ImageIcon("D:\\Pictures\\Projek\\HMS ICON\\add new patient.png")); // NOI18N
        NewPatient.setText("Add New Patient Record");
        NewPatient.setPreferredSize(new java.awt.Dimension(240, 59));
        NewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPatientActionPerformed(evt);
            }
        });
        getContentPane().add(NewPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 120, -1, -1));

        DiagnosisInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add diag.png"))); // NOI18N
        DiagnosisInformation.setText("Add Diagnosis Information");
        DiagnosisInformation.setPreferredSize(new java.awt.Dimension(240, 59));
        DiagnosisInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagnosisInformationActionPerformed(evt);
            }
        });
        getContentPane().add(DiagnosisInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 197, -1, -1));

        DeletePatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deleteHome.png"))); // NOI18N
        DeletePatient.setText("Delete Patient Record");
        DeletePatient.setPreferredSize(new java.awt.Dimension(240, 59));
        DeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePatientActionPerformed(evt);
            }
        });
        getContentPane().add(DeletePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 351, -1, -1));

        HistoryPatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_history1.png"))); // NOI18N
        HistoryPatient.setText("History of the Patient ");
        HistoryPatient.setPreferredSize(new java.awt.Dimension(240, 59));
        HistoryPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryPatientActionPerformed(evt);
            }
        });
        getContentPane().add(HistoryPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 274, -1, -1));

        UpdatePatient.setIcon(new javax.swing.ImageIcon("D:\\Pictures\\Projek\\HMS ICON\\rsz_update_details.png")); // NOI18N
        UpdatePatient.setText("Update Patient Record");
        UpdatePatient.setPreferredSize(new java.awt.Dimension(240, 59));
        UpdatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePatientActionPerformed(evt);
            }
        });
        getContentPane().add(UpdatePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 428, -1, -1));

        Logout.setIcon(new javax.swing.ImageIcon("D:\\Pictures\\Projek\\HMS ICON\\exit.png")); // NOI18N
        Logout.setText("Logout");
        Logout.setPreferredSize(new java.awt.Dimension(240, 59));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 505, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rs_background (2).jpg"))); // NOI18N
        jLabel2.setText("j");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePatientActionPerformed
     
        new DeletePatient().setVisible(true);
    }//GEN-LAST:event_DeletePatientActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Are you sure want to quit ?", "Select",JOptionPane.YES_NO_OPTION);
        if (x == 0){
            Login masuk = new Login();
            masuk.setVisible(true);
        }
        
    }//GEN-LAST:event_LogoutActionPerformed

    private void ArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArrowActionPerformed
        if(arrow==0){
            NewPatient.setLocation(90,30);
            DiagnosisInformation.setLocation(333,30);
            HistoryPatient.setLocation(576,30);
            DeletePatient.setLocation(819,30);
            UpdatePatient.setLocation(1062,30);
            Logout.setLocation(1062,89);
            arrow=1;
        }
        else{
            NewPatient.setLocation(10,107);
            DiagnosisInformation.setLocation(10,184);
            HistoryPatient.setLocation(10,261);
            DeletePatient.setLocation(10,338);
            UpdatePatient.setLocation(10,415);
            Logout.setLocation(10,490);
            arrow=0;
        }
    }//GEN-LAST:event_ArrowActionPerformed

    private void NewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPatientActionPerformed
   
        AddNewPatient tambahPasien = new AddNewPatient();
        tambahPasien.setVisible(true);
        
    }//GEN-LAST:event_NewPatientActionPerformed

    private void DiagnosisInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagnosisInformationActionPerformed
        AddDiagnosisForm diagnosa = new AddDiagnosisForm();
        diagnosa.setVisible(true);
        
    }//GEN-LAST:event_DiagnosisInformationActionPerformed

    private void UpdatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePatientActionPerformed
        // TODO add your handling code here:
        new UpdatePatientRecord().setVisible(true);
    }//GEN-LAST:event_UpdatePatientActionPerformed

    private void HistoryPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryPatientActionPerformed
        new fullHistoryOfThePatient().setVisible(true);
    }//GEN-LAST:event_HistoryPatientActionPerformed

    /**
     * @param args the command line aNewPatients
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Arrow;
    private javax.swing.JToggleButton DeletePatient;
    private javax.swing.JToggleButton DiagnosisInformation;
    private javax.swing.JToggleButton HistoryPatient;
    private javax.swing.JToggleButton Logout;
    private javax.swing.JToggleButton NewPatient;
    private javax.swing.JToggleButton UpdatePatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
