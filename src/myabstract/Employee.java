/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author neilkenney
 */
public abstract class Employee {
    private int employeeIdNumber;
    private String employeeName;
    private int departmentNumber;
    

    public int getEmployeeIdNumber() {
        return employeeIdNumber;
    }

    public void setEmployeeIdNumber(int employeeIdNumber) {
        this.employeeIdNumber = employeeIdNumber;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }
    
    
    public abstract double calculateRetirementContribution();
    
}
