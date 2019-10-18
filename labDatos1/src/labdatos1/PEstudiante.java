/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labdatos1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jack Howard Ortega
 */
public class PEstudiante extends javax.swing.JFrame {

    private String archivo;

    /**
     * Creates new form PEstudiante
     */
    public PEstudiante() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel5 = new javax.swing.JLabel();
        rcomp = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        ecomp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bc = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Ereserva = new javax.swing.JButton();
        Breserva = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("consultar reserva");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 149, 259, -1));

        rcomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcompActionPerformed(evt);
            }
        });
        getContentPane().add(rcomp, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 55, 62, -1));

        jButton3.setText("consultar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 172, 259, -1));

        ecomp.setText(" ");
        getContentPane().add(ecomp, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 118, 60, -1));

        jLabel6.setText("reservas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 176, 136, -1));

        jLabel7.setText("buscar software");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 204, -1, -1));

        bc.setText("escriba programa");
        getContentPane().add(bc, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 227, 259, -1));

        jButton4.setText("consultar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 256, 259, -1));

        jLabel8.setText("respuesta");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 230, 136, -1));

        jLabel3.setText("cancelar reserva(numComputador)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 88, 259, -1));

        jLabel2.setText(" Reserva de computador (numComputador)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 31, -1, -1));

        Ereserva.setText("cancelar reserva");
        Ereserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EreservaActionPerformed(evt);
            }
        });
        getContentPane().add(Ereserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 117, 133, -1));

        Breserva.setText("reservar computador");
        Breserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreservaActionPerformed(evt);
            }
        });
        getContentPane().add(Breserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 54, 135, -1));

        jButton1.setText("inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labdatos1/1536318074_444085_1536318195_noticia_normal.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rcompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcompActionPerformed

    private void BreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreservaActionPerformed
        
        int tcomp=(int) (Math.random() * 99) + 1;
        int comp[]=new int[tcomp];
        for (int i = 0; i < tcomp; i++) {
            comp[i]=1;
        }
         int rcomps=Integer.parseInt(rcomp.getText());
        if(comp[rcomps]== 1){
            JOptionPane.showMessageDialog(this," ocupo esta computadora con exito");
        }else{
            JOptionPane.showMessageDialog(this,"este computador esta ocupada");
        }
    }//GEN-LAST:event_BreservaActionPerformed

    private void EreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EreservaActionPerformed
       
        
        
         JOptionPane.showMessageDialog(rootPane, "eliminado exitosamente");
        
       
       
       
        

    }//GEN-LAST:event_EreservaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String g = rcomp.getText();
        JOptionPane.showMessageDialog(rootPane, "su computador reservado es"+""+g);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String prog[] = new String[4];
        String b=bc.getText();
        int c=0;
        prog[0]="netbeans";
        prog[1]="visualstudio";
        prog[2]="pseint";
        for (int i = 0; i < 3; i++) {
            if(b.equals(prog[i])){
                 JOptionPane.showMessageDialog(rootPane, "se encontro el programa en los computadores");
           }else{
           c=c+1;
           }
        }
                    if(c==3){
                     JOptionPane.showMessageDialog(rootPane, "no se encontro el programa en los computadores");           
                    }
        
               
        
     
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Pinicial ventana = new Pinicial();
        ventana.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Breserva;
    private javax.swing.JButton Ereserva;
    private javax.swing.JTextField bc;
    private javax.swing.JTextField ecomp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField rcomp;
    // End of variables declaration//GEN-END:variables
}
