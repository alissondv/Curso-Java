package exercicio1;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program3 {
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height: ");
		Rectangle retangulo = new Rectangle();
		double largura = sc.nextDouble();
		retangulo.setWidth(largura);
		double altura = sc.nextDouble();
		retangulo.setHeight(altura);
		
		System.out.println(retangulo);
		
		sc.close();
		
	}

}
