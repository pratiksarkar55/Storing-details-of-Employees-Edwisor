package Mypack1;

public abstract class Employee {
	 String name;
	protected String designation;
	protected double salary;
	public final long empID;
	private long ph_num;
	
	protected interface Date{
		void msg();
	}
	protected interface Location{
		void office_location();
	}
	
	
	public long getPh_num() {
		return ph_num;
	}

	public void setPh_num(long ph_num) {
		this.ph_num = ph_num;
	}

	public Employee(long empID){
		this.empID=empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected abstract double getSalary();
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
