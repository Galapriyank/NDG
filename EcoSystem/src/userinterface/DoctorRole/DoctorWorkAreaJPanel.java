/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.HospitalAdminOrganization;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthEventWorkRequest;
import Business.WorkQueue.HodApprovalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
//modifications
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private DoctorOrganization doctorOrganization;
    private Enterprise doctorEnterprise;
    private Enterprise enterprise;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */

    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization doctorOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.doctorOrganization = doctorOrganization;
        this.doctorEnterprise = enterprise;
        this.business = business;
        populateTable();
        populateEventRegistrationStatusTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof NGOAdminOrganization || organization instanceof HospitalAdminOrganization) {
                        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                            if (request instanceof HealthEventWorkRequest) {
                                HealthEventWorkRequest req = (HealthEventWorkRequest) request;
                                if(req.getEnterpriseList().size()>0)
                                {
                                    for (String enterpriseName : req.getEnterpriseList()) {
                                        if (enterpriseName == doctorEnterprise.getName()) {
                                            Object[] row = new Object[2];
                                            row[0] = req;
                                            row[1] = req.getNgoName();

                                            model.addRow(row);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void populateEventRegistrationStatusTable() {
        DefaultTableModel model = (DefaultTableModel) eventRegistrationStatusJTable.getModel();
        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof DoctorOrganization) {
                        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                            if (request.getSender() == userAccount) {
                                HodApprovalWorkRequest req = (HodApprovalWorkRequest) request;
                                Object[] row = new Object[4];
                                row[0] = req;
                                row[1] = req.getNgoEventReq();
                                row[2] = req.getNgoEventReq().getNgoName();
                                row[3] = req.getStatus();

                                model.addRow(row);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailsJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        eventRegistrationStatusJTable = new javax.swing.JTable();
        createPrescriptionJButton = new javax.swing.JButton();
        unregisterJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        refreshJButton2 = new javax.swing.JButton();
        requestTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detailsJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        detailsJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/DoctorRole/details.png"))); // NOI18N
        detailsJButton.setText("Details");
        detailsJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        detailsJButton.setBorderPainted(false);
        detailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsJButtonActionPerformed(evt);
            }
        });
        add(detailsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, 120, 50));

        refreshJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/DoctorRole/refresh.png"))); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        refreshJButton.setBorderPainted(false);
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 110, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("NGO Event Table :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, -1, -1));

        workRequestJTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Camp Name", "NGO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, 92));

        eventRegistrationStatusJTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eventRegistrationStatusJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Camp Name", "NGO", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(eventRegistrationStatusJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 690, 460, 92));

        createPrescriptionJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createPrescriptionJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/DoctorRole/prx.png"))); // NOI18N
        createPrescriptionJButton.setText("Create Rx");
        createPrescriptionJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        createPrescriptionJButton.setBorderPainted(false);
        createPrescriptionJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPrescriptionJButtonActionPerformed(evt);
            }
        });
        add(createPrescriptionJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 790, 120, 50));

        unregisterJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        unregisterJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/DoctorRole/dlink.png"))); // NOI18N
        unregisterJButton.setText("UnRegister");
        unregisterJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        unregisterJButton.setBorderPainted(false);
        unregisterJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unregisterJButtonActionPerformed(evt);
            }
        });
        add(unregisterJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 790, 120, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Event Registrations :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 660, -1, -1));

        refreshJButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        refreshJButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/DoctorRole/refresh.png"))); // NOI18N
        refreshJButton2.setText("Refresh");
        refreshJButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        refreshJButton2.setBorderPainted(false);
        refreshJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButton2ActionPerformed(evt);
            }
        });
        add(refreshJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 790, 110, 50));

        requestTestJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/DoctorRole/test.png"))); // NOI18N
        requestTestJButton.setText("Request");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, 130, 50));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 127, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 90, 26));

        Heading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Heading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/doc.png"))); // NOI18N
        Heading.setText("Doctor Work Panel");
        Heading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Heading.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(Heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 230, 100));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/background.jpg"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void detailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }

        HealthEventWorkRequest request = (HealthEventWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        //        request.setStatus("Processing");
        DoctorEventRegistrationJPanel doctorEventRegistrationJPanel = new DoctorEventRegistrationJPanel(userProcessContainer, request, userAccount, doctorOrganization, business);
        userProcessContainer.add("doctorEventRegistrationJPanel", doctorEventRegistrationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_detailsJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void createPrescriptionJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPrescriptionJButtonActionPerformed
        int selectedRow = eventRegistrationStatusJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }

        HodApprovalWorkRequest request = (HodApprovalWorkRequest) eventRegistrationStatusJTable.getValueAt(selectedRow, 0);
        HealthEventWorkRequest ngoEvtReq = request.getNgoEventReq();
        //        if(ngoEvtReq)
        if (!(request.getStatus().equals("Event Cancelled"))) {
            if (request.getStatus().equals("Registered")) {
                DoctorPrescriptionJPanel presCreationJPanel = new DoctorPrescriptionJPanel(userProcessContainer, ngoEvtReq, doctorOrganization, doctorEnterprise, business);
                userProcessContainer.add("presCreationJPanel", presCreationJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            request.setStatus("Under process");
        } else 
        {
            JOptionPane.showMessageDialog(null, "Event Cancelled!");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_createPrescriptionJButtonActionPerformed

    private void unregisterJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unregisterJButtonActionPerformed
        int selectedRow = eventRegistrationStatusJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }

        HodApprovalWorkRequest approvalRequest = (HodApprovalWorkRequest) eventRegistrationStatusJTable.getValueAt(selectedRow, 0);
        HealthEventWorkRequest ngoEvtReq = approvalRequest.getNgoEventReq();

        if (!(approvalRequest.getStatus().equals("Event Cancelled"))) {
            ngoEvtReq.getDoctorList().remove(userAccount.getEmployee());
            if (ngoEvtReq.getDoctorWaitList().size() > 0) {
                Employee waitlistedEmp = ngoEvtReq.getDoctorWaitList().get(0);
                ngoEvtReq.getDoctorList().add(waitlistedEmp);
                for (Network network : business.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (organization instanceof DoctorOrganization) {
                                for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                                    if (request.getSender().getEmployee() == waitlistedEmp) {

                                        request.setStatus("Registered");

                                    }
                                }
                            }
                        }
                    }
                }
            }
            approvalRequest.setStatus("Unregistered");
            populateEventRegistrationStatusTable();
        } else {
            JOptionPane.showMessageDialog(null, "Event Cancelled!");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_unregisterJButtonActionPerformed

    private void refreshJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButton2ActionPerformed
        populateEventRegistrationStatusTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshJButton2ActionPerformed

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestLabTestJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Heading;
    private javax.swing.JButton createPrescriptionJButton;
    private javax.swing.JButton detailsJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JTable eventRegistrationStatusJTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton refreshJButton2;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JButton unregisterJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}