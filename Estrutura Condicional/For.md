# Estrutura repetitiva "para" (for)
## Estrutura repetitiva "para"

>É uma estrutura de controle que
>repete um bloco de comandos
>para um certo intervalo de
>valores.

> [!NOTE]
> Quando usar: quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.


Por exemplo:

Fazer um programa que lê um valor
inteiro N e depois N números inteiros.
Ao final, mostra a soma dos N números
lidos


| Entrada  | Saída |
| ------------- | ------------- |
| 3  | 11  |
| 5  |   |
| 2  |  |
| 4  |   |

## Sintaxe / regra

~~~Javascript
for ( início ; condição ; incremento) {
comando 1
comando 2
}
~~~

> [!CAUTION]
> Perceba que a estrutura "para" é ótima para se fazer uma repetição baseada em uma CONTAGEM:

~~~Javascript
for (int i=0; i<5; i++) {
System.out.println("Valor de i: " + i);
}
~~~
> CONSOLE: 
>
>Valor de i: 0
>
>
>Valor de i: 1
>
>
>Valor de i: 2
>
>
>Valor de i: 3
>
>
>Valor de i: 4

## Contagem regressiva

~~~Javascript
for (int i=4; i>=0; i--) {
System.out.println("Valor de i: " + i);
}
~~~

> CONSOLE: 
>
>
>Valor de i: 4
>
>
>Valor de i: 3
>
>
>Valor de i: 2
>
>
>Valor de i: 1
>
>
>Valor de i: 0