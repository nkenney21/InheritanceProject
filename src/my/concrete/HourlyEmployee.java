

package my.concrete;


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
    
    
    public double getWeeklyPay(){
        return hoursWorked * hourlyWage;
    }
}
