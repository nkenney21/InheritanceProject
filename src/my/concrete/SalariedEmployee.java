

package my.concrete;


public class SalariedEmployee extends Employee{
    
    public double yearlySalary;
    
    public double getWeeklySalaryPay(){
        return yearlySalary / 52;
    }
    
}
