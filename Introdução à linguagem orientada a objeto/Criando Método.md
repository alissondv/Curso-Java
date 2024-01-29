# Criando um método para obtermos os benefícios de reaproveitamento e delegação
## Discussão
**Com o uso de CLASSE, agora nós temos umavariável composta do tipo "Triangle" para representar cada triângulo:**


~~~Javascript
Triangle x, y;
x = new Triangle();
y = new Triangle();
~~~


Agora vamos melhorar nossa CLASSE,
acrescentando nela um MÉTODO para calcular a
área.


~~~Javascript
package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;
public class Program {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
Triangle x, y;
x = new Triangle();
y = new Triangle();
System.out.println("Enter the measures of triangle X: ");
x.a = sc.nextDouble();
x.b = sc.nextDouble();
x.c = sc.nextDouble();
System.out.println("Enter the measures of triangle Y: ");
y.a = sc.nextDouble();
y.b = sc.nextDouble();
y.c = sc.nextDouble();
double areaX = x.area();
double areaY = y.area();


package entities;
public class Triangle {
public double a;
public double b;
public double c;
public double area() {
double p = (a + b + c) / 2.0;
return Math.sqrt(p * (p - a) * (p - b) * (p - c));
}
}
~~~

## UML
| Triangulo | 
| ------------- | 
| - A double | 
| - B double|
| - C double| 
| ------------- |
| + Area(): double|


## Discussão

> Quais são os benefícios de se calcular a área de um triângulo por meio de um MÉTODO dentro da CLASSE Triangle?


1) Reaproveitamento de código: nós eliminamos o código repetido (cálculo das áreas dos triângulos x e y) no programa principal.


2) Delegação de responsabilidades: quem deve ser responsável por saber como calcular a área de um triângulo é o próprio triângulo. A lógica do cálculo da área não deve estar em outro lugar.