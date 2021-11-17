/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramPackage;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author renad
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
        
        // set background 
        ImageIcon background = new ImageIcon("src\\Icons\\b2.jpg");
        background = new ImageIcon(background.getImage().getScaledInstance(Background.getWidth(), Background.getHeight(), Image.SCALE_DEFAULT));
        Background.setIcon(background);
        Background.repaint();
        
        ImageIcon icon;
        // set credit card icon
        icon = new ImageIcon("src\\Icons\\credit-card.png");
        icon = new ImageIcon(icon.getImage().getScaledInstance(CreditCard.getWidth(), CreditCard.getHeight(), Image.SCALE_DEFAULT));
        CreditCard.setIcon(icon);
        CreditCard.repaint();
        
        // set cash icon
        icon = new ImageIcon("src\\Icons\\cash.png");
        icon = new ImageIcon(icon.getImage().getScaledInstance(Cash.getWidth(), Cash.getHeight(), Image.SCALE_DEFAULT));
        Cash.setIcon(icon);
        Cash.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        Credit_card_label = new javax.swing.JLabel();
        CreditCard = new javax.swing.JLabel();
        Cash = new javax.swing.JLabel();
        paymentMassage = new javax.swing.JLabel();
        backToprevious = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(550, 550));
        setResizable(false);

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Credit_card_label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Credit_card_label.setText("Payment");
        Credit_card_label.setToolTipText("");
        panel1.add(Credit_card_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        CreditCard.setText("jLabel1");
        CreditCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToPay_byCreditCard(evt);
            }
        });
        panel1.add(CreditCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 100, 100));

        Cash.setText("jLabel1");
        Cash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToPay_byCash(evt);
            }
        });
        panel1.add(Cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 100, 100));

        paymentMassage.setText("Pleas choose How to Pay");
        panel1.add(paymentMassage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        backToprevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        backToprevious.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToprevious(evt);
            }
        });
        panel1.add(backToprevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        Background.setIconTextGap(0);
        Background.setPreferredSize(new java.awt.Dimension(550, 550));
        panel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goToPay_byCreditCard(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToPay_byCreditCard
        // go to pay by credit card interface to fill in card information
        PayByCreditCard X = new PayByCreditCard();
        X.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goToPay_byCreditCard

    private void goToPay_byCash(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToPay_byCash
        // go to bill interface
        
        //*** not implemented yet ***
    }//GEN-LAST:event_goToPay_byCash

    private void backToprevious(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToprevious
        // back to payment interface
        ConfirmAppointment X = new ConfirmAppointment();
        X.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backToprevious

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Cash;
    private javax.swing.JLabel CreditCard;
    private javax.swing.JLabel Credit_card_label;
    private javax.swing.JLabel backToprevious;
    private java.awt.Panel panel1;
    private javax.swing.JLabel paymentMassage;
    // End of variables declaration//GEN-END:variables
}
