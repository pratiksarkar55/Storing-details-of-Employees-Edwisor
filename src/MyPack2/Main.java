package MyPack2;

import Mypack1.*;

public class Main extends Office_Details {
 public Main(long empID) {
		super(empID);
		// TODO Auto-generated constructor stub
	}

public static void main(String args[]){
	 Director m =new Director(148);
	
	 m.setName("PRATIK SARKAR");
	 m.setDesignation("ANDROID DEVELOPER");
	 m.setSalary(25000);
	 m.setPh_num(869745896);
	 m.Ratings(5);
	 System.out.println("Employee ID="+m.empID+" "+"NAME="+m.getName()+" "+"PHONE_NUM= "+m.getPh_num()+" DESIGNATION = "
	 +m.getDesignation()+" "+"SALARY="+m.getSalary()+" "+"LAST YEAR RATINGS="+m.Ratings(5));
	 
	 System.out.println("Employee ID="+m.empID+" "+"NAME="+m.getName()+" "+"PHONE_NUM= "+m.getPh_num()+" DESIGNATION = "
			 +m.getDesignation()+" "+"SALARY="+m.getSalary()+" "
			 +"THIS YEAR RATINGS="+m.Ratings(3,"PRATK SARKAR"));
	 Office_Details od = new Main(148);
	 od.office_location();
	 od.msg();
	 
	 
	 m.msg();
	 
 }
}
