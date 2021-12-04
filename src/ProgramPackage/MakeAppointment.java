package ProgramPackage;

import java.awt.Color;
/**
 *
 * @author renad
 */
public class MakeAppointment extends javax.swing.JFrame {

    public static Appointment client_appointment;
    /**
     * Creates new form VeterinaryClinic
     *
     */
    public MakeAppointment() {
        initComponents();

        // initialize clinic services
        Service.services.add(new Service("Health Care", 100));
        Service.services.add(new Service("Beauty Services", 150));
        Service.services.add(new Service("Insects Control", 80));
        Service.services.add(new Service("Training", 250));

        Health_Care_CheckBox.setText(Health_Care_CheckBox.getText() + " " + Service.services.get(0).getPrice() + "SR");
        Beauty_Services_CheckBox.setText(Beauty_Services_CheckBox.getText() + " " + Service.services.get(1).getPrice() + "SR");
        Insects_Control_CheckBox.setText(Insects_Control_CheckBox.getText() + " " + Service.services.get(2).getPrice() + "SR");
        Training_CheckBox.setText(Training_CheckBox.getText() + " " + Service.services.get(3).getPrice() + "SR");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MakeAppointmentBackground_Panel = new javax.swing.JPanel();
        PageTitle_Label = new javax.swing.JLabel();
        Services_Label = new javax.swing.JLabel();
        Health_Care_CheckBox = new javax.swing.JCheckBox();
        Beauty_Services_CheckBox = new javax.swing.JCheckBox();
        Insects_Control_CheckBox = new javax.swing.JCheckBox();
        Training_CheckBox = new javax.swing.JCheckBox();
        pets_Label = new javax.swing.JLabel();
        noOfPets_Spinner = new javax.swing.JSpinner();
        nextStep_Button = new javax.swing.JButton();
        errorMessage_Label = new javax.swing.JLabel();
        Back_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(380, 700));

        MakeAppointmentBackground_Panel.setBackground(new java.awt.Color(255, 255, 255));
        MakeAppointmentBackground_Panel.setPreferredSize(new java.awt.Dimension(550, 550));
        MakeAppointmentBackground_Panel.setLayout(null);

        PageTitle_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PageTitle_Label.setForeground(new java.awt.Color(91, 74, 132));
        PageTitle_Label.setText("Make Appointment");
        MakeAppointmentBackground_Panel.add(PageTitle_Label);
        PageTitle_Label.setBounds(20, 80, 260, 29);

        Services_Label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Services_Label.setForeground(new java.awt.Color(91, 74, 132));
        Services_Label.setText("Choose Services :");
        MakeAppointmentBackground_Panel.add(Services_Label);
        Services_Label.setBounds(40, 170, 128, 19);

        Health_Care_CheckBox.setBackground(new java.awt.Color(226, 221, 240));
        Health_Care_CheckBox.setForeground(new java.awt.Color(91, 74, 132));
        Health_Care_CheckBox.setText("Health Care");
        MakeAppointmentBackground_Panel.add(Health_Care_CheckBox);
        Health_Care_CheckBox.setBounds(40, 200, 190, 24);

        Beauty_Services_CheckBox.setBackground(new java.awt.Color(226, 221, 240));
        Beauty_Services_CheckBox.setForeground(new java.awt.Color(91, 74, 132));
        Beauty_Services_CheckBox.setText("Beauty Services");
        MakeAppointmentBackground_Panel.add(Beauty_Services_CheckBox);
        Beauty_Services_CheckBox.setBounds(40, 280, 190, 24);

        Insects_Control_CheckBox.setBackground(new java.awt.Color(226, 221, 240));
        Insects_Control_CheckBox.setForeground(new java.awt.Color(91, 74, 132));
        Insects_Control_CheckBox.setText("Insects Control");
        MakeAppointmentBackground_Panel.add(Insects_Control_CheckBox);
        Insects_Control_CheckBox.setBounds(40, 240, 190, 24);

        Training_CheckBox.setBackground(new java.awt.Color(226, 221, 240));
        Training_CheckBox.setForeground(new java.awt.Color(91, 74, 132));
        Training_CheckBox.setText("Training");
        MakeAppointmentBackground_Panel.add(Training_CheckBox);
        Training_CheckBox.setBounds(40, 320, 190, 24);

        pets_Label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pets_Label.setForeground(new java.awt.Color(91, 74, 132));
        pets_Label.setText("How many pets?");
        MakeAppointmentBackground_Panel.add(pets_Label);
        pets_Label.setBounds(40, 130, 114, 19);

