package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployees;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Employee #" + i + " data: ");
			System.out.print("Outsourced Employee (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.println("---------------------------");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHours = sc.nextDouble();
			
			if (ch == 'y') {
			System.out.print("Additional Charge: ");
			double additionalCharge = sc.nextDouble();
		
			list.add(new OutsourcedEmployees(name, hours, valuePerHours, additionalCharge));
			
			} else {
				list.add( new Employee(name, hours, valuePerHours));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}

}
