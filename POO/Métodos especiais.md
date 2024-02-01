# Métodos especiais
> Dão acessos

**Get = Pega**

**Set = Coloca**


| Caneta | 
| ------------- | 
| + modelo  | 
| - ponta  | 
| 
| ------------- | 
| + getModelo() | 
| + setModelo(modelo) | 
| + getPonta() | 
| + setPonta(ponta) | 



Classe Caneta
    publico modelo: Caractere
    privado ponta: Real
    publico Metodo getModelo()

    FimMetodo
    publico Metodo setModelo
        (m: Caractere)

FimClasse


**construct = executa tarefa sem precisar ser feita a chamada**

Metodo construtor(m:caractere, c:caractere, p:real)
    setModelo(m);
    setCor(c);
    setPonta(p);
    tampar();
fimMetodo

FimClasse
c1 = nova Caneta (ja estara tampada)
c1 = nova Caneta("Bic", "Azul", 0.5 ) (passando parametro para o construtor)