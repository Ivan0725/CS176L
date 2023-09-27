package week3;

public class Employee{
	private String name;
	private double salary;

	public Employee() {
		setName("Unknown");
		setSalary(0);

	}
	
	public String getName() {
		return name;	
}

	public void setName(String name) {
		this.name = name;
	}
	public double getSalary () {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void raiseSalary(double byPercent) {
		salary += (0.1*salary);
	}

public static void main(String[] args) {
		Employee employee;
		employee = new Employee();
		
		employee.setName("Ivan");
		employee.setSalary(50000);
		
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		employee.raiseSalary(10);
		System.out.println(employee.getSalary());
	}
}