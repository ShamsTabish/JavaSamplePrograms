package fifthSession.inheritance.equalsExample;

import java.util.HashMap;

class Employee{
	int empId;
	public Employee(int id){
		empId=id;
	}
	@Override
	public boolean equals(Object obj) {// obj=empY
		
		Employee empY=(Employee)obj;//empY
		
		System.out.println("Id of Employee "+empY.empId);
		
		if(empId==empY.empId)//if(empX.empId==empY.empId)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Hashcode was called with empId="+empId);
		return empId; // Unique Code for an employee (Must be Integer)
	}
}

public class EqualsAndHashCode {

	public static void main(String[] args) {
		Employee empX=new Employee(1);
		Employee empY=new Employee(45);
		
		boolean areSame=empX.equals(empY);
		if(areSame){
			System.out.println("They are same");
		}else{
			System.out.println("Not same");
		}
		
		System.out.println("Employee Id of X "+empX.empId);
	}

}
