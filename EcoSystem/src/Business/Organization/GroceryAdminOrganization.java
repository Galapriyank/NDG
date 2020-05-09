/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GroceryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Apoorva
 */
public class GroceryAdminOrganization extends Organization{
    
    public GroceryAdminOrganization() {
        super(Organization.Type.GroceryAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GroceryRole());
        return roles;
    }
}
