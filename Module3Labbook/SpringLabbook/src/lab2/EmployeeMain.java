package lab2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		Employee emp =(Employee)ctx.getBean("em");
		emp.EmployeeDetails();
	}
}
