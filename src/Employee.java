
public abstract class Employee {
	 String name;
	protected String designation;
	protected double salary;
	protected final long empID;
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
