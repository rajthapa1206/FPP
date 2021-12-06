package programmingassignment4_6_case2;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Raj", new GregorianCalendar(1990, 11, 06));
		Person p2 = new Person("Raj", new GregorianCalendar(1990, 11, 06));
		Person p21 = new Person("Raj", new GregorianCalendar(1990, 11, 07));
		PersonWithJob p3 = new PersonWithJob("Raj", new GregorianCalendar(1990, 11, 06), 70000);
		PersonWithJob p4 = new PersonWithJob("Raj", new GregorianCalendar(1990, 11, 06), 70000);
		PersonWithJob p41 = new PersonWithJob("Raj", new GregorianCalendar(1990, 11, 06), 80000);
		p1.equals(p2);
		p3.equals(p4);
		p1.equals(p21);
		p3.equals(p41);
	}
}