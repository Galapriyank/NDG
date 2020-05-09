/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author Priyank
 */
public class ManagerApprovalWorkRequest extends WorkRequest {

    private ArrayList<Employee> employeeList;
    private String date;
    private EducationEventWorkRequest ngoEventReq;

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public EducationEventWorkRequest getNgoEventReq() {
        return ngoEventReq;
    }

    public void setNgoEventReq(EducationEventWorkRequest ngoEventReq) {
        this.ngoEventReq = ngoEventReq;
    }

    @Override
    public String toString() {
        String employeeName = getSender().getEmployee().getName();
        return employeeName + " ";
    }

}
