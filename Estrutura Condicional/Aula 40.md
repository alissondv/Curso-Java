# Escopo e inicialização
## Checklist

* Escopo de uma variável: é a região do programa onde a variável é
* válida, ou seja, onde ela pode ser referenciada.
* Uma variável não pode ser usada se não for iniciada.
* Falaremos de escopo de métodos no Capítulo 5


## Demo
~~~Javascript
double price = sc.nextDouble();
if (price > 100.0) {
double discount = price * 0.1;
}
System.out.println(discount);
~~~
