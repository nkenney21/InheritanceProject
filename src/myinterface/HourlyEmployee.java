

package myinterface;


public class HourlyEmployee implements Employee {
    
    private double hoursWorked;
    private double hourlyWage;
    private String employeeName;
    private int employeeID;
    private int departmentNumber;
    private double retirementContributionPercent;
    
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

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }
  

    @Override
    public double calculateRetirementContribution() {
       return calculateWeeklyPay() * (retirementContributionPercent / 100  );
    }

    @Override
    public double calculateWeeklyPay() {
        return hoursWorked * hourlyWage;
    }
    
}
