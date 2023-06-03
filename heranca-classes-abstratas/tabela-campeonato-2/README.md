# Tabela de Campeonato 2

## Requisitos 

- Considere os mesmos requisitos de exercício anterior [Tabela de Campeonato](../../interfaces/tabela-campeonato/)

## Tarefas 

**T1** No exercício [Tabela de Campeonato](../interfaces/tabela-campeonato/), remova o método `getResumo()` da classe `Participante` e sobrecarregue o método `toString()` para implementar a mesma funcionalidade (fornecer um resumo do participante).
 - Leia: https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/Object.html#toString()
 - Leia: seção 13.4 da apostila da Alura

**T2** Usando o mesmo exercício Tabela de Campeonato, sobrecarregue o método `equals` da classe Participante para permitir a seguinte checagem antes de adicionar um participante na lista:

```java 
	Participante p = new Participante("Terra");
	if(participantes.contains(p)){
		System.out.println("Nome de participante duplicado");
	} else {
		participantes.add(p);
	}
```

- Leia: https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object)
- Leia: https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object)
- Leia: seção 13.4 da apostila da Alura