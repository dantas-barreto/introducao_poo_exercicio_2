package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = teclado.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = teclado.nextDouble();
		System.out.print("Tax: ");
		employee.tax = teclado.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		employee.increaseSalary(teclado.nextDouble());
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		teclado.close();
	}

}
