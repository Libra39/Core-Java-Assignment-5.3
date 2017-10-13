/**
 * 
 */
package Assignment_5;														// Package Declared
abstract class Employee {													// Abstract class Employee declared 
	int empId;																// Integers variable declared 
	String empName;															// String variable declared 
	int total_leaves;														// Integers variable declared 
	double total_salary;													// Double variable declared
	abstract void calculate_balance_leaves();								// Abstract method created
	abstract boolean avail_leave(int no_of_leaves, char type_of_leave);		// Abstract method created
	abstract void calculate_salary();										// Abstract method created			
}
