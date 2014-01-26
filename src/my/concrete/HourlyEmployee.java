

package my.concrete;


public class HourlyEmployee extends Employee{
    
    public double hoursWorked;
    public double hourlyWage;
    
    
    public double getWeeklyPay(){
        return hoursWorked * hourlyWage;
    }
}
