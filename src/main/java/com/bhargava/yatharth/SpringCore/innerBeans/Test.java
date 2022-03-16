package com.bhargava.yatharth.SpringCore.innerBeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/bhargava/yatharth/SpringCore/innerBeans/config.xml");
		Employee employee = (Employee) context.getBean("emp");
		System.out.println(employee);
	}

}
