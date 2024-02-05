# Vetores
## Checklist


* Revisão do conceito de vetor
* Declaração e instanciação
* Manipulação de vetor de elementos tipo valor (tipo primitivo)
* Manipulação de vetor de elementos tipo referência (classe)
* Acesso aos elementos
* Propriedade length

> [!VETORES]
> Em programação, "vetor" é o nome dado a arranjos unidimensionais.


**Arranjo (array) é uma estrutura de dados:**
    * Homogênea (dados do mesmo tipo)
    * Ordenada (elementos acessados por meio de posições)
    * Alocada de uma vez só, em um bloco contíguo de memória

**Vantagens:**
    * Acesso imediato aos elementos pela sua posição

**Desvantagens:**
* Tamanho fixo
* Dificuldade para se realizar inserções e deleções


## Problema exemplo 1
> Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.



| INPUT  | OUTPUT |
| ------------- | ------------- |
| 3  | AVERAGE HEIGHT = 1.69  |
| 1.72 |   |
| 1.56 |   |
| 1.80 |   |

~~~Javascript
package aula2;

import java.util.Scanner;

public class Aula04 {
	public static void main(String[] arg) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um tamanho para o vetor: ");
		int  n = sc.nextInt();
		double [] vect  = new double[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Digite o valor: ");
			vect[i] = sc.nextDouble();
		}
		
		double media = 0.0;
		for (int i=0;i<n;i++) {
			media += vect[i] ;
		}
		double svg = media/n;
		System.out.println("AVERAGE HEIGHT = 1.69" + svg);
	sc.close();
	 }
 }
 ~~~


 ## Problema exemplo 2
 > Fazer um programa para ler um número inteiro N e os dados (nome epreço) de N Produtos. Armazene os N produtos em um vetor. Em seguida,mostrar o preço médio dos produtos.


 Example
 
| INPUT  | OUTPUT |
| ------------- | ------------- |
| 3 | AVERAGE PRICE = 700.00  |
| TV  |   |
| 900.00 |   |
| Fryer  |   |
| 400.00  |   |
| Stove |   |
| 800.00  |   |


## langth
> Quantidade de elementos para um vetor
~~~Javascript
int [] vect  = new int[10];
for(int i=0 ; i< vect.length;i++){

}
~~~