package programmingassignment4_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 DeptEmployee p1 = new Professor("Sanji", 70000.00, 1995, 10, 29, 10);
		 DeptEmployee p2 = new Professor("Luffy", 90000.00, 1991, 11, 25, 10);
		 DeptEmployee p3 = new Professor("Zoro", 75000.00, 1993, 2, 15, 10);
		 DeptEmployee s1 = new Secretary("Ussop", 45000.00, 2001, 10, 2, 200);
		 DeptEmployee s2 = new Secretary("Brook", 55000.00, 2000, 1, 5, 200);
		 DeptEmployee[] department = new DeptEmployee[5]; 
		 department[0] = p1;
		 department[1] = p2; 
		 department[2] = p3; 
		 department[3] = s1; 
		 department[4] = s2; 
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("Do you wish to see the sum of all the salaries in the department? (Y/N)"); 
		 char input = sc.next().charAt(0); 
		 if (input == 'Y' || input == 'y') {
			 double totalSalary = 0.0;
			 for (DeptEmployee emp : department) {
				 totalSalary += emp.computeSalary();	 
			 }
			 System.out.println("The total salary of the department is: " + totalSalary);
		 } 
		 sc.close();
	}
}