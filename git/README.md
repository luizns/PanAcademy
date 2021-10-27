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
|git commit  –am ou -m “legenda-do-commit” |adiciona para o git todos os arquivos Adds, com a mensagem “xxx” como titulo|
|git pull| puxa as atualizações mais recente (remoto -> local)|
|git push |envia as atualizações mais recentes (local -> remoto)|
|git remote add origin <caminho>| adiciona o seu repositório local ao remoto|
|git checkout -- <nome-arquivo> |descarta as alterações locais do arquivo informado|
|git clone  endereço-do-repositório-remoto|traz e mantem um link de um repositório git  com uma pasta local ou um link de um repositório web. 
|git log| lista todos os commits (snapshot) que foram feitos e onde esta apontando o HEAD. 
|git branch| mostra a branch que está.|
|git branch -M novo-nome| modifica o nome da branch.|
|git checkout - - nome-do-arquivo| adiciona o seu repositório local ao remoto.|
|git remote add origin "local-caminho"| adiciona o seu repositório local ao remoto.|
|git checkout -b nome-da-branch|cria uma nova branch e vai para ela.|
|git checkout|  volta para branch anterior.|
|git checkout - - nome-do-arquivo|  descarta as alterações locais do arquivo informado.|
|git reset| muda o ponteiro para o guid (pode ser soft e hard).|
|git merge| mandamos as alterações para a branch principal.|

  


## ***GITFLOW***

| Comandos  |Descrição |
|:------------- |:-------------|
|git flow init| inicializa repositório inicializando que na pasta será um gitflow (Serão inicializadas as branches master e develop, e são sugeridas a inicialização das outras braches).|
|version tag prefix|inicializa a versão (por exemplo v1, v2) , se não quiser inicializar a versão é digitado (DONE).|
|git flow feature start -nome-da-branch|inicializa uma branch feature com nome ou número de identificação.|
|git flow feature finish -nome-da-branch|finaliza e deleta a branch feature que estava sendo utilizada, e não quebra a branch master ( do modo normal iriamos para a MAIN e  dar MERGE).|
|git branch --list|lista as branches que existem no repositório e sinaliza em qual branch está sendo trabalhada.|
|git flow release start -numero-da-versao|as releases representariam o ambiente de HML (homologação), é onde os QAs acessam e testam.|
|git flow release finish -numero-da-versao|fecha a release (é aberto um editor para rotular o commit).  Após a rolutação do commit a branch release foi fechada e o fluxo de trabalho é  redirecionado para a  branch master.|


