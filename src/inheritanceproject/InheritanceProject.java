/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritanceproject;

import my.concrete.HourlyEmployee;

/**
 *
 * @author neilkenney
 */
public class InheritanceProject {

    
    public static void main(String[] args) {
        
        HourlyEmployee p1 = new HourlyEmployee();
        
        p1.employeeIdNumber = (123);
        p1.departmentNumber = (1);
        p1.employeeName = "Greg";
        p1.hourlyWage = (15);
        p1.hoursWorked = (40);
        
        System.out.println(p1.getWeeklyPay());
    }
    
}
