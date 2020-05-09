/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.GroceryAdmin.getValue())){
            organization = new GroceryAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.NGOAdmin.getValue())){
            organization = new NGOAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.HR.getValue())){
            organization = new HrOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Employee.getValue())){
            organization = new EmployeeOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Manager.getValue())){
            organization = new ManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HOD.getValue())){
            organization = new HodOraganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.HospitalAdmin.getValue())){
            organization = new HospitalAdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public void deleteOrganization(Organization org){
        organizationList.remove(org);
    }
}