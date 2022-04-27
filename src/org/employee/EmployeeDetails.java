package org.employee;

public class EmployeeDetails {
	
private void employeeId() {
		
		System.out.println("Employee id is : 123");
	}
	
	private void employeeMobile() {
		
		System.out.println("Employee modile:8939278836");
	}
	
	private void empStatus() {
		System.out.println("Working");
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails e = new EmployeeDetails();
		
		e.employeeId();
		e.employeeMobile();
	}

}
