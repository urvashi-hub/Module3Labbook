package lab2;

public class Employee {
private int id;
private String name;
private double salary;
private Sbu sbu;
private int age;

public Sbu getSbu() {
	return sbu;
}
public void setSbu(Sbu sbu) {
	this.sbu = sbu;
}
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", age=" + age + ", sbu details=" + sbu + "]";
}
public void EmployeeDetails() {
	System.out.println("Employee details");
	System.out.println("---------------------------");
	System.out.println(toString());
	
}

}
