# Variáveis e tipos primitivos em Java
## Visão geral
* Um programa de computador em execução lida com dados
* • Como esses dados são armazenados?
* Em **VARIÁVEIS!**

## Variáveis
** Definição informal:**
Em programação, uma variável é uma porção de memória (RAM) utilizada para armazenar
dados durante a execução dos programas.

# Declaração de variáveis
**Sintaxe:**

` <tipo> <nome> = <valor inicial>; `

Exemplos:

  int idade = 25;

  double altura = 1.68;

  char sexo = 'F';

**Uma variável possui:**
Nome (ou identificador)
* Tipo
* Valor
* Endereço

## Tipos primitivos em Java

| DESCRIÇÃO     |     TIPO         | VALOR |
| ------------- | ------------- |----------|
| tipos numéricos inteiros | byte|     8 bits    |
| tipos numéricos inteiros | short| 16 bits         |
| tipos numéricos inteiros | int   |   32 bits     |
| tipos numéricos inteiros | long   |   64 bits   |
| tipos numéricos com ponto flutuante | float  | 32 bits   |
| tipos numéricos com ponto flutuante | double | 64 bits    |
| um caractere Unicode | char          |     16 bits     |
| valor verdade | boolean          |        1 bit     |

# Cada bit = 2 possibilidades
> Um bit pode armazenar 2 valores possíveis (0 ou 1)
> 8 bits:
> 2 x 2 x 2 x 2 x 2 x 2 x 2 x 2 = 28 = 256 possibilidades

## Nomes de variáveis
Não pode começar com dígito: use uma letra ou _
* Não pode ter espaço em branco
* Não usar acentos ou til
* Sugestão: use o padrão "camel case"

**Errado:**                             **Correto:**

int 5minutos;                           int _5minutos;

int salário;                            int salario;

int salário do funcionario;             int salarioDoFuncionario;
