# Expressões lógicas
| Operador  | Significado |
| ------------- | ------------- |
| &&  | E  |
|  \| \| | OU  |
|  !  | NÃO  |

## Ideia por trás do operador "E"
> [!NOTE]
> Todas condiçõesdevem ser verdadeiras!


**Exemplos de expressões lógicas**


(suponha x igual a 5)

>X <= 20 && X == 10 FALSE
>
>
>X > 0 && X != 3 TRUE 
>
>
>X <= 20 && X == 10 && X != 3 FALSE


## Ideia por trás do operador "OU"
> [!NOTE]
> Pelo menos uma condição deve ser verdadeira!


(suponha x igual a 5)

> X == 10 || X <= 20 TRUE
>
>
> X > 0 || X != 3 TRUE 
>
>
> X <= 0 || X != 3 || X != 5 TRUE

## Ideia por trás do operador "NÃO"
> [!NOTE]
> O operador "NÃO" inverte a condição

(suponha x igual a 5)

> !(X == 10) TRUE 
>
> !(X >= 2) FALSE


