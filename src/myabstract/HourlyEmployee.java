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

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
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
