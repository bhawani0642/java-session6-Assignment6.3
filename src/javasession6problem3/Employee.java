package javasession6problem3;

public class Employee {
	
	String name;
	String department;
	Double salary;

	public Employee(String name, String department, Double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public static void main(String[] args) {
		Employee ram=new Employee("Ram", "IT", 25.0 );
		System.out.println("Name of employee= "+ram.name+"   Department of employee is= "+ram.department+"  Salary of employee is = " +ram.salary);
		ram.name="Sita";
		ram.department="Management";
		ram.salary=250.0;
		System.out.println("Name of employee= "+ram.name+"   Department of employee is= "+ram.department+"  Salary of employee is = " +ram.salary);
		
		
	}
	
	
	
}
