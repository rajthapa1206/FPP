package programmingassignment4_6_case1;

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
	
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof PersonWithJob))
			return false;
		
		PersonWithJob person1 = (PersonWithJob) o;
		if (this.getName().equals(person1.getName()) && 
			this.getDateOfBirth().equals(person1.getDateOfBirth())) {
			System.out.println("They are the same person.");
			return true;
		}
		System.out.println("They are different person.");
		return false;
	}

}