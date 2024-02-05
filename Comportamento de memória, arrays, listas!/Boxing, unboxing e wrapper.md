# Boxing, unboxing e wrapper classes
## Boxing
> É o processo de conversão de um objeto tipo valor para um objeto tipo referência compatíve
~~~Javascript
int x = 20;
Object obj = x;
~~~

## Unboxing
> É o processo de conversão de um objeto tipo referência para um objeto tipo valor compatível
~~~Javascript 
int x = 20;
Object obj = x;
int y = (int) obj;
~~~

## int y = (int) obj;
>São classes equivalentes aos tipos primitivos
	* Boxing e unboxing é natural na linguagem
	* Uso comum: campos de entidades em sistemas de informação (IMPORTANTE II)
		* Pois tipos referência (classes) aceitam valor null e usufruem dos recursos OO
		
## Demo
~~~Javascript
Integer x = 10;
int y = x * 2;
~~~


~~~Javascript
public class Product {
public String name;
public Double price;
public Integer quantity;
}
~~~

| First Header  | Second Header |
| ------------- | ------------- |
| Boolean  | boolean  |
| Character  | char  |
| Byte  | byte  |
| Short  | short  |
| Integer  | int  |
| Long  | long  |
| Float  | float  |
| Double  | double  |