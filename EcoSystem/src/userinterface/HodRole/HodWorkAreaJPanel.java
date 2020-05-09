/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HodRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.EmployeeOrganization;
import Business.Organization.HospitalAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthEventWorkRequest;
import Business.WorkQueue.HodApprovalWorkRequest;
import Business.WorkQueue.ManagerApprovalWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Priyank
 */
public class HodWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HodWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    EcoSystem business;
    Enterprise enterprise;
    
    public HodWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise,  EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.business = business;
        this.enterprise = enterprise;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(organization instanceof DoctorOrganization){
                        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
                            if(request.getStatus().equals("Pending with HoD")){
                                HodApprovalWorkRequest req = (HodApprovalWorkRequest)request;
                                if(request.getReceiver() == account){
                                    Object[] row = new Object[3];
                                    row[0] = req;
                                    row[1] = req.getNgoEventReq().getDate();
                                    row[2] = req.getNgoEventReq().getDuration();
                                    model.addRow(row);
                                }
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
        jLabel1 = new javax.swing.JLabel();
        refreshJButton = new javax.swing.JButton();
        approvedJButton = new javax.swing.JButton();
        rejectedJButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee", "Date", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 428, 152));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/HodRole/volunteer.png"))); // NOI18N
        jLabel1.setText("Team Volunteering Activity Request");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        refreshJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/HodRole/refresh.png"))); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        refreshJButton.setBorderPainted(false);
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 110, 41));

        approvedJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        approvedJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/HodRole/accept.png"))); // NOI18N
        approvedJButton.setText("Approve");
        approvedJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        approvedJButton.setBorderPainted(false);
        approvedJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvedJButtonActionPerformed(evt);
            }
        });
        add(approvedJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 550, 120, 41));

        rejectedJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rejectedJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/HodRole/reject.png"))); // NOI18N
        rejectedJButton.setText("Reject");
        rejectedJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rejectedJButton.setBorderPainted(false);
        rejectedJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectedJButtonActionPerformed(evt);
            }
        });
        add(rejectedJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, 120, 41));

        Background.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/background.jpg"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1270, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void approvedJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }

        HodApprovalWorkRequest request = (HodApprovalWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        HealthEventWorkRequest ngoEventReq = request.getNgoEventReq();
        if(ngoEventReq.getDoctorList().size() < Integer.parseInt(ngoEventReq.getDoctorRequired())){
            request.setStatus("Registered");
            UserAccount senderOfrequest = request.getSender();
            Employee senderEmp = senderOfrequest.getEmployee();
            ngoEventReq.getDoctorList().add(senderEmp);
            senderOfrequest.getWorkQueue().getWorkRequestList().add(ngoEventReq);;
        }
        else{
            request.setStatus("Waitlisted");
            UserAccount senderOfrequest = request.getSender();
            Employee senderEmp = senderOfrequest.getEmployee();
            ngoEventReq.getDoctorWaitList().add(senderEmp);
        }

        JOptionPane.showMessageDialog(null, "Approved!");

        populateTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_approvedJButtonActionPerformed

    private void rejectedJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectedJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select row from table");
            return;
        }

        HodApprovalWorkRequest request = (HodApprovalWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        //
        request.setStatus("Rejected");

        JOptionPane.showMessageDialog(null, "Rejected!");

        populateTable();
    }//GEN-LAST:event_rejectedJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton approvedJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton rejectedJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}