# Palavra this
*É uma referência para o próprio objeto
* Usos comuns:
    * Diferenciar atributos de variáveis locais
    * Passar o próprio objeto como argumento na chamada de um método ou construtor


## Diferenciar atributos de variáveis locais
>Product product = new Product("TV", 1500.0, 0);


~~~Javascript
public Product(String name, double price, int quantity) {
this.name = name;
this.price = price;
this.quantity = quantity;
}
~~~


(escopo do construtor)

| TV  | name |
| 1500.0  | price  |
| 10  | quantity  |


product -> | TV  | 1500.0 | 0 |
           | name  | price | quantity |
