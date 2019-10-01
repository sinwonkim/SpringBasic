package com.test.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Read the Spring configuration file [SpringConfig.xml]
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book =  (Book) appContext.getBean("book");
        book.sysoutTest();
	}

}
