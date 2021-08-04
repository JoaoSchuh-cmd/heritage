package models;

/**
 *
 * @author gefer
 */
public class Principal extends Employee {

    @Override
    public double incrementRevenue(double revenue) {
        revenue *= 1.04;
        return super.incrementRevenue(revenue);
    }
    @Override 
    public void decimoQuarto(double revenue) {
    	double incrementedRevenue = incrementRevenue(revenue) * 1.15;
    	super.decimoQuarto(incrementedRevenue);
    }

}
