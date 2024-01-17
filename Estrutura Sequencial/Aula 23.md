# Scanner
## Para fazer entrada de dados, nós vamos criar um objeto do tipo "Scanner" da seguinte forma:

`Scanner sc = new Scanner(System.in);`


`import java.util.Scanner;`


**x = sc.next();**
~~~Javascript
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		System.out.printf("Você digitou:"+ x);
		sc.close();
 }
}

~~~

## Para ler um número inteiro
**x = sc.nextInt();**
~~~Javascript
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.printf("Você digitou:"+ x);
		sc.close();
 }
}
~~~

## Para ler um número com ponto flutuante
**x = sc.nextDouble();**
~~~Javascript
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.printf("Você digitou:"+ x);
		sc.close();
 }
}

~~~


