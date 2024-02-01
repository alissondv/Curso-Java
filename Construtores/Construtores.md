# Construtor

* É uma operação especial da classe, que executa no momento da
instanciação do objeto
* Usos comuns:
* Iniciar valores dos atributos
* Permitir ou obrigar que o objeto receba dados / dependências no momento de sua
instanciação (injeção de dependência)
* Se um construtor customizado não for especificado, a classe disponibiliza o
construtor padrão:
Product p = new Product();
* É possível especificar mais de um construtor na mesma classe (sobrecarga)


## Problema exemplo
>Enter product data:
>Name: TV
>Price: 900.00
>Quantity in stock: 10
>Product data: TV, $ 900.00, 10 units, Total: $ 9000.00
>Enter the number of products to be added in stock: 5
>Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00
>Enter the number of products to be removed from stock: 3
>Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00


## Proposta de melhoria
Quando executamos o comando abaixo, instanciamos um produto "product" com
seus atributos “vazios”:


~~~Javascript
product = new Product();
~~~


**Entretanto, faz sentido um produto que não tem nome? Faz sentido um produto que não tem preço?**


>Com o intuito de evitar a existência de produtos sem nome e sem preço, é possível fazer com que seja “obrigatória” a iniciação desses valores?


~~~Javascript
package entities;
public class Product {
public String name;
public double price;
public int quantity;
public Product(String name, double price, int quantity) {
this.name = name;
this.price = price;
this.quantity = quantity;
}
~~~


~~~Javascript
System.out.println("Enter product data: ");
System.out.print("Name: ");
String name = sc.nextLine();
System.out.print("Price: ");
double price = sc.nextDouble();
System.out.print("Quantity in stock: ");
int quantity = sc.nextInt();
Product product = new Product(name, price, quantity);
~~~