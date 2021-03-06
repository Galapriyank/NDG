/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacyRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthEventWorkRequest;
import Business.WorkQueue.HodApprovalWorkRequest;
import Business.WorkQueue.PrescriptionDetailsWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Hardik
 */
public class ViewPrescriptionDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPrescriptionDetailsJPanel
     */
    
    JPanel userProcessContainer;
    PrescriptionDetailsWorkRequest request;
    UserAccount account;
    Organization organization;
    EcoSystem business;
    
    public ViewPrescriptionDetailsJPanel(JPanel userProcessContainer, PrescriptionDetailsWorkRequest request, UserAccount account,Organization organization, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.organization = organization;
        this.request = request;
        
        ngoNameJTextField.setText(request.getNgoName());
        checkupCampNameJTextField.setText(request.getCampName());
        prescribtionDate.setText(request.getDate());
        childNameJTextField.setText(request.getChildName());
        ageJTextField.setText(String.valueOf(request.getChildAge()));
        prescriptionJTextField.setText(request.getPresDetails());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        childNameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ageJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        prescriptionJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ngoNameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        checkupCampNameJTextField = new javax.swing.JTextField();
        backJButton3 = new javax.swing.JButton();
        prescribtionDate = new javax.swing.JTextField();
        finishEventJButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PharmacyRole/medicine.png"))); // NOI18N
        jLabel1.setText("View Prescription");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 220, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PharmacyRole/pat.png"))); // NOI18N
        jLabel4.setText("Patient :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, -1, -1));

        childNameJTextField.setEditable(false);
        childNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(childNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 304, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PharmacyRole/age.png"))); // NOI18N
        jLabel5.setText("Age :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, -1, -1));

        ageJTextField.setEditable(false);
        ageJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(ageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 580, 304, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PharmacyRole/prx.png"))); // NOI18N
        jLabel6.setText("Prescription Details:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, -1, -1));

        prescriptionJTextField.setEditable(false);
        prescriptionJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(prescriptionJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 630, 304, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PharmacyRole/ngo.png"))); // NOI18N
        jLabel2.setText("NGO Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        ngoNameJTextField.setEditable(false);
        ngoNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(ngoNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 307, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PharmacyRole/details.png"))); // NOI18N
        jLabel3.setText("Checkup Details :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PharmacyRole/cal.png"))); // NOI18N
        jLabel15.setText("Date:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        checkupCampNameJTextField.setEditable(false);
        checkupCampNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(checkupCampNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 423, 304, 30));

        backJButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backJButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/PharmacyRole/back.png"))); // NOI18N
        backJButton3.setText("Back");
        backJButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton3.setBorderPainted(false);
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });
        add(backJButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 690, 100, 50));

        prescribtionDate.setEditable(false);
        prescribtionDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(prescribtionDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 483, 304, 30));

        finishEventJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        finishEventJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/finish.png"))); // NOI18N
        finishEventJButton.setText("Finished");
        finishEventJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        finishEventJButton.setBorderPainted(false);
        finishEventJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishEventJButtonActionPerformed(evt);
            }
        });
        add(finishEventJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 689, 100, 50));

        Background.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/background.jpg"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton3ActionPerformed

    private void finishEventJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishEventJButtonActionPerformed
       
                String workName = request.getCampName();
                for(Network network: business.getNetworkList()){
                    for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                            for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
                                if(request instanceof HodApprovalWorkRequest){
                                    String reqName = (String)((HodApprovalWorkRequest) request).getNgoEventReq().getHealthWorkshopName();
                                    if(workName.equals(reqName)){
                                        request.setStatus("Event Completed");
                                    }
                                }
                            }
                        }
                    }
                }
            
                JOptionPane.showMessageDialog(null,"Event Completed!");
            // TODO add your handling code here:
    }//GEN-LAST:event_finishEventJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField ageJTextField;
    private javax.swing.JButton backJButton3;
    private javax.swing.JTextField checkupCampNameJTextField;
    private javax.swing.JTextField childNameJTextField;
    private javax.swing.JButton finishEventJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField ngoNameJTextField;
    private javax.swing.JTextField prescribtionDate;
    private javax.swing.JTextField prescriptionJTextField;
    // End of variables declaration//GEN-END:variables
}
