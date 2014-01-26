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
public class HourlyEmployee extends Employee{
    private double hoursWorked;
    private double hourlyWage;
    private double retirementContribution;
    
    
    public double getWeeklyPay(){
        return hoursWorked * hourlyWage;
    }
  
    @Override
    public double calculateRetirementContribution(){
        return getWeeklyPay() * (retirementContribution/100);
    };

    
    public void setRetirementContribution(double retirementContribution) {
        this.retirementContribution = retirementContribution;
    }
    
}
