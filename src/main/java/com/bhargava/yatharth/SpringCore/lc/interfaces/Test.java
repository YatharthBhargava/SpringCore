package com.bhargava.yatharth.SpringCore.lc.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/bhargava/yatharth/SpringCore/lc/interfaces/config.xml");
		Patient patient = (Patient) context.getBean("anything");
		System.out.println(patient.getId());
		context.registerShutdownHook();
	}

}
