
public class Manager extends Employee {
	
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
}
