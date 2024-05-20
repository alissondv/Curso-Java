package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee funcionario = new Employee();
		
		System.out.println("Name: ");
		String nome = sc.nextLine();
		funcionario.setName(nome);
		
		System.out.println("Gross salary: ");
		double grossSalary = sc.nextDouble();
		funcionario.setGrossSalary(grossSalary);
		
		System.out.println("Tax: ");
		double tax = sc.nextDouble();
		funcionario.setTax(tax);
		
		System.out.println(funcionario);
		System.out.println("");
		System.out.println("Wich percentage to increase salary?");
		double increaseSalary = sc.nextDouble();
		funcionario.increadeSalary(increaseSalary);
		System.out.println("Updated data: "+funcionario);
		sc.close();

	}

}
