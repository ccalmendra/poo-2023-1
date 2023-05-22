## Exercícios sobre coleções
1. [Percorrendo coleções](percorrendo-colecao/)
  	- Laço `for` em coleções
2. [Surfando na internet](surfando-internet/)
  	- Uso de pilhas
3. [Sessão de Cinema 2](sessao-cinema-2/)
  	- Uso de mapas  
4. [Contagem de palavras (avançado)](contagem-palavras/)
  	- Leitura de arquivos
  	- Uso de funções de manipulação de Strings
  	- Contagem de ocorrência de objetos dentro de coleções

## Exercícios sobre exceções
1. [Siga o passo da seção 12.2](https://www.caelum.com.br/apostila/apostila-java-orientacao-objetos.pdf)
2. Em qualquer das versões do exercício que contém um Controlador de Contas, altere a definição dos métodos para incluir exceções personalizados:
    - Métodos `realizarSaque`, `realizarDeposito` e `realizarTransferencia` devem lançar uma exceção `ContaNaoEncontradaException`, caso o código da conta informada não seja encontrada na coleção de contas.
    - Métodos de cadastro de contas (Corrente ou Poupança) devem lançar uma exceção `CodigoContaExistenteException`, caso o código da nova conta já existe na coleção de contas.
    - Altere o Runner para tratar a exceção lançada.
