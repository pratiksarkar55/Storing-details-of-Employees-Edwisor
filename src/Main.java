
public class Main {
 public static void main(String args[]){
	 Manager m =new Manager(148);
	 m.setName("PRATIK SARKAR");
	 m.setDesignation("ANDROID DEVELOPER");
	 m.setSalary(25000);
	 m.Ratings(5);
	 System.out.println("Employee ID="+m.empID+" "+"NAME="+m.name+" "+"DESIGNATION="+m.getDesignation()+" "+"SALARY="+m.getSalary()+" "+"RATINGS="+m.Ratings(5));
 }
}
