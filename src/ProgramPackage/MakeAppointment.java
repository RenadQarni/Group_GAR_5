package ProgramPackage;

import java.awt.Color;
import java.awt.Image;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author renad
 */
public class MakeAppointment extends javax.swing.JFrame {

    static File file;
    static PrintWriter p;
    static FileWriter f;
    public static Appointment a;
    static ArrayList<String> s = new ArrayList<>();

    /**
     * Creates new form VeterinaryClinic
     * @throws java.io.FileNotFoundException
     */
    public MakeAppointment() throws FileNotFoundException {
        initComponents();

        // set background 
        ImageIcon background = new ImageIcon("src\\Icons\\b2.jpg");
        background = new ImageIcon(background.getImage().getScaledInstance(Background.getWidth(), Background.getHeight(), Image.SCALE_DEFAULT));
        Background.setIcon(background);
        Background.repaint();
        
        file = new File("AppointmentInfo.txt");
        p = new PrintWriter(file);

        // initialize clinic services
        Service.services.add(new Service("Health Care", 100, true));
        Service.services.add(new Service("Beauty Services", 150, true));
        Service.services.add(new Service("Insects Control", 80, true));
        Service.services.add(new Service("Training", 250, true));

        Health_Care_CheckBox.setText(Health_Care_CheckBox.getText() + " " + Service.services.get(0).getPrice() + "SR");
        Beauty_Services_CheckBox.setText(Beauty_Services_CheckBox.getText() + " " + Service.services.get(1).getPrice() + "SR");
        Insects_Control_CheckBox.setText(Insects_Control_CheckBox.getText() + " " + Service.services.get(2).getPrice() + "SR");
        Training_CheckBox.setText(Training_CheckBox.getText() + " " + Service.services.get(3).getPrice() + "SR");

    }

