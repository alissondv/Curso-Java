package exercicio2;

import java.util.Scanner;

public class estruturaCondicional {
	public static void main(String[] args) {
		ex1verificarNumeroNegativo();
		ex2verificarNumeroParImpar();
		ex3lerDoisValoresVerificarMultiplosOuNao();
		ex4lerHoraInicialFinalJogoClcularDuracao();
		ex5lerCodigoDeItemQuantidadeCalcularCalorPagar();
		ex6lerValorMostrarIntervalo();
		ex7lerDoisValoresRepresentamCoordenadas();
		ex8lerValorSalarioCalculeValorPagarComImposto();
	}

	/*
	 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
	 * negativo ou não
	 */
	public static String ex1verificarNumeroNegativo() {
		Scanner sc1 = new Scanner(System.in);

		int numero = sc1.nextInt();
		String resultado = "";

		if (numero < 0) {
			resultado = "NEGATIVO";
		} else {
			resultado = "NAO NEGATIVO";
		}

		sc1.close();
		return resultado;
	}

	/*
	 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
	 * ímpar.
	 */
	public static String ex2verificarNumeroParImpar() {
		Scanner sc1 = new Scanner(System.in);

		int numero = sc1.nextInt();
		String resultado = "";

		if (numero % 2 == 0) {
			resultado = "PAR";
		} else {
			resultado = "IMPAR";
		}

		sc1.close();
		return resultado;
	}

	/*
	 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
	 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
	 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
	 * crescente ou decrescente.
	 */
	public static String ex3lerDoisValoresVerificarMultiplosOuNao() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String resultado = "";

		if (a % b == 0 || b % a == 0) {
			resultado = "Sao Multiplos";
		} else {
			resultado = "Nao sao Multiplos";
		}

		sc.close();
		return resultado;
	}

	/*
	 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
	 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
	 * uma duração mínima de 1 hora e máxima de 24 horas.
	 */
	public static String ex4lerHoraInicialFinalJogoClcularDuracao() {
		Scanner sc = new Scanner(System.in);
		int inicioJogo = sc.nextInt();
		int finalJogo = sc.nextInt();
		int calculDuracao = 0;

		if (inicioJogo > finalJogo) {
			calculDuracao = (inicioJogo - 24) + finalJogo;
		} else {
			calculDuracao = finalJogo - inicioJogo;
		}

		if (inicioJogo == finalJogo) {
			calculDuracao = 24;
		}
		String result = "O JOGO DUROU " + calculDuracao + " HORA(S) = ";
		sc.close();
		return result;
	}

	/*
	 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
	 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
	 */
	public static String ex5lerCodigoDeItemQuantidadeCalcularCalorPagar() {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int quantidadeItem = sc.nextInt();
		double valorPagar = sc.nextDouble();

		switch (numero) {
		case 1:
			valorPagar = quantidadeItem * 4.00;
		case 2:
			valorPagar = quantidadeItem * 4.50;
			break;
		case 3:
			valorPagar = quantidadeItem * 5.00;
		case 4:
			valorPagar = quantidadeItem * 2.00;
		case 5:
			valorPagar = quantidadeItem * 1.50;
			break;
		}

		String resul = "Total: R$ " + valorPagar;
		sc.close();
		return resul;
	}

	/*
	 * Você deve fazer um programa que leia um valor qualquer e apresente uma
	 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
	 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
	 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
	 */
	public static String ex6lerValorMostrarIntervalo() {
		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();
		String resul = "Fora de intervalo";

		if (valor >= 0 && valor <= 25) {
			resul = "Intervalo  (0,50]";
		} else if (valor <= 50) {
			resul = "Intervalo  (25,50]";
		} else if (valor <= 75) {
			resul = "Intervalo  (50,75]";
		} else if (valor <= 100) {
			resul = "Intervalo  (75,100]";
		}

		sc.close();
		return resul;

	}

	/*
	 * Leia 2 valores com uma casa decimal (x e y), que devem representar as
	 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
	 * qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
	 * (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o
	 * ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
	 * situação.
	 */
	public static String ex7lerDoisValoresRepresentamCoordenadas() {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		String resul = "Fora de intervalo";

		if (x == 0 && y == 0) {
			resul = "Origem";
		} else if (x > 0 && y > 0) {
			resul = "Q1";
		} else if (x < 0 && y > 0) {
			resul = "Q2";
		} else if (x < 0 && y < 0) {
			resul = "Q3";
		} else if (x > 0 && y < 0) {
			resul = "Q4";
		}

		sc.close();
		return resul;
	}

	/*
	 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa
	 * de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de
	 * Imposto de Renda, segundo a tabela abaixo. Lembre que, se o salário for R$
	 * 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
	 * salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No
	 * exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$
	 * 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas
	 * casas decimais.
	 */
	public static String ex8lerValorSalarioCalculeValorPagarComImposto() {
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		double salarioImposto = salario;

		if (salario <= 3000) {
			salarioImposto = salario - (salario * 8) / 100;
		} else if (salario <= 4500) {
			salarioImposto = salario - (salario * 18) / 100;
		} else {
			salarioImposto = salario - (salario * 28) / 100;
		}

		String resultado = salarioImposto >= 0 && salarioImposto <= 2000 ? "Isento" : "R$ " + salarioImposto;
		sc.close();
		return resultado;
	}

}
