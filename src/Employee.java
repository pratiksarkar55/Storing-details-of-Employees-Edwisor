
public abstract class Employee {
	protected String name;
	protected String designation;
	protected double salary;
	protected final long empID;
	
	public Employee(long empID){
		this.empID=empID;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected abstract double getSalary();
	
	protected void setSalary(double salary) {
		this.salary = salary;
	}

	protected String getDesignation() {
		return designation;
	}

	protected void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
