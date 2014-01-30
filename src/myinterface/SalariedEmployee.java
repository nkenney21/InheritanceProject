/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author neilkenney
 */
public class SalariedEmployee implements Employee {
    private double yearlySalary;
    private String employeeName;
    private int employeeID;
    private int departmentNumber;
    private double retirementContributionPercent;

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public double getRetirementContributionPercent() {
        return retirementContributionPercent;
    }

    public void setRetirementContributionPercent(double retirementContributionPercent) {
        this.retirementContributionPercent = retirementContributionPercent;
    }

    @Override
    public double calculateRetirementContribution() {
        return weeklyPay() * (retirementContributionPercent / 100  );
    }

    @Override
    public double weeklyPay() {
        return yearlySalary / 52;
    }
    
}
