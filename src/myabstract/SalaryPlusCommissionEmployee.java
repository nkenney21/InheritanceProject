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

    public double getCommissionPercent() {
        return commissionPercent;
    }

    public void setCommissionPercent(double commissionPercent) {
        this.commissionPercent = commissionPercent;
    }

    public double getCommissionedSale() {
        return commissionedSale;
    }

    public void setCommissionedSale(double commissionedSale) {
        this.commissionedSale = commissionedSale;
    }
    
    public double calculateCommissionedPay(){
        return commissionedSale / (commissionPercent/ 100);
    }
    
}
