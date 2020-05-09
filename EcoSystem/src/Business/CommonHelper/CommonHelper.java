package Business.CommonHelper;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Apoorva
 */
public class CommonHelper {
    private static DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private static EcoSystem system = dB4OUtil.retrieveSystem();
    
    public static boolean checkUserIfExists(String username){
        for (UserAccount userAccount : system.getUserAccountDirectory().getUserAccountList()) {
            if(userAccount.getUsername().equals(username)){                        
                return false;
            }                        
        }
        
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if(userAccount.getUsername().equals(username)){
                        return false;
                    }                        
                }
            }
        }
        
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
                    for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()) {
                        if(userAccount.getUsername().equals(username)){                        
                            return false;
                        }
                    }
                }
                
            }
        }
        
        return true;
    }
    
    public static UserAccount checkUserIfExists(String username, String password){
        UserAccount account = null;
        
        //Sysadmin user
        for (UserAccount userAccount : system.getUserAccountDirectory().getUserAccountList()) {
            if(userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)){                
                return userAccount;
            }                        
        }
        
        //Enterprise admin user
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if(userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)){                        
                        return userAccount;
                    }
                }
            }
        }
        
        //Orgnization user (e.g. Doctor, Pharmacist, Insurance agent)
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
                    for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()) {
                        if(userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)){                        
                            return userAccount;
                        }
                    }
                }
                
            }
        }
        
        return account;
    }
}
