# Sobrecarga
*    É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros.

## Proposta de melhoria
* Vamos criar um construtor opcional, o qual recebe apenas nome e preço do produto. A quantidade em estoque deste novo produto, por padrão, deverá então ser iniciada com o valor zero.

* Nota: é possível também incluir um construtor padrão

~~~Javascript
package entities;
public class Product {
public String name;
public double price;
public int quantity;
public Product() {
}
public Product(String name, double price, int quantity) {
this.name = name;
this.price = price;
this.quantity = quantity;
}
public Product(String name, double price) {
this.name = name;
this.price = price;
}
~~~