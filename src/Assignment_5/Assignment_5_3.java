/**
* Create an class Employee with following properties and functions
* Properties:
* 	int empId
* 	String empName 
* 	int total_leaves 
* 	double total_salary
* 
* Methods:
* 	void calculate_balance_leaves();
* 	boolean	avail_leave(int no_of_leaves, char type_of_leave); 
* 	void calculate_salary();
* 
* Create two subclasses PermanentEmp and TemporaryEmp that extend Employee class with following
* properties and functions
* 
* PermanentEmp
* 
* Properties:
* 	int paid_leave, sick_leave, casual_leave
* 	double basic, hra,pfa
* Methods: 
* 	void print_leave_details() 
* 	override void calculate_balance_leaves() 
* 	override boolean avail_leave(int no_of_leaves,char type_of_leave) 
* 	override void calculate_salary()
* 
* TemporaryEmp
* 
* No new properties
* Methods: 
* 	override void calculate_balance_leaves() 
* 	override boolean avail_leave(int no_of_leaves, char type_of_leave)
* 	override void calculate_salary()
* 
* 6. Expected Output
* Write a program that will compute an Employee's salary and manage their leave details.
* Note:
* Pf = 12% of basic 
* hra= 50% of basic
* total_sal = basic + hra – pf
 */
package Assignment_5;																							// Package Declared
/**
 * Write a program that will compute an Employee's salary and manage their leave details.
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
public class Assignment_5_3 {																					// Class Declared
	public static void main(String[] args) {																	// Main method Started
		System.out.println("================================================================================"	// Print Statement
				  +"\n"+"                Gernal Guidelines for Leaves of All Employees"+"\n"					
				  +"================================================================================\n"
				  +"Paid Leaves : 15 Days || "
				  +"Casual Leaves : 12 Days || "
				  +"Sick Leaves  : 12 Days\n");
		System.out.println("================================================================================"	// Print Statement
						  +"\n"+"  			   Permenant Employee Details"+"\n"
						  +"================================================================================");
		PermenantEmp permenantEmp=new PermenantEmp(003, "Karan", 50000);										// new instance permenantEmp created and variable- empId, empName and basic assign a value		
		permenantEmp.calculate_salary();																		// object permenantEmp assigned a method calculate_salary()
		permenantEmp.calculate_balance_leaves();																// object permenantEmp assigned a method calculate_balance_leaves()
		permenantEmp.avail_leave(11, 'P');																		// object permenantEmp assigned a method avail_leave 
		permenantEmp.avail_leave(1, 's');																		// object permenantEmp assigned a method avail_leave
		permenantEmp.avail_leave(1, 'C');																		// object permenantEmp assigned a method avail_leave
		permenantEmp.print_leave_details();																		// object permenantEmp assigned a method print_leave_details()
		System.out.println("\n================================================================================" // Print statement
				  +"\n"+"  			   Temporary Employee Details"+"\n"
				  +"================================================================================");
		TemporaryEmp temporaryEmp = new TemporaryEmp(012, "Arjun", 20000);										// new instance temporaryEmp created and variable- empId, empName and basic assign a value
		temporaryEmp.calculate_salary();																		// object temporaryEmp assigned a method calculate_salary()
		temporaryEmp.avail_leave(5, 'p');																		// object permenantEmp assigned a method avail_leave
		temporaryEmp.avail_leave(5, 'S');																		// object permenantEmp assigned a method avail_leave
		temporaryEmp.avail_leave(5, 'c');																		// object permenantEmp assigned a method avail_leave
		temporaryEmp.calculate_balance_leaves();																// object temporaryEmp assigned a method calculate_balance_leaves()
	}																											// main method closed
}																												// class Assignment_5_3 closed
