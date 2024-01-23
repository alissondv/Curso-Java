# Criando uma classe com três atributos para representar melhor o triângulo
## Discussão

Triângulo é uma entidade com três
atributos: a, b, c.


Estamos usando três variáveis distintas
para representar cada triângulo:


`double aX, bX, cX, aY, bY, cY;` 


Para melhorar isso, vamos usar uma
CLASSE para representar um triângulo.


## Classe

* É um tipo estruturado que pode conter (membros):
    * Atributos (dados / campos)
    * Métodos (funções / operações)


* A classe também pode prover muitos outros recursos, tais como:
    * Construtores
    * Sobrecarga
    * Encapsulamento
    * Herança
    * Polimorfismo


* Exemplos:
    * Entidades: Produto, Cliente, Triangulo
    * Serviços: ProdutoService, ClienteService, EmailService, StorageService
    * Controladores: ProdutoController, ClienteController
    * Utilitários: Calculadora, Compactador
    * Outros (views, repositórios, gerenciadores, etc.)


~~~Javascript
package entities;
public class Triangle {
public double a;
public double b;
public double c;
}
~~~


`double aX, bX, cX, aY, bY, cY;`


~~~Javascript
Triangle x, y;
x = new Triangle();
y = new Triangle();
~~~