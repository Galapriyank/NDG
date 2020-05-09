/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGORole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.GroceryAdminOrganization;
import Business.Organization.HospitalAdminOrganization;
import Business.Organization.HrOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EducationEventWorkRequest;
import Business.WorkQueue.GroceryDistributionEventRequest;
import Business.WorkQueue.HealthEventWorkRequest;
import Business.WorkQueue.ManagerApprovalWorkRequest;
import Business.WorkQueue.NGOGroceryEventRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.GroceryRole.GroceryStoreWorkAreaJPanel;
import userinterface.GroceryRole.RequestGroceryDistributionJPanel;

/**
 *
 * @author Apoorva
 */
public class NGOWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private NGOAdminOrganization ngoAdminOrganization;
    private GroceryAdminOrganization groceryStoreOrganization;
    EcoSystem business;

    public NGOWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, NGOAdminOrganization ngoAdminOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ngoAdminOrganization = ngoAdminOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        //populateOrganizationComboBox();
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof GroceryAdminOrganization) {
                        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                            if (request instanceof GroceryDistributionEventRequest) {
                                GroceryDistributionEventRequest req = (GroceryDistributionEventRequest) request;
                                Object[] row = new Object[3];
                                row[0] = req;
                                row[1] = req.getSender();
                                row[2] = req.getStatus();
                                model.addRow(row);
                            }
                        }
                    } else if (organization instanceof HrOrganization) {
                        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                            if (request instanceof EducationEventWorkRequest) {
                                EducationEventWorkRequest req = (EducationEventWorkRequest) request;
                                Object[] row = new Object[3];
                                row[0] = req;
                                row[1] = req.getNgoName();
                                row[2] = req.getStatus();
                                model.addRow(row);

                            }
                        }
                    } else if (organization instanceof NGOAdminOrganization) {
                        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                            if (request instanceof EducationEventWorkRequest) {
                                EducationEventWorkRequest req = (EducationEventWorkRequest) request;
                                Object[] row = new Object[3];
                                row[0] = req;
                                row[1] = req.getNgoName();
                                row[2] = req.getStatus();
                                model.addRow(row);
                            }
                            if (request instanceof GroceryDistributionEventRequest) {
                                GroceryDistributionEventRequest req = (GroceryDistributionEventRequest) request;
                                Object[] row = new Object[3];
                                row[0] = req;
                                row[1] = req.getSender();
                                row[2] = req.getStatus();
                                model.addRow(row);
                            }
                            if (request instanceof HealthEventWorkRequest) {
                                HealthEventWorkRequest req = (HealthEventWorkRequest) request;
                                Object[] row = new Object[3];
                                row[0] = req;
                                row[1] = req.getNgoName();
                                row[2] = req.getStatus();
                                model.addRow(row);
                            }
                        }
                    }
                    else if (organization instanceof HospitalAdminOrganization) {
                        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                            if (request instanceof HealthEventWorkRequest) {
                                HealthEventWorkRequest req = (HealthEventWorkRequest) request;
                                Object[] row = new Object[3];
                                row[0] = req;
                                row[1] = req.getNgoName();
                                row[2] = req.getStatus();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        createDoctorVisit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Event", "Sender", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 690, 96));

        processJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/Process.png"))); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, 120, 50));

        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/refresh.png"))); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, 120, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/ngo.png"))); // NOI18N
        jLabel1.setText("NGO Panel");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 130, 100));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/teach.png"))); // NOI18N
        jButton1.setText("Education");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 610, -1, 50));

        createDoctorVisit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/camp.png"))); // NOI18N
        createDoctorVisit.setText("Health");
        createDoctorVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDoctorVisitActionPerformed(evt);
            }
        });
        add(createDoctorVisit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 610, 130, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/NGORole/basket.png"))); // NOI18N
        jButton3.setText("Grocery");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 610, 130, 50));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/background.jpg"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1280, 950));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof NGOAdminOrganization || organization instanceof HrOrganization || organization instanceof GroceryAdminOrganization) {
                        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList())
                        {
                            String pendingStatus = (String)workRequestJTable.getValueAt(selectedRow, 2);
                            if (workRequestJTable.getValueAt(selectedRow, 0) instanceof EducationEventWorkRequest) {
                                EducationEventWorkRequest request1 = (EducationEventWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
                                EducationEventDetailsJPanel viewEventDetailsJPanel = new EducationEventDetailsJPanel(userProcessContainer, request1, userAccount, enterprise, business);
                                userProcessContainer.add("viewEventDetailsJPanel", viewEventDetailsJPanel);
                                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                                layout.next(userProcessContainer);
                                break;
                            } else if (workRequestJTable.getValueAt(selectedRow, 0) instanceof GroceryDistributionEventRequest) {
                                if (pendingStatus.equals("Pending with NGO Admin")) {
                                    GroceryDistributionEventRequest request1 = (GroceryDistributionEventRequest) workRequestJTable.getValueAt(selectedRow, 0);
                                    ProcessGroceryDistributionRequestJPanel processRequestPanel = new ProcessGroceryDistributionRequestJPanel(userProcessContainer, request1, userAccount, enterprise, business);
                                    userProcessContainer.add("processRequestPanel", processRequestPanel);
                                    System.out.println("here" + request1.getStatus());
                                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                                    layout.next(userProcessContainer);
                                    break;
                                } else{
                                    JOptionPane.showMessageDialog(null, "Process pending with Grocery Admin!");
                                    return;
                                }
                                
                            }
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        educationEventJPanel educationWorkshopEventJPanel = new educationEventJPanel(userProcessContainer, userAccount, ngoAdminOrganization, enterprise, business);
        userProcessContainer.add("educationWorkshopEventJPanel", educationWorkshopEventJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void createDoctorVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDoctorVisitActionPerformed
        // TODO add your handling code here:
        HealthEventJPanel healthEventJPanel = new HealthEventJPanel(userProcessContainer, userAccount, ngoAdminOrganization, enterprise, business);
        userProcessContainer.add("healthEventJPanel", healthEventJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);   
    }//GEN-LAST:event_createDoctorVisitActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestGroceryDistributionJPanel", new RequestGroceryDistributionJPanel(userProcessContainer, userAccount, groceryStoreOrganization, enterprise, business));
        layout.next(userProcessContainer);


    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton createDoctorVisit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

}
