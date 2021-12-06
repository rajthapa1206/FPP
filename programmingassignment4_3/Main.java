package programmingassignment4_3;

import java.util.Scanner;

public class Main {
	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[1].createNewRetirement(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);
		// for phase I – console output
		Scanner sc = new Scanner(System.in);
		System.out.println("A. See a report of all accounts.");
		System.out.println("B. Make a deposit.");
		System.out.println("C. Make a withdrawal.");
		System.out.print("Make a selection (A/B/C):");
		String answer = sc.next();
		switch(answer) {
			case "A":
			case "a":
				String info = getFormattedAccountInfo();
				System.out.println(info);
				break;
			case "B":
			case "b":
				int i = 0;
				for (Employee emp : emps) {
					System.out.println(i + "." + emp.getName());
					
					i++;
				}
				System.out.println("Select an employee: (type a number)");
				int index = sc.nextInt();
				MyStringList accountNames = emps[index].getNamesOfAccounts();
				for (int j = 0; j < accountNames.size(); j++) {
					System.out.println(j + ". " + accountNames.get(j));
				}
				System.out.println("Select an account: (type a number)");
				int actNo = sc.nextInt();
				System.out.println("Deposit amount:");
				double amt = sc.nextDouble();
				emps[index].deposit(actNo, amt);
				break;
			case "C":
			case "c":
				int k = 0;
				for (Employee emp : emps) {
					System.out.println(k + "." + emp.getName());
					k++;
				}
				System.out.println("Select an employee: (type a number)");
				int l = sc.nextInt();
				MyStringList accountNamesI = emps[l].getNamesOfAccounts();
				for (int j = 0; j < accountNamesI.size(); j++) {
					System.out.println(j + ". " + accountNamesI.get(j));
				}
				System.out.println("Select an account: (type a number)");
				int actNoI = sc.nextInt();
				System.out.println("Withdraw amount:");
				double amtI = sc.nextDouble();
				emps[l].withdraw(actNoI, amtI);
				break;
		}
		sc.close();
	}
	
	String getFormattedAccountInfo() {
		String formattedAccountInf = "";		
		for(Employee tempEmp : emps) {
			formattedAccountInf += tempEmp.getFormattedAcctInfo() + "\n\n";
		}		
		return formattedAccountInf;
	}
}