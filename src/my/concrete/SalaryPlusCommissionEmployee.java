

package my.concrete;


public class SalaryPlusCommissionEmployee extends SalariedEmployee{
    
    public double commissionPercent;
    public double commissionedSale;
    
    public double commissionedPay(){
        return commissionedSale / (commissionPercent/ 100);
    }
    
}
