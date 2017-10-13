package Assignment_5;																			// Package Declared
public class TemporaryEmp extends Employee{														// class TemporaryEmp declared which have the properties of Employee class
	public TemporaryEmp(int empId, String empName, double total_salary) {						// Constructor declared
		this.empId=empId;																		// this keyword is used to distinguish between class and instance variables
		this.empName=empName;																	// this keyword is used to distinguish between class and instance variables
		this.total_salary=total_salary;															// this keyword is used to distinguish between class and instance variables
		this.total_leaves=39;	}																// this keyword is used to distinguish between class and instance variables
@Override																						// Method overriding
	void calculate_balance_leaves() {															
		System.out.println("Number of leaves left with "+this.empName+" : "+total_leaves);}		// Print Statement
@Override																						// method overriding
	boolean avail_leave(int no_of_leaves, char type_of_leave) {									
		if (no_of_leaves<=total_leaves){														// if loop to find no of leaves
			total_leaves-=no_of_leaves;
			return true;
		}
		return false;
	}
@Override																						// Method overriding
	void calculate_salary() {
		double total_sal = total_salary + (.5 *total_salary)-(.12*total_salary);				// calculate total salary
		System.out.println("Total salary of "+this.empName+ "'s is       : "+ total_sal);       // Print Statement
	}
} 																								// class TemporaryEmp closed
