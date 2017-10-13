package Assignment_5;																						// Package Declared
class PermenantEmp extends Employee{																		// class PermenantEmp declared which have the properties of Employee class
	int paid_leave, sick_leave, casual_leave;																// Integer Variable declared
	double basic, hra,pfa;																					// double variable declared
	public PermenantEmp(int empId, String empName, double basic) {											// constructor declared
	this.empId=empId;																						// this keyword is used to distinguish between class and instance variables
	this.empName=empName;																					// this keyword is used to distinguish between class and instance variables
	this.basic = basic;																						// this keyword is used to distinguish between class and instance variables
	paid_leave=15;																							// value assigned to variables
	sick_leave=12;																							// value assigned to variables
	casual_leave=12;																						// value assigned to variables
	total_leaves=12;																						// value assigned to variables
	System.out.println("Employee ID                        : "+empId);										// Print Statement
    System.out.println("Employee Name                      : "+empName);									// Print Statement
    System.out.println("Employee Basic Salary              : "+basic);										// Print Statement

}
@Override																									// method overriding
	boolean avail_leave(int no_of_leaves, char type_of_leave) {											    // different type of leaves are set to each employee
		if (type_of_leave=='p'|| type_of_leave=='P'){														// Condition for paid leaves is set
			if(paid_leave-no_of_leaves>=0){
				total_leaves-=no_of_leaves;
				paid_leave-=no_of_leaves;
				System.out.println("Paid leaves taken by Employee      : "+no_of_leaves);
			return true;}
			else { System.out.println("You can't get Paid leave!! ");
			return false;}
		}
		else if(type_of_leave=='s'|| type_of_leave=='S'){													// Condition for sick leaves is set
		if(sick_leave-no_of_leaves>=0){
			total_leaves-=no_of_leaves;
			sick_leave-=no_of_leaves;
			System.out.println("Sick leaves taken by Employee      : "+no_of_leaves);
			return true;}
		else{ System.out.println("You can't get Sick leave!! ");
		return false;}
	}
	else if(type_of_leave=='c'|| type_of_leave=='C'){														// Condition for casual leaves is set
		if(casual_leave-no_of_leaves>=0){
			casual_leave-=no_of_leaves;
			total_leaves-=no_of_leaves;
			System.out.println("Casual leaves taken by Employee    : "+no_of_leaves);
			return true;}
		else{ System.out.println("You can't get Casual leave!! ");
		return false;}
	}
	System.out.println("You can't get leave!! ");
	return false;}
@Override																									// method overriding
void calculate_balance_leaves() {
	System.out.println("Total avialable leaves To Employee : "+(paid_leave+sick_leave+casual_leave));		// print statement with condition
	}
void print_leave_details(){																					// Method declared
	System.out.println("\nNumber of leaves left with "+this.empName 										// print statement
			+ " [Paid leave=" + paid_leave + ", "
					+ "Sick leave=" + sick_leave + ", "
							+ "Casual leave=" + casual_leave + "]");}
@Override																									// method overriding
void calculate_salary() {
	pfa = .12*basic;																						// calculate PFA
	hra = .5 *basic;																						// calculate HRA
	total_salary = basic + (.5 *basic)-(.12*basic);															// calculate TOTAL SALARY
	System.out.println("PFA component of Salary            : "+ pfa);										// print statement
	System.out.println("HRA component of Salary            : "+ hra);										// print statement
	System.out.println("---------------------------------------------");									// print statement
	System.out.println("Total salary of "+this.empName+ "'s is         : "+ total_salary);					// print statement	
	System.out.println("---------------------------------------------");}								    // print statement
}																											// class PermenantEmp closed