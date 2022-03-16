package com.bhargava.yatharth.SpringCore.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/bhargava/yatharth/SpringCore/dependencycheck/config.xml");
		Prescription prescription = (Prescription) context.getBean("prescription");
		System.out.println(prescription);
		
	}

}
