package models;

public class Employee {

    private Long id;
    private String name;
    private String ctps;
    private double revenue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    
    public double incrementRevenue(double revenue) {
        this.revenue = revenue;
        return this.revenue;
    }
    //ATIVADE 1
    public void decimoQuarto(double revenue) {
    	this.revenue = revenue;
    	System.out.println(this.revenue);
    }
}
