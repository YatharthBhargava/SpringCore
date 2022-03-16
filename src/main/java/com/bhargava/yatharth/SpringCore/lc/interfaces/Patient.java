package com.bhargava.yatharth.SpringCore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{

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

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("In the init method");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("In the destroy method");
		
	}
}
