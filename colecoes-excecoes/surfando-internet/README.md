# Lá e de volta outra vez - Voltar/Avançar no Navegador

A ideia desta atividade é que você seja capaz de implementar um objeto que controle o fluxo de navegação de páginas em uma aba do navegador. 

## Requisitos

  - O histórico de navegação guarda URL visitadas
  - Existem 3 ações: VISITAR nova URL, VOLTAR ou AVANÇAR.
  - VISITAR:
  	- Nova URL se tornar a página atual (sendo mostrada)
  	- Antiga URL atual é adicionada ao histórico para trás
  	- Histórico à frente é zerado
  - VOLTAR:
  	- Se histórico para trás estiver vazio, não faz nada
  	- URL atual é guardada no histórico à frente
  	- Primeira URL do histórico para trás se torna a URL atual
  - AVANÇAR:
	- Se histórico à frente estiver vazio, não faz nada
  	- URL atual é guardada no histórico para trás
  	- Primeira URL do histórico à frente se torna a URL atual
 

## Tarefa

**T1**: Defina uma classe para controlador o histórico de navegação. Essa classe deve ter métodos para visitar uma nova URL, voltar, avançar e recuperar a URL atual.

**T2**: Implemente um Runner e elabore uma sequência de ações (visitar, voltar e avançar). Teste se seu algoritmo está correto verificando qual é a URL atual em determinado ponto da sequencia.
  - Exemplo:
  	- Visitar "url1"
  	- Visitar "url2"
  	- Voltar
  	- Recuperar URL atual => deve ser "url1" nesse ponto.
  	- Avançar
  	- Recuperar URL atual => deve ser "url2" nesse ponto.

**T3**: Implemente os requisitos.

- Dica 1: uma pilha é uma lista em que os elementos sempre são adicionados ou removidos da posição inicial (índice 0). Veja a documentação oficial dos métodos `add(int index, E element)` e `remove(int index)` em https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/List.html
- Dica 2: uma opção simples de design é utilizar uma pilha para cada histórico (pilha volta e pilha avançar)
- Dica 3: dúvida sobre qual seria o resultado esperado? Use seu navegador e veja como funciona.
