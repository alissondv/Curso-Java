package exercicio3;

import java.util.Scanner;

public class estruturaRepetitiva {
	
	public static void main(String[] args) {
		ex1lerSenhaAteSerValida();
		ex2lercordenadasRetornarQuadrantes();
		ex3lerTipoCombustivel();
	}

	/*
	 * Escreva um programa que repita a leitura de uma senha até que ela seja
	 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
	 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
	 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
	 * correta é o valor 2002.
	 */
	public static String ex1lerSenhaAteSerValida() {
		Scanner sc = new Scanner(System.in);
		String reulstado = "Acesso Permitido";
		int senha = sc.nextInt();
		while (senha != 2002) {
			System.out.println("Senha invalida");
			senha = sc.nextInt();
		}

		sc.close();
		return reulstado;
	}

	/*
	 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
	 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
	 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
	 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
	 * alguma).
	 */
	public static void ex2lercordenadasRetornarQuadrantes() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		String resul = "";
		while (x != 0 || y != 0) {
			if (x == 0 && y == 0) {
				resul = "Origem";
			} else if (x > 0 && y > 0) {
				resul = "Primeiro";
			} else if (x < 0 && y > 0) {
				resul = "Segundo";
			} else if (x < 0 && y < 0) {
				resul = "Terceiro";
			} else if (x > 0 && y < 0) {
				resul = "Quarto";
			}
		}

		sc.close();
	}

	/*
	 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
	 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
	 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
	 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
	 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
	 * será encerrado quando o código informado for o número 4. Deve ser escrito a
	 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
	 * tipo de combustível, conforme exemplo.
	 * 
	 */
	public static String ex3lerTipoCombustivel() {
		Scanner sc = new Scanner(System.in);
		int tipoCombustivel = 0;
		int clientesAlcool = 0;
		int clientesGasolina = 0;
		int clientesDiesel = 0;

		while (tipoCombustivel != 4) {
			tipoCombustivel = sc.nextInt();
			switch (tipoCombustivel) {
			case 1:
				clientesAlcool++;
			case 2:
				clientesGasolina++;
				break;
			case 3:
				clientesDiesel++;
			case 4:
				break;
			default:
				System.out.println("Código inválido. Digite um código válido (1 a 4):");
				continue;
			}
		}

		String resultado = String.format("MUITO OBRIGADO \nAlcool: %d\nGasolina: %d\nDiesel  %d", clientesAlcool,
				clientesGasolina, clientesDiesel);
		sc.close();
		return resultado;
	}

}
