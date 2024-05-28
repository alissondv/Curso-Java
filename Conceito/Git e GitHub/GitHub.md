# GitHub
## É um serviço online de hospedagem de repositórios Git remotos.
**GIT - é um sistema de versionamento: você controla as modificações de um projeto por meio de versões chamadas "commits".** 

* Possui uma interface gráfica web: github.com
* É uma plataforma social (usuários, página de perfil, seguidores, colaboração, etc.). Dica: currículo!• Maior serviço do mundo de hospedagem de projetos de código aberto
*  Modelo de cobrança: gratuito para projetos de código aberto, pago para projetos privados
*  Alternativas: BitBucket, GitLab, etc.

## Repositório remoto e local
Um projeto controlado pelo Git é
chamado de repositório de
versionamento. 


Tipicamente uma cópia "oficial"
do repositório fica salvo em um
servidor (repositório remoto). 


Cada pessoa que trabalha no
projeto pode fazer uma cópia do
repositório para seu computador
(repositório local). A pessoa
então faz suas alterações no
projeto (novos commits) e depois
salva as alterações no servidor


PULL ou CLONE -> faz clone do repositorio do Git para sua maquina
COMMIT -> Salva versoes no projeto
PUSH -> Envia as versões para o gitHub

## Configurando conta 
git config --global user.name "Seu nome"


git config --global user.email "Seu email de cadastro do Github"

## Configurando chave SSH
protocolo de comunicação com segurança


## Salvando primeira versão de um projeto no Github
git init -> Cria um repositorio local do projeto
git add. -> Envia os arquivos do seu projeto para a area do stage
git commit -m "Mensagem explicativa" -> envia a versao do seu projeto