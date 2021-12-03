/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramPackage;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author منار
 */
public class Browse_Services extends javax.swing.JFrame {

    /**
     * Creates new form Browse_Services
     */
    public Browse_Services() {
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

        background_interface = new javax.swing.JPanel();
        Hello_label = new javax.swing.JLabel();
        chooses_label = new javax.swing.JLabel();
        ViewServices_label = new javax.swing.JLabel();
        icon_ = new javax.swing.JLabel();
        View_Services = new javax.swing.JLabel();
        product_label = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        MakeAppointment_label = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        Products = new javax.swing.JLabel();
        Make_Appointment = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background_interface.setBackground(new java.awt.Color(249, 249, 249));
        background_interface.setLayout(null);

        Hello_label.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Hello_label.setForeground(new java.awt.Color(51, 0, 102));
        Hello_label.setText("Hello, ");
        background_interface.add(Hello_label);
        Hello_label.setBounds(10, 60, 136, 75);

        chooses_label.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        chooses_label.setForeground(new java.awt.Color(51, 0, 102));
        chooses_label.setText("choose what you want");
        background_interface.add(chooses_label);
        chooses_label.setBounds(10, 130, 316, 34);

        ViewServices_label.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        ViewServices_label.setForeground(new java.awt.Color(255, 255, 255));
        ViewServices_label.setText("View Services");
        ViewServices_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_ServicesMouseClicked(evt);
            }
        });
        background_interface.add(ViewServices_label);
        ViewServices_label.setBounds(20, 360, 124, 22);

        icon_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Service_Icon.png"))); // NOI18N
        icon_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_ServicesMouseClicked(evt);
            }
        });
        background_interface.add(icon_);
        icon_.setBounds(30, 250, 96, 110);

        View_Services.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/square_purple.png"))); // NOI18N
        View_Services.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_ServicesMouseClicked(evt);
            }
        });
        background_interface.add(View_Services);
        View_Services.setBounds(10, 230, 149, 194);

        product_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        product_label.setForeground(new java.awt.Color(255, 255, 255));
        product_label.setText("Product");
        product_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsMouseClicked(evt);
            }
        });
        background_interface.add(product_label);
        product_label.setBounds(220, 360, 90, 22);

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/App_Icon.png"))); // NOI18N
        icon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Make_AppointmentMouseClicked(evt);
            }
        });
        background_interface.add(icon3);
        icon3.setBounds(130, 470, 96, 110);

        MakeAppointment_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MakeAppointment_label.setForeground(new java.awt.Color(255, 255, 255));
        MakeAppointment_label.setText("Make Appointment ");
        MakeAppointment_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Make_AppointmentMouseClicked(evt);
            }
        });
        background_interface.add(MakeAppointment_label);
        MakeAppointment_label.setBounds(80, 580, 190, 22);

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Product_Icon.png"))); // NOI18N
        icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsMouseClicked(evt);
            }
        });
        background_interface.add(icon);
        icon.setBounds(210, 240, 92, 93);

        Products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Square_Pink.png"))); // NOI18N
        Products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsMouseClicked(evt);
            }
        });
        background_interface.add(Products);
        Products.setBounds(180, 230, 150, 190);

        Make_Appointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/App_Box.png"))); // NOI18N
        Make_Appointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Make_AppointmentMouseClicked(evt);
            }
        });
        background_interface.add(Make_Appointment);
        Make_Appointment.setBounds(10, 460, 330, 170);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_interface, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_interface, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void View_ServicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_ServicesMouseClicked
        PetCareServices X = new PetCareServices();
        X.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_View_ServicesMouseClicked

    private void ProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsMouseClicked
        // TODO add your handling code here:
        BuyProducts X = new BuyProducts();
        X.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductsMouseClicked

    private void Make_AppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Make_AppointmentMouseClicked
        // TODO add your handling code here:
        MakeAppointment X = null;
        X = new MakeAppointment();
        X.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Make_AppointmentMouseClicked

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
            java.util.logging.Logger.getLogger(Browse_Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Browse_Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Browse_Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Browse_Services.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Browse_Services().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hello_label;
    private javax.swing.JLabel MakeAppointment_label;
    private javax.swing.JLabel Make_Appointment;
    private javax.swing.JLabel Products;
    private javax.swing.JLabel ViewServices_label;
    private javax.swing.JLabel View_Services;
    private javax.swing.JPanel background_interface;
    private javax.swing.JLabel chooses_label;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon_;
    private javax.swing.JLabel product_label;
    // End of variables declaration//GEN-END:variables
}
