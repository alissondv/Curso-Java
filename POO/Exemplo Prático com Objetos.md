# Exemplo Prático com Objetos

**IMPLEMENTAÇÃO DE CONTA DE BANCO**
>Você tem duas pessoas Jubileu e Cleusa
>
> Jubileu tem 300 reais e abriu uma conta poupança
>
>
>
> Cleusa tem 500 e abriu uma conta corrente
>   Saca 100 reais 
>

Classe
    public numConta: String
    protected tipo: String
    private dono: String
    private saldo: float
    private status 
    public Conta()
    public abrirConta()
    public fecharConta()
    public depositar()
    public sacar()
    public pagarMensal()

construtor
    nova conta status = false
    saldo = 0

 numConta: cc (corrente) cp (pupança)
 
 ao abrir a conta = status == true
    dizer qual conta é
    se for corrente ja ganha 50
    se for poupança ganha  150

 ao fechar a conta = status == false
    nao pode ter saldo
    nao pode ter debito

Depositar
    precisa estar aberta

Sacar
    precisa estar aberta
    precisa ter o saldo

pagar Mensalidade
    cobra do saldo
    conta corrente paga 12 reais
    conta poupança paga 20 reais
