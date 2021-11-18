/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramPackage;

import java.awt.Color;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author Bushra
 */
public class PayByCreditCard extends javax.swing.JFrame {

    /**
     * Creates new form PayByCreditCard
     */
    public PayByCreditCard() {
        initComponents();

        // set background 
        ImageIcon background = new ImageIcon("src\\Icons\\b2.jpg");
        background = new ImageIcon(background.getImage().getScaledInstance(Background.getWidth(), Background.getHeight(), Image.SCALE_DEFAULT));
        Background.setIcon(background);
        Background.repaint();
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
        Error_Message_Date = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Error_Message_Name = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CreditCard = new javax.swing.JTextField();
        Error_massage = new javax.swing.JLabel();
        CVV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Error_Message_cvv = new javax.swing.JLabel();
        Card_Holder = new javax.swing.JLabel();
        expiration_date = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        Credit_card_label = new javax.swing.JLabel();
        backToprevious = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(550, 550));
        setResizable(false);

        panel1.setPreferredSize(new java.awt.Dimension(550, 550));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Error_Message_Date.setText("date error");
        panel1.add(Error_Message_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 276, -1, -1));

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        panel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 194, 257, -1));

        Error_Message_Name.setText("name error");
        panel1.add(Error_Message_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 224, -1, -1));

        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        panel1.add(nextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        jLabel3.setText("example: mm/yy");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 276, -1, -1));

        jLabel1.setText("Card Number ");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        CreditCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditCardActionPerformed(evt);
            }
        });
        panel1.add(CreditCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 261, -1));

        Error_massage.setText("error");
        panel1.add(Error_massage, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        CVV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CVVKeyPressed(evt);
            }
        });
        panel1.add(CVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 321, 136, -1));

        jLabel2.setText("CVV Number ");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 325, -1, -1));

        Error_Message_cvv.setText("cvv error");
        panel1.add(Error_Message_cvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 351, -1, -1));

        Card_Holder.setText("Card Holder Name ");
        panel1.add(Card_Holder, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 198, -1, -1));

        expiration_date.setText("Expriation Date  ");
        panel1.add(expiration_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 250, -1, -1));

        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });
        panel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 257, -1));

        Credit_card_label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Credit_card_label.setText("Credit Card Information ");
        Credit_card_label.setToolTipText("");
        panel1.add(Credit_card_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 37, -1, -1));

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

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed

        String Name_Holder = Name.getText();
        Error_Message_Name.setText(" ");

        if (Name_Holder.matches("[a-zA-Z- ]+") && !"".equals(Name_Holder.trim())) {

        } else if (Name_Holder.equals(null) || "".equals(Name_Holder.trim())) {

            Error_Message_Name.setText("Please Enter Your Name");
            Error_Message_Name.setForeground(Color.red);

        } else {
            Error_Message_Name.setText("Please Enter Your Name In The Correct Way");
            Error_Message_Name.setForeground(Color.red);

        }


    }//GEN-LAST:event_NameActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextBtnActionPerformed

    private void CreditCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditCardActionPerformed

        String Credit = CreditCard.getText();
        Error_massage.setText(" ");

        if (Credit.trim().equals("")) {

            Error_massage.setText("Enter a 16-digit card number");
            Error_massage.setForeground(Color.red);

        } else if (Credit.matches("[0-9]+") && Credit.length() == 16) {
            Error_massage.setText(" ");

        } else {

            Error_massage.setText("Enter a 16-digit card number");

            Error_massage.setForeground(Color.red);

        }


    }//GEN-LAST:event_CreditCardActionPerformed
  
    private boolean checkCVV(String cvv) {
        if (cvv.matches("[0-9]+") && cvv.length() == 3) {
            return true;
        } else {
            return false;
        }

    }
    
    private void CVVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CVVKeyPressed
        String Cvv = CVV.getText();
        Error_Message_cvv.setText(" ");

        if (checkCVV(Cvv) == true) {
            Error_Message_cvv.setText(" ");
        } else {
            Error_Message_cvv.setText("Security code is invalid");
            Error_Message_cvv.setForeground(Color.red);
        }


    }//GEN-LAST:event_CVVKeyPressed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        String userInput = Date.getText();

        if (userInput.trim().equals("")) {

            Error_Message_Date.setText("You must enter the expiry date");
            Error_Message_Date.setForeground(Color.red);
        } else {

            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yy");
            dateFormat.setLenient(false);
            try {
                Date date = dateFormat.parse(userInput);
                Error_Message_Date.setText("");

            } catch (ParseException e) {
                Error_Message_Date.setText(userInput + " is Invalid Date format");
                Error_Message_Date.setForeground(Color.red);
            }
        }

    }//GEN-LAST:event_DateActionPerformed

    private void backToprevious(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToprevious
        // back to payment interface
        Payment X = new Payment();
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
            java.util.logging.Logger.getLogger(PayByCreditCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayByCreditCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayByCreditCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayByCreditCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayByCreditCard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField CVV;
    private javax.swing.JLabel Card_Holder;
    private javax.swing.JTextField CreditCard;
    private javax.swing.JLabel Credit_card_label;
    private javax.swing.JTextField Date;
    private javax.swing.JLabel Error_Message_Date;
    private javax.swing.JLabel Error_Message_Name;
    private javax.swing.JLabel Error_Message_cvv;
    private javax.swing.JLabel Error_massage;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel backToprevious;
    private javax.swing.JLabel expiration_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton nextBtn;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
