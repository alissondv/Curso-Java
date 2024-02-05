# Desalocação de memória - garbage collector e escopo local
## Garbage collector
*  É um processo que automatiza o gerenciamento de memória de umprograma em execução

* O garbage collector monitora os objetos alocados dinamicamentepelo programa (no heap), desalocando aqueles que não estão mais sendo utilizados.


## Desalocação por garbage collector
~~~Javascript
Product p1, p2;
p1 = new Product("TV", 900.00, 0);
p2 = new Product("Mouse", 30.00, 0);
~~~


## Desalocação por escopo 
~~~Javascript
void method1() {
int x = 10;
if (x > 0) {
int y = 20;
}
System.out.println(x);
}
~~~


## Outro exemplo
~~~Javascript
void method1() {
Product p = method2();
System.out.println(p.Name);
}
Product method2() {
Product prod = new Product("TV", 900.0, 0);
return prod;
}
~~~
