package models;

public class Clerk extends Employee {

    @Override
    public double incrementRevenue(double revenue) {
        revenue *= 1.10;
        return super.incrementRevenue(revenue);
    }
    @Override 
    public void decimoQuarto(double revenue) {
    	double incrementedRevenue = incrementRevenue(revenue) * 1.08;
    	super.decimoQuarto(incrementedRevenue);
    }

}
