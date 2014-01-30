

package my.concrete;


public class SalariedEmployee extends Employee{

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
    
    private double yearlySalary;
    
    public double getWeeklySalaryPay(){
        return yearlySalary / 52;
    }
    
}
