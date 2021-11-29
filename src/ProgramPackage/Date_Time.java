/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramPackage;

import static ProgramPackage.BuyProducts.o;
import static ProgramPackage.MakeAppointment.a;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alano
 */
public class Date_Time extends javax.swing.JFrame {

    /**
     * Creates new form Date_Time
     */
    public Date_Time() {
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

        jLabel3 = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        Cart_label = new javax.swing.JLabel();
        Home_label = new javax.swing.JLabel();
        Help_Label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        time_Label = new javax.swing.JLabel();
        date_Label = new javax.swing.JLabel();
        Time_Label = new javax.swing.JComboBox<>();
        ConfirmButton = new javax.swing.JButton();
        timeError = new javax.swing.JLabel();
        dateError = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();
        Back_label = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cart_dark.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));

        Cart_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cart_dark.png"))); // NOI18N

        Home_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home.png"))); // NOI18N

        Help_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/help.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));

        time_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        time_Label.setForeground(new java.awt.Color(91, 74, 132));
        time_Label.setText("Select Time");

        date_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date_Label.setForeground(new java.awt.Color(91, 74, 132));
        date_Label.setText("Select Day");

        Time_Label.setBackground(new java.awt.Color(192, 179, 242));
        Time_Label.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    :     AM/PM", "08:00 AM", "09:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "01:00 PM", "02:00 PM", "03:00 PM", "04:00 PM" }));

        ConfirmButton.setBackground(new java.awt.Color(121, 99, 175));
        ConfirmButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmButton.setText("Confirm");
        ConfirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirm(evt);
            }
        });

        timeError.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        timeError.setText("  ");

        dateError.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        dateError.setText("  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(date_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(213, 213, 213))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Time_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(timeError, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dateError, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(time_Label)
                    .addContainerGap(233, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(date_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dateError)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(Time_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(timeError)
                .addGap(57, 57, 57)
                .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(263, 263, 263)
                    .addComponent(time_Label)
                    .addContainerGap(195, Short.MAX_VALUE)))
        );

        Back_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back_arrow.png"))); // NOI18N
        Back_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backTo_pre(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(Cart_label)
                        .addGap(40, 40, 40)
                        .addComponent(Home_label)
                        .addGap(43, 43, 43)
                        .addComponent(Help_Label))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back_label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Back_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cart_label)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(Home_label))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Help_Label)))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirm(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirm
        if (checkInfo()) {
            if (a != null) {
                a.setDate(DateChooser.getDate());
                a.setTime(Time_Label.getItemAt(Time_Label.getSelectedIndex()));

                ConfirmAppointment x = new ConfirmAppointment();
                x.setVisible(true);
                this.dispose();
            }

            if (o != null) {
                o.setDate(DateChooser.getDate());
                o.setTime(Time_Label.getItemAt(Time_Label.getSelectedIndex()));

                Payment x = new Payment();
                x.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_confirm

    private void backTo_pre(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTo_pre
        if (a != null) {
            try {

                MakeAppointment x = new MakeAppointment();
                x.setVisible(true);
                this.dispose();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Date_Time.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (o != null) {

            BuyProducts x = new BuyProducts();
            x.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_backTo_pre

    private boolean checkInfo() {

        boolean valid = true;
        dateError.setText(" ");
        timeError.setText(" ");

        if (DateChooser.getDate() == null) {
            dateError.setForeground(Color.red);
            dateError.setText("You most choose date");
            valid = false;
        } else if (checkDate(DateChooser.getDate()) == false) {
            dateError.setForeground(Color.red);
            dateError.setText("Date must not be in the past, please choose again");
            dateError.setForeground(Color.red);
            valid = false;
        }

        if (Time_Label.getSelectedIndex() == 0) {
            timeError.setForeground(Color.red);
            timeError.setText("You most choose time");
            valid = false;
        }

        return valid;
    }

    // --------- check if selected date in past ---------
    private boolean checkDate(Date selectedDate) {
        boolean checker = true;

        Date today = new Date();
        int currentDay = today.getDate();
        int currentMonth = today.getMonth();

        int selectedDay = selectedDate.getDate();
        int selectedMonth = selectedDate.getMonth();

        if (currentDay == selectedDay && currentMonth == selectedMonth) {
            checker = true;
        } else if (selectedDate.before(today)) {
            checker = false;
        }

        return checker;
    }

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
            java.util.logging.Logger.getLogger(Date_Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Date_Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Date_Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Date_Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Date_Time().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back_label;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Cart_label;
    private javax.swing.JButton ConfirmButton;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JLabel Help_Label;
    private javax.swing.JLabel Home_label;
    private javax.swing.JComboBox<String> Time_Label;
    private javax.swing.JLabel dateError;
    private javax.swing.JLabel date_Label;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel timeError;
    private javax.swing.JLabel time_Label;
    // End of variables declaration//GEN-END:variables
}
