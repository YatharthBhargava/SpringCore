package com.bhargava.yatharth.SpringCore.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/bhargava/yatharth/SpringCore/ref/Refconfig.xml");
		Student student = (Student) context.getBean("Student");
		System.out.println(student.getScores().getPhysics());
	}

}
