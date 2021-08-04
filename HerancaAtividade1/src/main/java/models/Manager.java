package models;


public class Manager extends Employee {

    @Override
    public double incrementRevenue(double revenue) {
        revenue *= 1.08;
        return super.incrementRevenue(revenue);
    }
    @Override 
    public void decimoQuarto(double revenue) {
    	double incrementedRevenue = incrementRevenue(revenue) * 1.11;
    	super.decimoQuarto(incrementedRevenue);
    }
    
}
