# Fila


Estrutura linear na qual a inserção e remoção de itens segue o principios FIFO


Os objetos podem ser inseridos a qualquer momento, mas apenas o objeto que está ha mais tempo na fila pode ser removido


Elementos somente são inseridos em um lado da lista, o final, e somente podem ser excluiodos do outro lado, o inicio da lista


Cada nó contem um ponteiro para os dados e um ponteiro de ligação 



**Operações**

enqueue(): Insere item ao final da fila
dequeue: Rita e retorna o elemento que está no inicio da fila
peek(): Retorna um elemento da fila
size(): tamanho da fila
isEmpty: Se estiver vazia
isFull(): Se estiver cheia
