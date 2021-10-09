# `GIT` | `GITHUB`

### GIT -  é um sistema de versionamento: você controla as modificações de um projeto por meio de versões chamadas "commits"

## Git - configuração inicial

* #### Crie conta GitHub: https://github.com/login
* #### Instale o Git na sua máquina
* #### Configure suas informações (nome e email Github)
    * git config --global user.name "Seu Nome"
    * git config --global user.email "Seu Email"
* #### Verifique suas informações
    * git config --list
    * git config user.name
    * git config user.email


## Git - comandos básicos

| Comandos  |Descrição |
|:------------- |:-------------|
|git init |inicializa o git no repositório local|
|git add <nome-do-arquivo> ou .| adiciona um arquivo modificado ao stagging (área temporária)|
|git status| mostra os status dos arquivos modificados|
|git commit -m |"mensagem" cria um commit|
|git pull| puxa as atualizações mais recente (remoto -> local)|
|git push |envia as atualizações mais recentes (local -> remoto)|
|git remote add origin <caminho>| adiciona o seu repositório local ao remoto|
|git checkout -- <nome-arquivo> |descarta as alterações locais do arquivo informado|

