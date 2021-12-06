package programmingassignment4_1;

public class Secretary extends DeptEmployee {
	
	private double overtimeHours;
	
	public Secretary(String name, double salary, int y, int m, int d, double overtimeHours){
		super(name, salary, y, m, d);
		this.overtimeHours = overtimeHours;
	}
		
	public double getOvertimeHours() {
		return overtimeHours;
	}
	
	public void setOvertimeHours(int overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	@Override
	public double computeSalary() {
		return super.computeSalary() + (overtimeHours * 12);
	}
}