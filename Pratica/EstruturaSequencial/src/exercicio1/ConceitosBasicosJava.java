package exercicio1;

import java.util.Scanner;

public class ConceitosBasicosJava {

	public static void main(String[] args) {
		ex1lerESomarDoisValores();
		ex2lerRaioDeUmCirculoMostrarAreaComQuatroCasasDecimais();
		ex3lerTresValoresInteirosCalcularADiferencaDoProduto();
		ex4lerNumeroFuncionarioHorasTrabalhadasValorQueRecebePorHoraCalcularSalario();
		ex5lerCodigoDePeçaNumeroPeçasValorUnitarioMostrarValorASerPago();
		ex6lerTresValoresDoubleCalcularEMostrar();
	}

	/*
	 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
	 * soma desses números com uma mensagem explicativa, conforme exemplos.
	 */

	public static String ex1lerESomarDoisValores() {
		Scanner sc1 = new Scanner(System.in);

		int valor1 = sc1.nextInt();

		int valor2 = sc1.nextInt();

		int soma = valor1 + valor2;
		String result = "SOMA = " + soma;

		sc1.close();
		return result;
	}

	/*
	 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
	 * valor da área deste círculo com quatro casas decimais conforme exemplos.
	 * Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
	 */
	public static String ex2lerRaioDeUmCirculoMostrarAreaComQuatroCasasDecimais() {
		Scanner sc1 = new Scanner(System.in);

		double raio = sc1.nextDouble();
		double area = 3.14159 * (raio * raio);
		String result = "A = " + area;
		sc1.close();

		return result;

	}

	/*
	 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
	 * calcule e mostre a diferença do produto de A e B pelo produto de C e D
	 * segundo a fórmula: DIFERENCA = (A * B - C * D).
	 */
	public static String ex3lerTresValoresInteirosCalcularADiferencaDoProduto() {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();

		double diferenca = a * (b - c) * d;
		String result = "DIFERENCA = " + diferenca;
		sc.close();
		return result;
	}

	/*
	 * Fazer um programa que leia o número de um funcionário, seu número de horas
	 * trabalhadas, o valor que recebe por hora e calcula o salário desse
	 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
	 * casas decimais.
	 */
	public static String ex4lerNumeroFuncionarioHorasTrabalhadasValorQueRecebePorHoraCalcularSalario() {
		Scanner sc = new Scanner(System.in);

		int numeroFunc = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		double valorHora = sc.nextDouble();

		double salario = horasTrabalhadas * valorHora;
		String resultado = String.format("NUMBER = %d\nSALARY = U$ %.2f", numeroFunc, salario);

		sc.close();
		return resultado;
	}

	/*
	 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
	 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
	 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
	 */
	public static String ex5lerCodigoDePeçaNumeroPeçasValorUnitarioMostrarValorASerPago() {
		Scanner sc = new Scanner(System.in);

		int codigoPeça1 = sc.nextInt();
		int numeroPeças1 = sc.nextInt();
		double valorUnitario1 = sc.nextDouble();

		int codigoPeça2 = sc.nextInt();
		int numeroPeças2 = sc.nextInt();
		double valorUnitario2 = sc.nextDouble();

		double valorASerPagoPeça1 = numeroPeças1 * valorUnitario1;
		double valorASerPagoPeça2 = numeroPeças2 * valorUnitario2;

		double valorTotal = valorASerPagoPeça1 + valorASerPagoPeça2;
		String result = "VALOR A PAGAR:  = " + valorTotal;

		sc.close();
		return result;
	}

	/*
	 * Fazer um programa que leia três valores com ponto flutuante de dupla
	 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
	 * retângulo que tem A por base e C por altura. b) a área do círculo de raio
	 * C.(pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por
	 * altura. d) a área do quadrado que tem lado B. e) a área do retângulo que tem
	 * lados A e B.
	 * 
	 */
	 public static String ex6lerTresValoresDoubleCalcularEMostrar() {
	        Scanner sc = new Scanner(System.in);

	        double a = sc.nextDouble();
	        double b = sc.nextDouble();
	        double c = sc.nextDouble();

	        double areaTriangulo = (a * c) / 2.0;
	        double areaCirculo = 3.14159 * c * c;
	        double areaTrapezio = ((a + b) * c) / 2.0;
	        double areaQuadrado = b * b;
	        double areaRetangulo = a * b;

	        String resultado = String.format("TRIANGULO = %.2f\nCIRCULO = %.2f\nTRAPEZIO = %.2f\nQUADRADO = %.2f\nRETANGULO = %.2f",
	                areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

	        sc.close();
	        return resultado;
	    }
}
