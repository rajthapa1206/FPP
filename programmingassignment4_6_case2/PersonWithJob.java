package programmingassignment4_6_case2;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	
	private double salary;
	PersonWithJob(String n, GregorianCalendar dob, double s) {
		super(n, dob);
		this.salary = s;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof PersonWithJob))
			return false;
		
		PersonWithJob person1 = (PersonWithJob) obj;
		if (this.getName().equals(person1.getName()) && 
			this.getDateOfBirth().equals(person1.getDateOfBirth()) &&
			this.getSalary() == person1.getSalary()){
			System.out.println("They are the same person.");
			return true;
		}
		System.out.println("They are different person.");
		return false;
	}
}