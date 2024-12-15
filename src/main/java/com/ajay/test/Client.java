package com.ajay.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ajay.controller.MainController;
import com.ajay.vo.EmployeeVO;



public class Client {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/ajay/cfgs/applicationContext.xml");
	
	MainController controller=factory.getBean("empController",MainController.class);
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Employee name");
	String ename=sc.next();
	
	System.out.println("enter employee designation");
	String desg=sc.next();
	
	System.out.println("enter employee basicSalary");
	String bsalary=sc.next();
	
	EmployeeVO vo =new EmployeeVO();
	
	vo.setEname(ename);
	vo.setBasicSalary(bsalary);
	vo.setDesg(desg);
	
	// business method
	try {
		String result=controller.processEmployee(vo);
		System.out.println(result);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
	}

}
