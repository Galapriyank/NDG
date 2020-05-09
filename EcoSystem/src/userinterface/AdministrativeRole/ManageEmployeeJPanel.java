/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Organization.DoctorOrganization;
import Business.Organization.EmployeeOrganization;
import Business.Organization.HodOraganization;
import Business.Organization.HrOrganization;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.runtime.JSONFunctions;

/**
 *
 * @author Hardik
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;

        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();

        //organizationEmpJComboBox.add(this);
//System.out.println(""+organizationEmpJComboBox.getName());
    }

    public void populateOrganizationComboBox() {
        organizationJComboBox.removeAllItems();
        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    public void populateOrganizationEmpComboBox() {
        organizationEmpJComboBox.removeAllItems();
        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationEmpJComboBox.addItem(organization);
        }
    }

    private void populateTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            Object[] row = new Object[2];
            row[0] = employee;
            row[1] = employee.getName();
            model.addRow(row);
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
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Heading = new javax.swing.JLabel();
        deleteJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        managerIdJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        managerNameJButton = new javax.swing.JButton();
        managerNameJTextField = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 550, 92));

        addJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/addemp.png"))); // NOI18N
        addJButton.setText("Create");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 670, 140, 40));

        organizationJComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 370, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/view.png"))); // NOI18N
        jLabel1.setText("View Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 150, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/usrname.png"))); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 630, 100, 30));

        nameJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 630, 160, 30));

        organizationEmpJComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select an Organization" }));
        organizationEmpJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationEmpJComboBoxActionPerformed(evt);
            }
        });
        add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, 160, 30));

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/back.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 720, 140, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/orgusr.png"))); // NOI18N
        jLabel3.setText("Organization");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, 140, 40));

        Heading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Heading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/admin.png"))); // NOI18N
        Heading.setText("Manage Employee");
        Heading.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Heading.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(Heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 230, -1));

        deleteJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/delete.png"))); // NOI18N
        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });
        add(deleteJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, 140, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/id.png"))); // NOI18N
        jLabel5.setText("Manager Id :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 680, -1, -1));

        managerIdJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(managerIdJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 680, 160, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/manager.png"))); // NOI18N
        jLabel7.setText("Manager Name :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 730, -1, -1));

        managerNameJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        managerNameJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/AdministrativeRole/link.png"))); // NOI18N
        managerNameJButton.setText("Link Manager");
        managerNameJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        managerNameJButton.setBorderPainted(false);
        managerNameJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerNameJButtonActionPerformed(evt);
            }
        });
        add(managerNameJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 140, 40));

        managerNameJTextField.setEditable(false);
        managerNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(managerNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 730, 160, 30));

        Background.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SystemAdminWorkArea/background.jpg"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1280, 950));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        Pattern pattern = Pattern.compile(new String("^[a-zA-Z\\s]*$"));
        String name = nameJTextField.getText();
        Matcher matcher = pattern.matcher(name);

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No field should be blank");
            nameJTextField.setText("");
            return;
        } else if (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Employee name should contain only alphabets!!");
            nameJTextField.setText("");
            return;
        }
        int managerId;
        if (managerIdJTextField.getText().equals("")) {
            managerId = 0;
            managerNameJTextField.setText("null");
        } else {
            managerId = Integer.parseInt(managerIdJTextField.getText());
        }

        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        if (organization instanceof DoctorOrganization || organization instanceof EmployeeOrganization || organization instanceof HrOrganization) {
            if (managerIdJTextField.getText().isEmpty() || managerIdJTextField.getText() == null || managerNameJTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Selecting a Manager is mandatory");
                return;
            } else {
                organization.getEmployeeDirectory().createEmployee(name, managerId);
                populateTable(organization);
                nameJTextField.setText("");
                managerIdJTextField.setText("");
                managerNameJTextField.setText("");
                JOptionPane.showMessageDialog(null, "Employee " + name + " created successfully!!!");

            }

        } else {

            organization.getEmployeeDirectory().createEmployee(name, managerId);
            populateTable(organization);
            nameJTextField.setText("");
            managerIdJTextField.setText("");
            managerNameJTextField.setText("");
            JOptionPane.showMessageDialog(null, "Employee " + name + " created successfully!!!");
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = organizationJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        Employee emp = (Employee) organizationJTable.getValueAt(selectedRow, 0);
        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        organization.getEmployeeDirectory().deleteEmployee(emp);
        populateTable(organization);
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void managerNameJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerNameJButtonActionPerformed
        Employee manager = new Employee();
        Employee hod = new Employee();

        int managerId = Integer.parseInt(managerIdJTextField.getText());

        for (Organization organization : organizationDir.getOrganizationList()) {
            if (organization instanceof ManagerOrganization) {
                manager = organization.getEmployeeDirectory().getEmployee(managerId);
                managerNameJTextField.setText(manager.getName());
            }
            if (organization instanceof HodOraganization) {

                hod = organization.getEmployeeDirectory().getEmployee(managerId);
                managerNameJTextField.setText(hod.getName());
            }
        }
    }//GEN-LAST:event_managerNameJButtonActionPerformed

    private void organizationEmpJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationEmpJComboBoxActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        if (organization != null) {
            String orgValue = organization.toString();
            if ((orgValue.equalsIgnoreCase("HR Organization")) || (orgValue.equalsIgnoreCase("Employee Organization")) || (orgValue.equalsIgnoreCase("Doctor Organization"))) {
                managerIdJTextField.setEnabled(true);
                managerNameJButton.setEnabled(true);
                managerNameJTextField.setEnabled(true);
                managerIdJTextField.setEditable(true);
                managerNameJTextField.setEditable(true);

            } else {
                managerIdJTextField.setEnabled(false);
                managerNameJButton.setEnabled(false);
                managerNameJTextField.setEnabled(false);
            }
        }
    }//GEN-LAST:event_organizationEmpJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Heading;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField managerIdJTextField;
    private javax.swing.JButton managerNameJButton;
    private javax.swing.JTextField managerNameJTextField;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}