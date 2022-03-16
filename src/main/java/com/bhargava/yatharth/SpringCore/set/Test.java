package com.bhargava.yatharth.SpringCore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/bhargava/yatharth/SpringCore/set/setconfig.xml");
		CarDealer carDealer = (CarDealer) ctx.getBean("CarDealer");
		
		System.out.println("Dealer name: " + carDealer.getName());
		System.out.println(carDealer.getModels());
		
	}

}
