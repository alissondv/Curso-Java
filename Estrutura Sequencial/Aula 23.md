# Saída de dados em Java
## Para escrever na tela um texto qualquer

**Sem quebra de linha ao final:**
~~~javascript
			public class Main {
			
				public static void main(String[] args) {
					System.out.print("Bom dia!");
					System.out.print("Bom dia!"); 
			 }
			}

~~~
> CONSOLE: Bom diaBom dia


**Com quebra de linha ao final:**
~~~javascript
				public class Main {
				
					public static void main(String[] args) {
						System.out.println("Bom dia!");
						System.out.println("Bom dia!");
				 }
				}

~~~
> CONSOLE: Bom diaBom dia


## Para escrever o conteúdo de uma variável de algum tipo básico
>Suponha uma variável tipo int declarada e iniciada: int y = 32;


System.out.println(y);


~~~javascript
				public class Main {
				
					public static void main(String[] args) {
						int y=32;
						System.out.println(y);
				 }
				}

~~~


> CONSOLE: 32

## Para escrever o conteúdo de uma variável com ponto flutuante

**Suponha uma variável tipo double declarada e iniciada:**
**double x = 10.35784;**


~~~javascript
				public class Main {
				
					public static void main(String[] args) {
						double x = 10.35784;
						System.out.println(x);
						System.out.printf("%.2f%n", x);
						System.out.printf("%.4f%n", x);
						Locale.setDefault(Locale.US);
						System.out.printf("%.4f%n", x);;
				 }
				}
~~~

>CONSOLE:> 10.35784 10,36 10,3578 10.3578


## Para concatenar vários elementos em um mesmo comando de escrita

**Regra geral para print e println:**
> elemento1 + elemento2 + elemento3 + ... + elementoN


~~~javascript
				public class Main {
				
					public static void main(String[] args) {
						int x = 10;
						System.out.println("RESULTADO = " + x + " METROS");;
				 }
				}
~~~
> CONSOLE: RESULTADO = 10 METROS


## Para concatenar vários elementos em um mesmo comando de escrita
**Regra geral para printf:**

"TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2 

~~~javascript
				public class Main {
				
					public static void main(String[] args) {
						double x = 10.4789;
						System.out.printf("RESULTADO = %.2f metros%n", x);;
				 }
				}
~~~
> CONSOLE: RESULTADO = 10,48 metros

## Para concatenar vários elementos em um mesmo comando de escrita

**Regra geral para printf:**
`"TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2`
* %f = ponto flutuante
* %d = inteiro
* %s = texto
* %n = quebra de linha

# EXERCICIO
## 1. Em um novo programa, inicie as seguintes variáveis:


~~~javascript
				String product1 ="Computer";
				String product2 ="Office desk";
		
				int age = 30;
				int code = 5290;
				char gender = 'F';
				
				double price1 = 2100.0;
				double price2 = 650.50;
				double measure = 53.234567;
~~~
## Em seguida, usando os valores das variáveis, produza a seguinte saída na tela do console:
Products:


Computer, wich price is $2100,00


Office desk, wich price is $ 650,50


Record: 30 years old, code 5290 and gender: F 


Measue with eight decimal places: 53,23456700


Rouded (three decimal places): 53,235


US decimal point: 53.235

~~~javascript
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String product1 ="Computer";
		String product2 ="Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.23456700;
		System.out.printf("Products: %n Computer, wich price is $ %f %n Office desk, wich price is $ %f %n%n", price1, price2);
		System.out.printf("Record: %d years old, code $d and gender: %s %n%n",age,code,gender);
		System.out.printf("Measue with eight decimal places: %f %n Rouded (three decimal places): %.3f %n US decimal point: %.3f",measure,measure,measure);
		
 }
}
~~~~
> CONSOLE:

> Products:


> Computer, wich price is $ 2100,000000 

 
> Office desk, wich price is $ 650,500000 



> Record: 30 years old, code $d and gender: 5290 



> Measue with eight decimal places: 53,234567 

 
> Rouded (three decimal places): 53,235 

 
> US decimal point: 53,235
