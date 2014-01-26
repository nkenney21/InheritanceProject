

package my.concrete;


public class HourlyEmployee extends Employee{
    
    private double hoursWorked;
    private double hourlyWage;
    
    
    public double getWeeklyPay(){
        return hoursWorked * hourlyWage;
    }
}
