 # Contagem de ocorrências de palavras em um arquivo

A ideia desta atividade é que você seja capaz de implementar uma contagem de palavras armazenadas em um arquivo de texto. O foco é utilizar funcionalidades já existentes nas bibliotecas Java.

- [Requisitos](#requisitos)
- [Tarefa](#tarefa)

## Requisitos

- Projete um objeto que recebe o nome de um arquivo e imprime a lista de todas as palavras existentes e a contagem de ocorrências.
- "Palavra" é qualquer texto entre espaços (ver Dicas).
- Pontuação deve ser removida (ver Dicas).
- Palavras com 3 ou menos caracteres devem ser ignoradas.
- Exemplo do texto dentro do arquivo:
```
O estudo das técnicas de programação constitui um componente fundamental no aprendizado de desenvolvimento de software. É
através da programação que os sistemas de software tornam-se produtos operacionais, passíveis de uso e comercialização. A
Orientação a Objetos é um paradigma de programação maduro e largamente utilizado tanto na indústria quanto na academia. Um
programa orientado a objetos é uma abstração do mundo real implementado através de um conjunto de objetos que interagem entre
si para resolver, no universo computacional, um problema ou conjunto de problemas de um domínio de aplicação. Por esse motivo, o
aprendizado das técnicas de programação orientada a objetos e, concomitantemente, a aplicação desse aprendizado através de uma
linguagem de programação orientada a objetos, observando as boas práticas de desenvolvimento, torna-se uma necessidade e um
fator diferencial.
```
- Saída esperada (primeiras 11 linhas)
```
objetos	5
programação	5
aprendizado	3
através 3
aplicação 2
conjunto 2
desenvolvimento 2
orientada 2
software 2
técnicas 2
abstração 1
...
```

## Abrindo e lendo arquivos em Java 

Veja a seção 17.3 (exemplo de código na página 239) da Apostila de Java da Alura (https://www.caelum.com.br/apostila/apostila-java-orientacao-objetos.pdf)

## Tarefa

**T1**: Implemente os requisitos.

	- Dica 1: prepare 2 ou 3 arquivos de teste, e construa um Runner simples que chama o objeto principal para cada arquivo
	- Dica 2: veja o exercício 4 da seção 23.21 (p. 358) com um exemplo de uso da função `split`. Separe as strings lidas do arquivo usando o espaço `" "` como separador.
	- Dica 3: veja o exercício 3 da seção 23.15 (p. 339-340) com um exemplo de uso da função `replaceAll`. Substitua todas as pontuações possíveis (.,;:?!-) por espaço. Faça isso antes de separar as palavras.
	- Dica 4: procure na internet sobre soluções em Java para contar a frequencia de repetições de objetos em uma coleção.