/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EmployeeRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.EmployeeOrganization;
import Business.Organization.HrOrganization;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EducationEventWorkRequest;
import Business.WorkQueue.ManagerApprovalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Priyank
 */
public class EmployeeWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmployeeWorkAreaJPanel
     */
    /**
     * Creates new form EmployeeWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private EmployeeOrganization employeeOrganization;
    private Enterprise employeeEnterprise;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public EmployeeWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, 
            Organization organization, EcoSystem business, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.employeeOrganization = (EmployeeOrganization)organization;
        this.employeeEnterprise = enterprise;
        
        populateTable();
        populateEventRegistrationStatusTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(organization instanceof NGOAdminOrganization || organization instanceof HrOrganization){
                        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){                            
                            if(request instanceof EducationEventWorkRequest){
                                EducationEventWorkRequest req = (EducationEventWorkRequest) request;
                                if(req.getEnterpriseList().size()>0){
                                for(String enterpriseName : req.getEnterpriseList()){
                                    if(enterpriseName == employeeEnterprise.getName() ){                                  
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
    
    
    public void populateEventRegistrationStatusTable(){
        DefaultTableModel model = (DefaultTableModel)eventRegistrationStatusJTable.getModel();        
        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(organization instanceof EmployeeOrganization){
                        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
                            if(request.getSender() == userAccount){
                                ManagerApprovalWorkRequest req = (ManagerApprovalWorkRequest) request;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        detailsJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        eventRegistrationStatusJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        refreshJButton2 = new javax.swing.JButton();
        unregisterJButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/EmployeeRole/volunteer.png"))); // NOI18N
        jLabel1.setText("Employee Volunteer Portal");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        workRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Workshop Name", "NGO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 480, 92));

        detailsJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        detailsJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/EmployeeRole/details.png"))); // NOI18N
        detailsJButton.setText("View Details");
        detailsJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        detailsJButton.setBorderPainted(false);
        detailsJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        detailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsJButtonActionPerformed(evt);
            }
        });
        add(detailsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 130, 50));

        refreshJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/EmployeeRole/refresh.png"))); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        refreshJButton.setBorderPainted(false);
        refreshJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 130, 47));

        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        eventRegistrationStatusJTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eventRegistrationStatusJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Participant", "Workshop Name", "NGO", "Registration Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(eventRegistrationStatusJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 640, 480, 92));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/EmployeeRole/ent.png"))); // NOI18N
        jLabel2.setText("Event Registrations :");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/EmployeeRole/ngo.png"))); // NOI18N
        jLabel3.setText("NGO Event Table :");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        refreshJButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        refreshJButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/EmployeeRole/refresh.png"))); // NOI18N
        refreshJButton2.setText("Refresh");
        refreshJButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        refreshJButton2.setBorderPainted(false);
        refreshJButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        refreshJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButton2ActionPerformed(evt);
            }
        });
        add(refreshJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 740, 130, 50));

        unregisterJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        unregisterJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/EmployeeRole/dlink.png"))); // NOI18N
        unregisterJButton.setText("Unregister");
        unregisterJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        unregisterJButton.setBorderPainted(false);
        unregisterJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        unregisterJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unregisterJButtonActionPerformed(evt);
            }
        });
        add(unregisterJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 740, 130, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/background.jpg"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void detailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }

        EducationEventWorkRequest request = (EducationEventWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);

        //        request.setStatus("Processing");

        EmployeeEventRegistrationJPanel empEventRegistrationJPanel = new EmployeeEventRegistrationJPanel(userProcessContainer, request, userAccount, employeeOrganization, business);
        userProcessContainer.add("empEventRegistrationJPanel", empEventRegistrationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_detailsJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();        //        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void refreshJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButton2ActionPerformed
        populateEventRegistrationStatusTable();        // TODO add your handling code here:
    }//GEN-LAST:event_refreshJButton2ActionPerformed

    private void unregisterJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unregisterJButtonActionPerformed
        int selectedRow = eventRegistrationStatusJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }

        ManagerApprovalWorkRequest approvalRequest = (ManagerApprovalWorkRequest)eventRegistrationStatusJTable.getValueAt(selectedRow, 0);
        EducationEventWorkRequest ngoEvtReq = approvalRequest.getNgoEventReq();

        if(!(approvalRequest.getStatus().equals("Event Cancelled"))){
            ngoEvtReq.getEmployeeList().remove(userAccount.getEmployee());
            if(ngoEvtReq.getEmployeeWaitList().size() > 0)
            {
                Employee waitlistedEmp = ngoEvtReq.getEmployeeWaitList().get(0);
                ngoEvtReq.getEmployeeList().add(waitlistedEmp);
                for (Network network : business.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            if(organization instanceof EmployeeOrganization){
                                for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
                                    if(request.getSender().getEmployee() == waitlistedEmp){

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
        }
        else{
            JOptionPane.showMessageDialog(null, "Event Cancelled!");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_unregisterJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton detailsJButton;
    private javax.swing.JTable eventRegistrationStatusJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton refreshJButton2;
    private javax.swing.JButton unregisterJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
