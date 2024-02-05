#Tipos referência vs. tipos valor
## Classes são tipos referência
> Variáveis cujo tipo são classes não devem ser entendidas como caixas, mas sim “tentáculos” (ponteiros) para caixas
~~~Javascript
Product p1, p2;
p1 = new Product("TV", 900.00, 0);
p2 = p1;
~~~
`p2 = p1;`


`"p2 passa a apontar para onde`


`p1 aponta"`


## Valor "null"
> Tipos referência aceitam o valor "null", que indica que a variável aponta pra ninguém.
~~~Javascript 
Product p1, p2;
p1 = new Product("TV", 900.00, 0);
p2 = null;
~~~

**Tipos primitivos são tipos valor**
> Em Java, tipos primitivos são tipos valor. Tipos valor são CAIXAS e não ponteiros. 
~~~Javascript
double x, y;
x = 10;
y = x;
~~~


|Type | Containers |Default | Size |NA |
| ------------- | ------------- |------------- |------------- |------------- |
| boolean  | true or false| false|1 bit |NA |
| char  | unicode character|\u0000 |16 bit |\u0000 to \uffff |
| byte  | signed integer  |\u0000 |16 bit |\u0000 to \uffff |
| short  | signed integer  |\u0000 |16 bit |\u0000 to \uffff |
| int  | signed integer  |\u0000 |16 bit |\u0000 to \uffff |
| long  | signed integer  |\u0000 |16 bit |\u0000 to \uffff |
| float   | IEEE 754 floating point  |\u0000 |16 bit |\u0000 to \uffff |
| double  | IEEE 754 floating point   |\u0000 |16 bit |\u0000 to \uffff |


## Tipos primitivos e inicialização
**Demo**


~~~Javascript
int p;
System.out.println(p); // erro: variável não iniciada
p = 10;
System.out.println(p);
~~~


## Valores padrão
> [!NOTE]
> Quando alocamos (new) qualquer tipo estruturado (classe ou array), são atribuídos valores padrão aos seus elementos.

* números: 0
* boolean: false
* char: caractere código 0
* objeto: null


Product p = new Product();