    static void file() throws IOException {
        //f = null;
        try {
            f = new FileWriter(file);
        } catch (IOException ex) {
            Logger.getLogger(MakeAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }
        p = new PrintWriter(f);
        p.print(a);

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
        backToprevious = new javax.swing.JLabel();
        PageTitle_Label = new javax.swing.JLabel();
        Services_Label = new javax.swing.JLabel();
        Health_Care_CheckBox = new javax.swing.JCheckBox();
        Beauty_Services_CheckBox = new javax.swing.JCheckBox();
        Insects_Control_CheckBox = new javax.swing.JCheckBox();
        appDate_Label = new javax.swing.JLabel();
        Training_CheckBox = new javax.swing.JCheckBox();
        pets_Label = new javax.swing.JLabel();
        noOfPets_Spinner = new javax.swing.JSpinner();
        nextStep_Button = new javax.swing.JButton();
        time_List = new javax.swing.JComboBox<>();
        appTime_Label = new javax.swing.JLabel();
        errorMessage_Label = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MakeAppointmentBackground_Panel.setBackground(new java.awt.Color(255, 255, 255));
        MakeAppointmentBackground_Panel.setPreferredSize(new java.awt.Dimension(550, 550));
        MakeAppointmentBackground_Panel.setLayout(null);

        backToprevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        backToprevious.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToPrevious(evt);
            }
        });
        MakeAppointmentBackground_Panel.add(backToprevious);
        backToprevious.setBounds(0, 0, 50, 50);

        PageTitle_Label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PageTitle_Label.setText("Make Appointment");
        MakeAppointmentBackground_Panel.add(PageTitle_Label);
        PageTitle_Label.setBounds(182, 15, 164, 24);

        Services_Label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Services_Label.setText("Choose Services :");
        MakeAppointmentBackground_Panel.add(Services_Label);
        Services_Label.setBounds(39, 141, 128, 19);

        Health_Care_CheckBox.setText("Health Care");
        MakeAppointmentBackground_Panel.add(Health_Care_CheckBox);
        Health_Care_CheckBox.setBounds(69, 178, 190, 29);

        Beauty_Services_CheckBox.setText("Beauty Services");
        MakeAppointmentBackground_Panel.add(Beauty_Services_CheckBox);
        Beauty_Services_CheckBox.setBounds(265, 178, 190, 29);

        Insects_Control_CheckBox.setText("Insects Control");
        MakeAppointmentBackground_Panel.add(Insects_Control_CheckBox);
        Insects_Control_CheckBox.setBounds(69, 209, 190, 29);

        appDate_Label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        appDate_Label.setText("Choose Appointment Date :");
        MakeAppointmentBackground_Panel.add(appDate_Label);
        appDate_Label.setBounds(39, 259, 191, 19);

        Training_CheckBox.setText("Training");
        MakeAppointmentBackground_Panel.add(Training_CheckBox);
        Training_CheckBox.setBounds(265, 209, 190, 29);

        pets_Label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pets_Label.setText("How many pets?");
        MakeAppointmentBackground_Panel.add(pets_Label);
        pets_Label.setBounds(39, 106, 114, 19);

        noOfPets_Spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        noOfPets_Spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                noPet(evt);
            }
        });
        MakeAppointmentBackground_Panel.add(noOfPets_Spinner);
        noOfPets_Spinner.setBounds(182, 103, 52, 26);

        nextStep_Button.setText("Next Step");
        nextStep_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveAppointmentInfo(evt);
            }
        });
        nextStep_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextStep_ButtonActionPerformed(evt);
            }
        });
        MakeAppointmentBackground_Panel.add(nextStep_Button);
        nextStep_Button.setBounds(260, 400, 101, 29);

        time_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    :     AM/PM", "08:00 AM", "09:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "01:00 PM", "02:00 PM", "03:00 PM", "04:00 PM" }));
        MakeAppointmentBackground_Panel.add(time_List);
        time_List.setBounds(245, 307, 139, 26);

        appTime_Label.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        appTime_Label.setText("Choose Appointment Time :");
        MakeAppointmentBackground_Panel.add(appTime_Label);
        appTime_Label.setBounds(39, 310, 192, 19);
        MakeAppointmentBackground_Panel.add(errorMessage_Label);
        errorMessage_Label.setBounds(150, 350, 350, 21);

        Background.setIconTextGap(0);
        Background.setPreferredSize(new java.awt.Dimension(550, 550));
        MakeAppointmentBackground_Panel.add(Background);
        Background.setBounds(0, 0, 550, 550);
        MakeAppointmentBackground_Panel.add(jDateChooser1);
        jDateChooser1.setBounds(250, 260, 130, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MakeAppointmentBackground_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MakeAppointmentBackground_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BCboxActionPerformed

    private void noPet(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_noPet
        String spinner = "catch Value";
        Integer myint = (Integer) noOfPets_Spinner.getValue();
        spinner = myint.toString();
        s.add(spinner);
    }//GEN-LAST:event_noPet

    // --------- Check if user fill in correctly all the requirements ---------
    private boolean checkAppoinmentInfo() {
        Services_Label.setForeground(Color.black);
        appDate_Label.setForeground(Color.black);
        appTime_Label.setForeground(Color.black);
        errorMessage_Label.setText(" ");

        boolean validInfo = true;

        if (validInfo == true) {

            if (!Health_Care_CheckBox.isSelected() && !Beauty_Services_CheckBox.isSelected()
                    && !Insects_Control_CheckBox.isSelected() && !Training_CheckBox.isSelected()) {
                Services_Label.setForeground(Color.red);
                displayErrorMassage();
                validInfo = false;
            }

            if (jDateChooser1.getDate() == null) {
                appDate_Label.setForeground(Color.red);
                displayErrorMassage();
                validInfo = false;
            } else if (checkDate(jDateChooser1.getDate()) == false) {
                appDate_Label.setForeground(Color.red);
                errorMessage_Label.setText("Date must not be in the past, please choose different date");
                errorMessage_Label.setForeground(Color.red);
                validInfo = false;
            }

            if (time_List.getSelectedIndex() == 0) {
                appTime_Label.setForeground(Color.red);
                displayErrorMassage();
                validInfo = false;
            }
        }

        return validInfo;
    }

    // --------- check if selected date in past ---------
    private boolean checkDate(Date selectedDate) {
        boolean checker = true;

        Date today = new Date();
        int currentDay = today.getDate();
        int currentMonth = today.getMonth();

        int selectedDay = jDateChooser1.getDate().getDate();
        int selectedMonth = jDateChooser1.getDate().getMonth();

        if (currentDay == selectedDay && currentMonth == selectedMonth) {
            checker = true;
        } else if (jDateChooser1.getDate().before(today)) {
            checker = false;
        }

        return checker;
    }

    // --------- display the error massage for empty feild ---------
    private void displayErrorMassage() {
        errorMessage_Label.setText("Please fill in all the requirements to confirm the appointment");
        errorMessage_Label.setForeground(Color.red);
    }

    // --------- save the appointment information on the clinc appointment list ---------
    private void saveAppointmentInfo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveAppointmentInfo
        if (checkAppoinmentInfo() == true) {

            a = new Appointment();
            a.setNoPet((int) noOfPets_Spinner.getValue());
            a.setDate(jDateChooser1.getDate());
            a.setTime(time_List.getItemAt(time_List.getSelectedIndex()));

            if (Health_Care_CheckBox.isSelected()) {
                a.addService(Service.services.get(0));
                a.setTotalPrice(a.getTotalPrice() + Service.services.get(0).getPrice());
            }
            if (Beauty_Services_CheckBox.isSelected()) {
                a.addService(Service.services.get(1));
                a.setTotalPrice(a.getTotalPrice() + Service.services.get(1).getPrice());
            }
            if (Insects_Control_CheckBox.isSelected()) {
                a.addService(Service.services.get(2));
                a.setTotalPrice(a.getTotalPrice() + (Service.services.get(2).getPrice()));
            }
            if (Training_CheckBox.isSelected()) {
                a.addService(Service.services.get(3));
                a.setTotalPrice(a.getTotalPrice() + Service.services.get(3).getPrice());
            }

            a.setTotalPrice(a.getTotalPrice() * a.getNoPet());
            p.print(a);

            ConfirmAppointment X = new ConfirmAppointment();
            X.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_saveAppointmentInfo

    private void backToPrevious(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToPrevious
        // back to browse services interface

        //*** not implemented yet ***
    }//GEN-LAST:event_backToPrevious

    private void nextStep_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextStep_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextStep_ButtonActionPerformed

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
                try {
                    new MakeAppointment().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MakeAppointment.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JCheckBox Beauty_Services_CheckBox;
    private javax.swing.JCheckBox Health_Care_CheckBox;
    private javax.swing.JCheckBox Insects_Control_CheckBox;
    private javax.swing.JPanel MakeAppointmentBackground_Panel;
    private javax.swing.JLabel PageTitle_Label;
    private javax.swing.JLabel Services_Label;
    private javax.swing.JCheckBox Training_CheckBox;
    private javax.swing.JLabel appDate_Label;
    private javax.swing.JLabel appTime_Label;
    private javax.swing.JLabel backToprevious;
    private javax.swing.JLabel errorMessage_Label;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JButton nextStep_Button;
    private javax.swing.JSpinner noOfPets_Spinner;
    private javax.swing.JLabel pets_Label;
    private javax.swing.JComboBox<String> time_List;
    // End of variables declaration//GEN-END:variables
}
