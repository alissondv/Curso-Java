# Restrições para nomes de variáveis

* Não pode começar com dígito: use uma letra ou _
* Não usar acentos ou til
* Não pode ter espaço em branco
* Sugestão: use nomes que tenham um significado


> Errado:                             
> int 5minutes; 
> int salário;
> int salario do funcionario;

> Correto:
> int _5minutes;
> int salario;
> int salarioDoFuncionario;

## Convenções
Camel Case: lastName
* pacotes
* atributos
* métodos
* variáveis e parâmetros

Pascal Case: ProductService
* classes


~~~Javascript
package entities;
public class Account {
private String holder;
private Double balance;
public Account(String holder, Double balance) {
this.holder = holder;
this.balance = balance;
}
public String getHolder() {
return holder;
}
public void deposit(double amount) {
balance += amount;
}
public void withdraw(double amount) {
balance -= amount;
}
}
~~~