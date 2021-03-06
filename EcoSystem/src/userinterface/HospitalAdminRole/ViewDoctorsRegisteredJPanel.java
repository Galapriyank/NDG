/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import static Business.Organization.Organization.Type.Doctor;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthEventWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hardik
 */
public class ViewDoctorsRegisteredJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDoctorsRegisteredJPanel
     */
    JPanel userProcessContainer;
    HealthEventWorkRequest request;
    
    Enterprise enterprise;
    
    public ViewDoctorsRegisteredJPanel(JPanel userProcessContainer, HealthEventWorkRequest request, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.enterprise =enterprise;
        populateApprovedTable();
        
    }
    
    public void populateApprovedTable(){
        DefaultTableModel model = (DefaultTableModel)approvedEmployeeJTable.getModel();
        
        model.setRowCount(0);
        
        for(Employee emp : request.getDoctorList()){
            if(request.getEnterpriseList().size()>0){
                for(String enterpriseName : request.getEnterpriseList()){
                    if(enterpriseName == enterprise.getName() ){                                  

                        Object[] row = new Object[1];
                        row[0] = emp;
                        
                        model.addRow(row);
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
        approvedEmployeeJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backJButton3 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        approvedEmployeeJTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        approvedEmployeeJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Approved Doctors"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(approvedEmployeeJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, 195));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/HospitalAdminRole/DRB.png"))); // NOI18N
        jLabel1.setText("Registrated Doctor's Approval Status");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        backJButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backJButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/HospitalAdminRole/back.png"))); // NOI18N
        backJButton3.setText("Back");
        backJButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton3.setBorderPainted(false);
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });
        add(backJButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 590, 108, 40));

        Background.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/background.jpg"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTable approvedEmployeeJTable;
    private javax.swing.JButton backJButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
