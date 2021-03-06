/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGORole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GroceryDistributionEventRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ProcessGroceryDistributionRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private GroceryDistributionEventRequest request;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem business;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public  ProcessGroceryDistributionRequestJPanel(JPanel userProcessContainer, GroceryDistributionEventRequest request, UserAccount userAccount, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.account = account;
        this.enterprise = enterprise;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        Heading = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setLayout(null);

        submitJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/LabAssistantRole/submit.png"))); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(640, 510, 120, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/LabAssistantRole/result.png"))); // NOI18N
        jLabel1.setText("Result");
        add(jLabel1);
        jLabel1.setBounds(510, 430, 110, 40);

        resultJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(resultJTextField);
        resultJTextField.setBounds(650, 430, 120, 40);

        Heading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Heading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/admin.png"))); // NOI18N
        Heading.setText("Process Panel");
        Heading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Heading.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(Heading);
        Heading.setBounds(550, 280, 170, 97);

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/back.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(500, 510, 120, 50);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/background.jpg"))); // NOI18N
        add(Background);
        Background.setBounds(0, 0, 1260, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        request.setResult(resultJTextField.getText());
        request.setStatus("Completed");
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        Component[] comps = userProcessContainer.getComponents();
        for(Component c : comps){
            if (c instanceof NGOWorkAreaJPanel){
                NGOWorkAreaJPanel ngoPanel = (NGOWorkAreaJPanel) c;
                ngoPanel.populateTable();
            }   
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Heading;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
