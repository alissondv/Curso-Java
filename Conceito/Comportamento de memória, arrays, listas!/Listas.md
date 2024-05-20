# Listas
* Lista é uma estrutura de dados:
	* Homogênea (dados do mesmo tipo)
	* Ordenada (elementos acessados por meio de posições)
	* Inicia vazia, e seus elementos são alocados sob demanda
	* Cada elemento ocupa um "nó" (ou nodo) da lista


*Tipo (interface): List
	* Classes que implementam: ArrayList, LinkedList, etc.


*Vantagens:
	* Tamanho variável
	* Facilidade para se realizar inserções e deleções


* Desvantagens:
	* Acesso sequencial aos elementos *


# Sintaxe
**LIST**<tipo> nome = new **CLASSE QUE IMPLEMENTA A INTERFACE**();


List<String> list = new ArrayList<>();

~~~Javascript
List<String> list = new ArrayList<>();

list.add("Alisson") // Adicionar elemento na lista;
list.add(2,"Alisson") // Adicionar elemento em uma posição específica da lista;
lista.size() // ver tamaanho da lista
lista.remove("Alisson") /* remover apartir da comparação */ lista.remove(1) // remover elemento de uma opção
lista.removeIF(x -> x.charAt(0) == 'M' ) //remove por predicado
list.indexOf("Alisson") //Buscar dentro da lista
~~~

# Deixar na lista somente quem tem o nome começa com M
List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

# Encontrar o primeiro elemento que começa com a letra A
String name = list.stream().filter( x - > x.charAt(0) == 'A').findFirst().orElse(null);