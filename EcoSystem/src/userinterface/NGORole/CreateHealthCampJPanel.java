/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGORole;

import Business.Enterprise.Enterprise;
import Business.Organization.HospitalAdminOrganization;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EducationEventWorkRequest;
import Business.WorkQueue.HealthEventWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.HospitalAdminRole.HospitalAdminWorkAreaJPanel;

/**
 *
 * @author Hardik
 */
public class CreateHealthCampJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateHealthCampJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;

    public CreateHealthCampJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doctorsRequiredJTextField = new javax.swing.JTextField();
        venueJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        durationTextBox = new javax.swing.JTextField();
        campNameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doctorsRequiredJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(doctorsRequiredJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 255, 30));

        venueJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(venueJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, 255, 30));

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/back.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton.setBorderPainted(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 690, 100, 50));

        submitJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/submit.png"))); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        submitJButton.setBorderPainted(false);
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 690, 100, 50));

        durationTextBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(durationTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, 255, 30));

        campNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(campNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 255, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/camp.png"))); // NOI18N
        jLabel1.setText("Create Health Checkup Camp");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/calen.png"))); // NOI18N
        jLabel8.setText(" Date :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/tent.png"))); // NOI18N
        jLabel9.setText("Name :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/stethoscope.png"))); // NOI18N
        jLabel3.setText("Dr's. Required :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/venue.png"))); // NOI18N
        jLabel5.setText("Venue:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/time.png"))); // NOI18N
        jLabel7.setText("Duration :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/cal.png"))); // NOI18N
        jLabel4.setText("Deadline :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 630, -1, -1));
        add(jXDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 250, 30));
        add(jXDatePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 630, 260, 30));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/background.jpg"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        if (doctorsRequiredJTextField.getText().equals("") || jXDatePicker1.getDate() == null || venueJTextField.getText().equals("") || durationTextBox.getText().equals("") || campNameJTextField.getText().equals("") || jXDatePicker2.getDate() == null) {
            JOptionPane.showMessageDialog(null, "One or more fields are empty");
            return;
        }
        if(!durationTextBox.getText().matches("[0-9]{1,2}")){
            JOptionPane.showMessageDialog(null, "Duration has to be numeric!");
            return;
        }
        int doctorNum;
        try {

            doctorNum = Integer.parseInt(doctorsRequiredJTextField.getText());
            String doctorNumber = doctorsRequiredJTextField.getText();
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
            String date = formatter.format(jXDatePicker1.getDate());
            String venue = venueJTextField.getText();
            String duration = durationTextBox.getText();
            String campName = campNameJTextField.getText();
            String deadline = formatter.format(jXDatePicker2.getDate());

            HealthEventWorkRequest request = new HealthEventWorkRequest();
            request.setVenue(venue);
            request.setDate(date);
            request.setDoctorRequired(doctorNumber);
            request.setSender(account);
            request.setStatus("Sent To Hospitals");
            request.setNgoName(enterprise.getName());
            request.setDuration(duration);
            request.setHealthWorkshopName(campName);
            request.setDeadline(deadline);
//        request.setEventDate(datePicker.getDate());

            Organization org = null;
            //Enterprise enterprise = 
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof NGOAdminOrganization) {
                    org = organization;
                    break;
                }
                if (organization instanceof HospitalAdminOrganization) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(request);
                account.getWorkQueue().getWorkRequestList().add(request);
                //System.out.println(org.getWorkQueue().getWorkRequestList());
            }
            JOptionPane.showMessageDialog(null, "Health Checkup Camp Created.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter a valid number for Doctors Required!");
        }

        doctorsRequiredJTextField.setText("");
        jXDatePicker1.setDate(null);
        venueJTextField.setText("");
        durationTextBox.setText("");
        campNameJTextField.setText("");
        jXDatePicker2.setDate(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] comps = userProcessContainer.getComponents();
        for (Component c : comps) {
            if (c instanceof HealthEventJPanel) {
                HealthEventJPanel panel = (HealthEventJPanel) c;
                panel.populateHealthCampTable();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField campNameJTextField;
    private javax.swing.JTextField doctorsRequiredJTextField;
    private javax.swing.JTextField durationTextBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField venueJTextField;
    // End of variables declaration//GEN-END:variables
}
