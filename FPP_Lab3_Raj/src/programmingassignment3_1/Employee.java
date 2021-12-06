package programmingassignment3_1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	
	private String name;
	private String nickName;
	private double salary;
	private final Date hireDay;
	 
	public Employee(String aName, String aNickName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		nickName = aNickName;
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
	}
	
	public String getName() {
		return name;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	public void setNickName(String aNickName) {
		nickName = aNickName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Date getHireDay() {
		return (Date)hireDay.clone();
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	private String format = "name = %s, salary = %.2f, hireDay = %s";
	
	public String toString() {
		return String.format(format, name, salary, Util.dateAsString(hireDay));
	}
}