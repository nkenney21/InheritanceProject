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
public class SalariedEmployee extends Employee{
    
    private double yearlySalary;
    private double retirementContribution;
    
    public double getWeeklySalaryPay(){
        return yearlySalary / 52;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public void setRetirementContribution(double retirementContribution) {
        this.retirementContribution = retirementContribution;
    }

    @Override
    public double calculateRetirementContribution() {
        return getWeeklySalaryPay() * (retirementContribution/100);
    }
}
