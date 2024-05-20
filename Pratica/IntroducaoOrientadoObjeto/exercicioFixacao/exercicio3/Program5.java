package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		String nome = sc.nextLine();
		aluno.setNome(nome);
		
		double nota1 = sc.nextDouble();
		aluno.setNota1(nota1);
		double nota2 = sc.nextDouble();
		aluno.setNota2(nota2);
		double nota3 = sc.nextDouble();
		aluno.setNota3(nota3);
		
		System.out.println(aluno);
		
		sc.close();

	}

}
