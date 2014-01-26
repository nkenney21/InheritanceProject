

package my.concrete;


public class SalariedEmployee extends Employee{
    
    private double yearlySalary;
    
    public double getWeeklySalaryPay(){
        return yearlySalary / 52;
    }
    
}
