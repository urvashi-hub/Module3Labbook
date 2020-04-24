package lab3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
	Sbu s =(Sbu)ctx.getBean("sbu");
	System.out.println("SBU details");
	System.out.println("------------------------");
	System.out.println("sbuCode="+s.getSbuCode()+" sbuName="+s.getSbuName()+" sbuHead="+s.getSbuHead());
	System.out.println("Employee details:-----------");
	System.out.println(s.getEmpList());
}
}

