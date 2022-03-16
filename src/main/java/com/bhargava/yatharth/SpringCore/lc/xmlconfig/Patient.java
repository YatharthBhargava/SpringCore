package com.bhargava.yatharth.SpringCore.lc.xmlconfig;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void hi() {
		System.out.println("We are inside the init method!");
	}
	
	public void bye() {
		System.out.println("We are inside the destroy method!");
	}
}
