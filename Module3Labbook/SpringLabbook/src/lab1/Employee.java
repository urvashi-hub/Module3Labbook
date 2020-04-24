package lab1;

public class Employee {
private int id;
private String name;
private double salary;
private String bu;
private int age;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getBu() {
	return bu;
}
public void setBu(String bu) {
	this.bu = bu;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void EmployeeDetails() {
	System.out.println("Employee details");
	System.out.println("---------------------------");
	System.out.println("Employee ID : "+id);
	System.out.println("Employee Name : "+name);
	System.out.println("Employee Salary : "+salary);
	System.out.println("Employee BU : "+bu);
	System.out.println("Employee Age : "+age);
}

}
