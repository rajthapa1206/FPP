package programmingassignment4_1;

import java.time.LocalDate;

	public class DeptEmployee {
		
		private String name;
		private LocalDate hireDate;
		private double salary;
	
		public DeptEmployee(String name, double salary, int y, int m, int d) {
			this.name = name;
			this.salary = salary;
			hireDate = LocalDate.of(y,m,d);
		}
	
		public String getName() {
			return name;
		}
	
		public LocalDate hireDate() {
			return hireDate;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setHireDate(int y, int m, int d) {
			hireDate = LocalDate.of(y,m,d);
		}
		
		public double computeSalary() {
			return this.salary;
		}
}