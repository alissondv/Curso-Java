# Saída de dados em Java
## Para escrever na tela um texto qualquer
`System.out.print("Bom dia!");`

**Com quebra de linha ao final:**
`System.out.println("Bom dia!");`

~~~javascript
**Sem quebra de linha ao final:**
public class Main {

	public static void main(String[] args) {
		System.out.print("Bom dia!"); 
 }
}

**Com quebra de linha ao final:**
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bom dia!");
 }
}

~~~
## Para escrever o conteúdo de uma variável de algum tipo básico
>Suponha uma variável tipo int declarada e iniciada: int y = 32;

System.out.println(y);
