package programmingassignment4_1;

public class Professor extends DeptEmployee {
	
	private int numberOfPublications;
	
	public Professor(String name, double salary, int y, int m, int d, int numberOfPublications){
		super(name, salary, y, m, d);
		this.numberOfPublications = numberOfPublications;
	}
		
	
	public int getNumberOfPublications() {
		return numberOfPublications;
	}
	
	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
}