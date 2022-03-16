package com.bhargava.yatharth.SpringCore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/bhargava/yatharth/SpringCore/list/listconfig.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");
		
		System.out.println("Hospital name: " + hospital.getName());
		System.out.println(hospital.getDepartments());
		
	}

}
