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

    @Override
    public double calculateRetirementContribution() {
        return weeklyPay() * (retirementContributionPercent / 100  );
    }

    @Override
    public double weeklyPay() {
        return yearlySalary / 52;
    }
    
}
