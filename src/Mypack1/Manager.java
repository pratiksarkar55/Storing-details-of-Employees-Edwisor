package Mypack1;

public  class Manager  extends Employee implements Employee.Date {
	
		// TODO Auto-generated constructor stub
	public Manager(long empID){
		super(empID);
		
	}
	private int rating;
	
	public double getSalary(){
		return salary;
	}
	public final int Ratings(int r){
		rating=r;
		return rating;
	}
	public final int Ratings(int r,String name){/** METHOD OVERLOADING         **/
		rating=r;
		return rating;
	}
	@Override
	public void msg() {
		System.out.println("Intial joining was given by Manager on 05/07/2017");
		
	}
	

	
	
	
	
}
