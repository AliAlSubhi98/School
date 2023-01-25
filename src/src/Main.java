package src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Shop Name ");
		String shopName = sc.next();
		name = shopName;

		System.out.println("Enter Employee Name ");
		String empName = sc.next();
		emp.setName(empName);

		System.out.println("Enter Employee ID ");
		int empId = sc.nextInt();
		emp.setEmpId(empId);

		System.out.printf("%20s %20s \n","Employee Name","ID");
		System.out.printf("%20s %20s \n",emp.getName(),emp.getEmpId() );
	}
}
