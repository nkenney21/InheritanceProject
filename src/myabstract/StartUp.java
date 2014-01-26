

package myabstract;

/**
 *
 * @author neilkenney
 */
public class StartUp {
    public static void main(String[] args) {
        
        SalariedEmployee s1 = new SalariedEmployee();
        
        s1.setEmployeeName("Greg");
        s1.setDepartmentNumber(2);
        s1.setEmployeeIdNumber(1143);
        s1.setYearlySalary(50000);
        s1.setRetirementContribution(15);
        
        
        
        System.out.println("Employee: " + s1.getEmployeeName() + " ID: " + s1.getEmployeeIdNumber() + " Department" + s1.getDepartmentNumber() + " Weekly Pay: " + s1.getWeeklySalaryPay() + " Weekly Retirement Contribution: " + s1.calculateRetirementContribution());
    }
    
}
