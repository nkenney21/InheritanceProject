

package myinterface;


public class SalaryPlusCommissionEmployee extends SalariedEmployee{
     private double commissionPercent;
    private double commissionedSale;
    
    public double calculateCommissionedPay(){
        return commissionedSale / (commissionPercent/ 100);
    }

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
    
}
