

package myinterface;


public class SalaryPlusCommissionEmployee extends SalariedEmployee{
     private double commissionPercent;
    private double commissionedSale;
    
    public double commissionedPay(){
        return commissionedSale / (commissionPercent/ 100);
    }
    
}
