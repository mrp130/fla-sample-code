package main;

import state.Light;

public class Main {
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		Light li1 = new Light();
		
		System.out.println(li1);
		li1.switchLight();
		System.out.println(li1);
		li1.switchLight();
		System.out.println(li1);
		li1.switchLight();
		System.out.println(li1);
		li1.switchLight();
		System.out.println(li1);
	}
}
