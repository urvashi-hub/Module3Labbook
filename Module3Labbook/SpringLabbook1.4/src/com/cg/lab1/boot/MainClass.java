package com.cg.lab1.boot;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.lab1.bean.Employee;
import com.cg.lab1.bean.SBU;

public class MainClass {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Bean.xml") ;
		SBU sbu = (SBU)ctx.getBean("sbu") ;
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter Employee ID");
		int id = sc.nextInt();
		sc.close();
		
		Employee e = sbu.getEmployeeById(id) ;
		if(e == null) {
			System.out.println("No Employee Found");
		}
		else {
			System.out.println(e);
		}

	}

}
