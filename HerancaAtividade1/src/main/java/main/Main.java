package main;

import models.*;

public class Main {

    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        clerk.decimoQuarto(2500);
        
        Manager manager = new Manager();
        manager.decimoQuarto(5000);
        
        Principal principal = new Principal();
        principal.decimoQuarto(25000);
    }
    
}
