package programmingassignment4_6_case3;

public class PersonWithJob {
	
	private double salary;
	private Person person;
	
	public PersonWithJob(Person person, double s) {
		this.salary = s;
		this.person = person;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Person getPerson() {
		return this.person;
	}
	
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof PersonWithJob))
			return false;
		
		PersonWithJob person1 = (PersonWithJob) obj;
		if (this.person.getName().equals(person1.person.getName()) && 
			this.person.getDateOfBirth().equals(person1.person.getDateOfBirth()) &&
			this.getSalary() == person1.getSalary()){
			System.out.println("They are the same person.");
			return true;
		}
		System.out.println("They are different person.");
		return false;
	}
}