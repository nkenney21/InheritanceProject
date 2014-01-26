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
public class SalaryPlusCommissionEmployee extends SalariedEmployee{
    private double commissionPercent;
    private double commissionedSale;
    
    public double commissionedPay(){
        return commissionedSale / (commissionPercent/ 100);
    }
    
}
