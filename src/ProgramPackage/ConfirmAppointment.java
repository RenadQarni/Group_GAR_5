/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramPackage;

/**
 *
 * @author renad
 */
public class ConfirmAppointment extends javax.swing.JFrame {

    /**
     * Creates new form Confirmation_Button
     */
    public ConfirmAppointment() {
        initComponents();

        // display appointment informations
        Appointment appointment = MakeAppointment.client_appointment;
        BetsNo_Label.setText(appointment.PetsNo());
        Date_Label.setText(appointment.Date());
        Time_Label.setText(appointment.time());
        services.setText(appointment.services());
        TotalPrice_Label.setText("Total Price : " + appointment.getTotalPrice() + " SR");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConfirmationBackground_Panel = new javax.swing.JPanel();
        Confirmation_Button = new javax.swing.JButton();
        Page_Title_Label = new javax.swing.JLabel();
        Appointment_Info_Label = new javax.swing.JLabel();
        BetsNo_Label = new javax.swing.JLabel();
        Date_Label = new javax.swing.JLabel();
        Time_Label = new javax.swing.JLabel();
        TotalPrice_Label = new javax.swing.JLabel();
        backToprevious = new javax.swing.JLabel();
        services = new javax.swing.JTextArea();
        Services_Title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ConfirmationBackground_Panel.setBackground(new java.awt.Color(249, 249, 249));
        ConfirmationBackground_Panel.setEnabled(false);
        ConfirmationBackground_Panel.setMinimumSize(new java.awt.Dimension(690, 450));
        ConfirmationBackground_Panel.setPreferredSize(new java.awt.Dimension(380, 700));
        ConfirmationBackground_Panel.setLayout(null);

        Confirmation_Button.setBackground(new java.awt.Color(121, 99, 175));
        Confirmation_Button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Confirmation_Button.setForeground(new java.awt.Color(255, 255, 255));
        Confirmation_Button.setText("Confirm");
        Confirmation_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToPayment(evt);
            }
        });
        ConfirmationBackground_Panel.add(Confirmation_Button);
        Confirmation_Button.setBounds(113, 582, 120, 54);

        Page_Title_Label.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Page_Title_Label.setForeground(new java.awt.Color(91, 74, 132));
        Page_Title_Label.setText("Confirm Appointment");
        ConfirmationBackground_Panel.add(Page_Title_Label);
        Page_Title_Label.setBounds(50, 20, 270, 30);

        Appointment_Info_Label.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Appointment_Info_Label.setForeground(new java.awt.Color(91, 74, 132));
        Appointment_Info_Label.setText("Appointment Information:");
        ConfirmationBackground_Panel.add(Appointment_Info_Label);
        Appointment_Info_Label.setBounds(70, 130, 220, 24);

        BetsNo_Label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BetsNo_Label.setForeground(new java.awt.Color(91, 74, 132));
        BetsNo_Label.setText("BetsNo");
        ConfirmationBackground_Panel.add(BetsNo_Label);
        BetsNo_Label.setBounds(10, 190, 256, 19);

        Date_Label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Date_Label.setForeground(new java.awt.Color(91, 74, 132));
        Date_Label.setText("Date");
        ConfirmationBackground_Panel.add(Date_Label);
        Date_Label.setBounds(10, 240, 275, 19);

        Time_Label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Time_Label.setForeground(new java.awt.Color(91, 74, 132));
        Time_Label.setText("Time");
        ConfirmationBackground_Panel.add(Time_Label);
        Time_Label.setBounds(10, 280, 363, 19);

        TotalPrice_Label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TotalPrice_Label.setForeground(new java.awt.Color(91, 74, 132));
        TotalPrice_Label.setText("Total Price");
        ConfirmationBackground_Panel.add(TotalPrice_Label);
        TotalPrice_Label.setBounds(10, 510, 366, 30);

        backToprevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back_arrow.png"))); // NOI18N
        backToprevious.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToprevious(evt);
            }
        });
        ConfirmationBackground_Panel.add(backToprevious);
        backToprevious.setBounds(6, 19, 15, 25);

        services.setEditable(false);
        services.setColumns(20);
        services.setForeground(new java.awt.Color(91, 74, 132));
        services.setRows(5);
        services.setDisabledTextColor(new java.awt.Color(91, 74, 132));
        services.setFocusable(false);
        ConfirmationBackground_Panel.add(services);
        services.setBounds(20, 360, 340, 140);

        Services_Title.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Services_Title.setForeground(new java.awt.Color(91, 74, 132));
        Services_Title.setText("Services");
        ConfirmationBackground_Panel.add(Services_Title);
        Services_Title.setBounds(10, 330, 100, 19);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ConfirmationBackground_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ConfirmationBackground_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goToPayment(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToPayment
        // go to payment interface to choose payment method
        Payment X = new Payment();
        X.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goToPayment

    private void backToprevious(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToprevious

        // back to browse make appointment interface
        MakeAppointment X;
        X = new MakeAppointment();
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
            java.util.logging.Logger.getLogger(ConfirmAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appointment_Info_Label;
    private javax.swing.JLabel BetsNo_Label;
    private javax.swing.JPanel ConfirmationBackground_Panel;
    private javax.swing.JButton Confirmation_Button;
    private javax.swing.JLabel Date_Label;
    private javax.swing.JLabel Page_Title_Label;
    private javax.swing.JLabel Services_Title;
    private javax.swing.JLabel Time_Label;
    private javax.swing.JLabel TotalPrice_Label;
    private javax.swing.JLabel backToprevious;
    private javax.swing.JTextArea services;
    // End of variables declaration//GEN-END:variables
}
