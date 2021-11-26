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

        White_Br_Panel = new java.awt.Panel();
        Error_Message_Date = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Error_Message_Name = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        Example_Label = new javax.swing.JLabel();
        CardNum_Label = new javax.swing.JLabel();
        CreditCard = new javax.swing.JTextField();
        Error_massage = new javax.swing.JLabel();
        CVV = new javax.swing.JTextField();
        CVV_Label = new javax.swing.JLabel();
        Error_Message_cvv = new javax.swing.JLabel();
        Card_Holder_Label = new javax.swing.JLabel();
        expiration_date = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        Credit_card_label = new javax.swing.JLabel();
        backToprevious = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        White_Br_Panel.setPreferredSize(new java.awt.Dimension(550, 550));
        White_Br_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Error_Message_Date.setText("date error");
        White_Br_Panel.add(Error_Message_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));
        White_Br_Panel.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 194, 257, -1));

        Error_Message_Name.setText("name error");
        White_Br_Panel.add(Error_Message_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 224, -1, -1));

        nextBtn.setText("Next");
        nextBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goTo_Next(evt);
            }
        });
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        White_Br_Panel.add(nextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        Example_Label.setText("example: mm/yy");
        White_Br_Panel.add(Example_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        CardNum_Label.setText("Card Number ");
        White_Br_Panel.add(CardNum_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        CreditCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditCardActionPerformed(evt);
            }
        });
        White_Br_Panel.add(CreditCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 261, -1));

        Error_massage.setText("error");
        White_Br_Panel.add(Error_massage, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        CVV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CVVKeyPressed(evt);
            }
        });
        White_Br_Panel.add(CVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 321, 136, -1));

        CVV_Label.setText("CVV Number ");
        White_Br_Panel.add(CVV_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 325, -1, -1));

        Error_Message_cvv.setText("cvv error");
        White_Br_Panel.add(Error_Message_cvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 351, -1, -1));

        Card_Holder_Label.setText("Card Holder Name ");
        White_Br_Panel.add(Card_Holder_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 198, -1, -1));

        expiration_date.setText("Expriation Date  ");
        White_Br_Panel.add(expiration_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 250, -1, -1));
        White_Br_Panel.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 257, -1));

        Credit_card_label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Credit_card_label.setText("Credit Card Information ");
        Credit_card_label.setToolTipText("");
        White_Br_Panel.add(Credit_card_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 37, -1, -1));

        backToprevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        backToprevious.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToprevious(evt);
            }
        });
        White_Br_Panel.add(backToprevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        Background.setIconTextGap(0);
        Background.setPreferredSize(new java.awt.Dimension(550, 550));
        White_Br_Panel.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(White_Br_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(White_Br_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed

    }//GEN-LAST:event_nextBtnActionPerformed

    private void CreditCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditCardActionPerformed

    }//GEN-LAST:event_CreditCardActionPerformed

    private boolean checkCVV() {
        boolean valid = true;
        String Cvv = CVV.getText();
        Error_Message_cvv.setText(" ");
        
        if (Cvv.matches("[0-9]+") && Cvv.length() == 3) {
            valid = true;
            Error_Message_cvv.setText(" ");
        } else {
            valid = false;
            Error_Message_cvv.setText("Security code is invalid");
            Error_Message_cvv.setForeground(Color.red);
        }

        return valid;
    }

    private boolean checkName() {
        boolean valid = true;

        String Name_Holder = Name.getText();
        Error_Message_Name.setText(" ");

        if (Name_Holder.matches("[a-zA-Z- ]+") && !"".equals(Name_Holder.trim())) {

        } else if (Name_Holder.equals(null) || "".equals(Name_Holder.trim())) {

            valid = false;
            Error_Message_Name.setText("Please Enter Your Name");
            Error_Message_Name.setForeground(Color.red);

        } else {
            valid = false;
            Error_Message_Name.setText("Please Enter Your Name In The Correct Way");
            Error_Message_Name.setForeground(Color.red);
        }
        return valid;
    }
    
    private boolean CardDate() {
        boolean valid = true;
        
        String userInput = Date.getText();
        Error_Message_Date.setText(" ");

        if (userInput.trim().equals("")) {

            valid = false;
            Error_Message_Date.setText("Enter expiry date");
            Error_Message_Date.setForeground(Color.red);

        } else {

            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yy");
            dateFormat.setLenient(false);
            try {
                Date date = dateFormat.parse(userInput);
                Error_Message_Date.setText("");

            } catch (ParseException e) {
                valid = false;
                Error_Message_Date.setText(userInput + " is Invalid Date format");
                Error_Message_Date.setForeground(Color.red);
            }
        }

        return valid;
    }
    
    private boolean checkCreditNumber() {
        boolean valid = true;
        
        String Credit = CreditCard.getText();
        Error_massage.setText(" ");

        if (Credit.trim().equals("")) {

            valid = false;
            Error_massage.setText("Enter your card number");
            Error_massage.setForeground(Color.red);

        } else if (Credit.matches("[0-9]+") && Credit.length() == 16) {
            Error_massage.setText(" ");

        } else {

            valid = false;
            Error_massage.setText("Enter a 16-digit card number");
            Error_massage.setForeground(Color.red);

        }
        return valid;
    }
    
    private void CVVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CVVKeyPressed

    }//GEN-LAST:event_CVVKeyPressed

    private void backToprevious(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToprevious
        // back to payment interface
        Payment X = new Payment();
        X.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backToprevious

    private void goTo_Next(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goTo_Next
        
        boolean validCardNum = checkCreditNumber();
        boolean validName = checkName();
        boolean validCvv = checkCVV();
        boolean validDate = CardDate();
        boolean validInfo = validCardNum && validName && validCvv && validDate;

        if (validInfo == true) {
            // go to bill
        }
        
    }//GEN-LAST:event_goTo_Next

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
    private javax.swing.JLabel CVV_Label;
    private javax.swing.JLabel CardNum_Label;
    private javax.swing.JLabel Card_Holder_Label;
    private javax.swing.JTextField CreditCard;
    private javax.swing.JLabel Credit_card_label;
    private javax.swing.JTextField Date;
    private javax.swing.JLabel Error_Message_Date;
    private javax.swing.JLabel Error_Message_Name;
    private javax.swing.JLabel Error_Message_cvv;
    private javax.swing.JLabel Error_massage;
    private javax.swing.JLabel Example_Label;
    private javax.swing.JTextField Name;
    private java.awt.Panel White_Br_Panel;
    private javax.swing.JLabel backToprevious;
    private javax.swing.JLabel expiration_date;
    private javax.swing.JButton nextBtn;
    // End of variables declaration//GEN-END:variables
}
