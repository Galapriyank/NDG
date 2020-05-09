/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;
    private Employee employee;

    public Employee getEmployee(int id) {
        for(Employee emp : getEmployeeList()){
            if(id == emp.getId())
                employee = emp;
        }
        return employee;
    }

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name, int managerId){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setManagerId(managerId);
        employeeList.add(employee);
        return employee;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    public void deleteEmployee(Employee employee){
        employeeList.remove(employee);
    }
}