        noOfPets_Spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        MakeAppointmentBackground_Panel.add(noOfPets_Spinner);
        noOfPets_Spinner.setBounds(180, 130, 52, 26);

        nextStep_Button.setBackground(new java.awt.Color(91, 74, 132));
        nextStep_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nextStep_Button.setForeground(new java.awt.Color(255, 255, 255));
        nextStep_Button.setText("Next ");
        nextStep_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveAppointmentInfo(evt);
            }
        });
        MakeAppointmentBackground_Panel.add(nextStep_Button);
        nextStep_Button.setBounds(160, 469, 100, 50);

        errorMessage_Label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MakeAppointmentBackground_Panel.add(errorMessage_Label);
        errorMessage_Label.setBounds(10, 390, 350, 50);

        Back_label.setForeground(new java.awt.Color(91, 74, 132));
        Back_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back_arrow.png"))); // NOI18N
        Back_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_labelbackTo_pre(evt);
            }
        });
        MakeAppointmentBackground_Panel.add(Back_label);
        Back_label.setBounds(10, 10, 14, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MakeAppointmentBackground_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MakeAppointmentBackground_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // --------- Check if user fill in correctly all the requirements ---------
    private boolean checkAppoinmentInfo() {
        Services_Label.setForeground(Color.black);
        errorMessage_Label.setText(" ");

        boolean validInfo = true;

        if (!Health_Care_CheckBox.isSelected() && !Beauty_Services_CheckBox.isSelected()
                && !Insects_Control_CheckBox.isSelected() && !Training_CheckBox.isSelected()) {
            Services_Label.setForeground(Color.red);
            displayErrorMassage();
            validInfo = false;
        }

        return validInfo;
    }

    // --------- display the error massage for empty feild ---------
    private void displayErrorMassage() {
        errorMessage_Label.setText("Please fill in all the requirements to confirm the appointment");
        errorMessage_Label.setForeground(Color.red);
    }

    // --------- save the appointment information on the clinc appointment list ---------
    private void saveAppointmentInfo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveAppointmentInfo
        if (checkAppoinmentInfo() == true) {

            client_appointment = new Appointment();
            client_appointment.setNoPet((int) noOfPets_Spinner.getValue());

            if (Health_Care_CheckBox.isSelected()) {
                client_appointment.addService(Service.services.get(0));
                client_appointment.setTotalPrice(client_appointment.getTotalPrice() + Service.services.get(0).getPrice());
            }
            if (Beauty_Services_CheckBox.isSelected()) {
                client_appointment.addService(Service.services.get(1));
                client_appointment.setTotalPrice(client_appointment.getTotalPrice() + Service.services.get(1).getPrice());
            }
            if (Insects_Control_CheckBox.isSelected()) {
                client_appointment.addService(Service.services.get(2));
                client_appointment.setTotalPrice(client_appointment.getTotalPrice() + (Service.services.get(2).getPrice()));
            }
            if (Training_CheckBox.isSelected()) {
                client_appointment.addService(Service.services.get(3));
                client_appointment.setTotalPrice(client_appointment.getTotalPrice() + Service.services.get(3).getPrice());
            }

            client_appointment.setTotalPrice(client_appointment.getTotalPrice() * client_appointment.getNoPet());
        

            Date_Time X = new Date_Time();
            X.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_saveAppointmentInfo

    private void Back_labelbackTo_pre(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_labelbackTo_pre
        PetCareServices go_to_PetCareServices = new PetCareServices();
        go_to_PetCareServices.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Back_labelbackTo_pre

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
            java.util.logging.Logger.getLogger(MakeAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakeAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakeAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakeAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakeAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back_label;
    private javax.swing.JCheckBox Beauty_Services_CheckBox;
    private javax.swing.JCheckBox Health_Care_CheckBox;
    private javax.swing.JCheckBox Insects_Control_CheckBox;
    private javax.swing.JPanel MakeAppointmentBackground_Panel;
    private javax.swing.JLabel PageTitle_Label;
    private javax.swing.JLabel Services_Label;
    private javax.swing.JCheckBox Training_CheckBox;
    private javax.swing.JLabel errorMessage_Label;
    private javax.swing.JButton nextStep_Button;
    private javax.swing.JSpinner noOfPets_Spinner;
    private javax.swing.JLabel pets_Label;
    // End of variables declaration//GEN-END:variables
}
