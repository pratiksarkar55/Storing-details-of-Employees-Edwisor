
public  class Office_Details extends Employee implements Employee.Date,Employee.Location {

	protected Office_Details(long empID) {
		super(empID);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void office_location() {
		// TODO Auto-generated method stub
		System.out.println("Office location is Gurgaon");
	}

	@Override
	public void msg() {
		System.out.println("Office name is Edwisor");
		
	}

	@Override
	protected double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
