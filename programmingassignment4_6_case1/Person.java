package programmingassignment4_6_case1;

import java.util.GregorianCalendar;

public class Person {
	
	private String name;
	private GregorianCalendar dateOfBirth;
	
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}
	
	@Override
	public boolean equals(Object obj) {

		if(obj == null) return false; 
		if(!(obj instanceof Person)) return false;
		Person person1 = (Person) obj;
		if (this.getName().equals(person1.getName()) && 
			this.getDateOfBirth().equals(person1.getDateOfBirth())) {
			System.out.println("They are the same person.");
			return true;
		}
		System.out.println("They are different person.");
		return false;
	}
}