/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author Hardik
 */
public class PrescriptionDetailsWorkRequest extends WorkRequest{
    String ngoName;
    String campName;
    String date;
    String childName;
    int childAge;
    String presDetails;

    public String getNgoName() {
        return ngoName;
    }

    public void setNgoName(String ngoName) {
        this.ngoName = ngoName;
    }

    public String getCampName() {
        return campName;
    }

    public void setCampName(String campName) {
        this.campName = campName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public int getChildAge() {
        return childAge;
    }

    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }

    public String getPresDetails() {
        return presDetails;
    }

    public void setPresDetails(String presDetails) {
        this.presDetails = presDetails;
    }
    
    @Override
    public String toString() {
        return ngoName+" ";
    }
    
}
