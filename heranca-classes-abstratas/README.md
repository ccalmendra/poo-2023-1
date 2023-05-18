### Exercícios sobre herança e classes abstratas

## Organização de sub-classes usando herança

(Controlador de Contas Corrente e Poupança (usando herança))[conta-corrente-poupanca/]

## Novo requisito implementado através de sub-classe

(Controlador de Contas com Auditoria)[controlador-conta-auditoria/]

## Sobrecarga de método para reusar recursos de `Object` e de coleções

1. No exercício (Tabela de Campeonato)[../interfaces/tabela-campeonato/], remova o método `getResumo()` da classe `Participante` e sobrecarregue o método `toString()` para implementar a mesma funcionalidade (fornecer um resumo do participante).
 - Leia: https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/Object.html#toString()
 - Leia: seção 13.4 da apostila da Alura

2. Usando o mesmo exercício Tabela de Campeonato, sobrecarregue o método `equals` da classe Participante para permitir a seguinte checagem antes de adicionar um participante na lista:

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