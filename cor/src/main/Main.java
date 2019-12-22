package main;

import ejector.*;

public class Main {
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		Ejector ej = new Ejector100(new Ejector50(new Ejector20(new Ejector5())));
		
		System.out.println(ej.isWithdrawable(62));
		System.out.println(ej.isWithdrawable(362));
		System.out.println(ej.isWithdrawable(365));
	}
}
