package models;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Weapon {
	public ArrayList<String> attachment = new ArrayList();

	public Weapon() {
		String answer;
		answer = JOptionPane.showInputDialog("Do you want acessories on your weapon? \n"
				      					   + "[1] Supressor \n"
										   + "[2] Scope \n"
										   + "[3] Supressor & Scope \n"
										   + "[4] No, thanks.");
		Supressor supressor = new Supressor();
		Scope scope = new Scope();
		switch (answer) {
			case "1":
				supressor.addSupressor();
			break;
			case "2": 
				scope.addScope();
			break;
			case "3":
				supressor.addSupressor();
				scope.addScope();
			break;
			case "4":
				attachment.add("None");
			break;	
	}
	}
}
