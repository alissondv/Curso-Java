package exercicio4;

import java.util.Scanner;

public class exercicioFor {
	
	public static void main(String[] args) {
		ex1lerValorInteiroMostrarImpares();
		ex2lerInteirosRetornarNOIntervalo();
		ex3lerInteiroCasoTesteRetornarmedia();
		ex4lerNumeroRetornarDivisaoDePares();
		ex5lerValorRetornarFatorial();
		ex6lerNumeroCalcularDivisores();
		ex7lerNumeroInteiroRetornarnumeroDaLinhaQuadradoECuboDoValor();
	}

	/*
	 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
	 * até X, um valor por linha, inclusive o X, se for o caso.
	 */
	public static void ex1lerValorInteiroMostrarImpares() {
		Scanner sc = new Scanner(System.in);
		int limite = sc.nextInt();

		for (int i = 0; i <= limite; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

	/*
	 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
	 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
	 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
	 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
	 * "out" para fora do intervalo)
	 */
	public static String ex2lerInteirosRetornarNOIntervalo() {
		Scanner sc = new Scanner(System.in);
		int limite = sc.nextInt();
		int dentro = 0;
		int fora = 0;

		for (int i = 0; i < limite; i++) {
			int numero = sc.nextInt();
			if (numero >= 10 && numero <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		sc.close();
		String resultado = dentro + "in" + fora + "out";
		return resultado;
	}

	/*
	 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
	 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
	 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
	 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
	 * o terceiro valor tem peso 5.
	 */
	public static String ex3lerInteiroCasoTesteRetornarmedia() {
		Scanner sc = new Scanner(System.in);
		int casosTesteQtd = sc.nextInt();
		double mediaTotal = 0;

		for (int i = 0; i < casosTesteQtd; i++) {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();

			double media = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10.0;
			mediaTotal += media;
		}
		sc.close();

		double mediaFinal = mediaTotal / casosTesteQtd;
		String resultado = String.format("Média ponderada total: %.1f", mediaFinal);
		return resultado;
	}

	/*
	 * Fazer um programa para ler um número N. Depois leia N pares de números e
	 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
	 * mostrar a mensagem "divisao impossivel".
	 */
	public static void ex4lerNumeroRetornarDivisaoDePares() {
		Scanner sc = new Scanner(System.in);
		int numeros = sc.nextInt();
		for (int i = 0; i < numeros; i++) {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			if (valor2 == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.println(valor1 / valor2);
			}
		}
		sc.close();
	}

	/*
	 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
	 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
	 * de 0 é 1.
	 */
	public static long ex5lerValorRetornarFatorial() {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		long fatorial = 1;

		for (int i = numero; i > 1; i--) {
			fatorial *= i;
		}

		sc.close();
		return fatorial;
	}

	/*
	 * Ler um número inteiro N e calcular todos os seus divisores.
	 */
	public static void ex6lerNumeroCalcularDivisores() {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i--) {
			if (numero % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

	/*
	 * Fazer um programa para ler um número inteiro positivo N. O programa deve
	 * então mostrar na tela N linhas, começando de 1 até N. Para cada linha,
	 * mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
	 * exemplo.
	 */
	public static void ex7lerNumeroInteiroRetornarnumeroDaLinhaQuadradoECuboDoValor() {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		for (int i = 1; i <= numero; i++) {
			int quadrado = i * i;
			int cubo = quadrado * i;
			System.out.println(i + " " + quadrado + " " + cubo);
		}

		sc.close();
	}

}
