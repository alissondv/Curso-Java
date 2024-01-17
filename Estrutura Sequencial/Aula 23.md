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
import java.util.Locale;
import java.util.Scanner;

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
import java.util.Locale;

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
import java.util.Locale;

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
import java.util.Locale;

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
