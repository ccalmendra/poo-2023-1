 # Percorrendo coleção - Saldo total de contas por tipo

A ideia desta atividade é que você seja capaz de percorrer coleções de objetos para totalização/sumarização. O foco é utilizar funcionalidades já existentes nas bibliotecas Java.

- [Requisitos](#requisitos)
- [Tarefa](#tarefa)

## Requisitos

- Considere a solução do exercício do módulo Interfaces [Conta Corrente e Poupança](../../interfaces/conta-corrente-poupanca/solucao)
- Considere o Runner abaixo

```java
public class Runner {

    public static void main(final String[] args) {

        List<Conta> contas = new ArrayList<Conta>();

        contas.add(new ContaCorrente("1111",100.0));
        contas.add(new ContaPoupanca("2222",200.0));
        contas.add(new ContaCorrente("3333",300.0));
        contas.add(new ContaPoupanca("4444",400.0));
        contas.add(new ContaCorrente("5555",500.0));
        contas.add(new ContaPoupanca("6666",600.0));

        // sua solução começa aqui ...
        
}
```

## Tarefa

**T1**: Calcule o saldo TOTAL das contas corrente
 - Dica: você precisa somar todos os saldos de objetos `Conta` que seja instâncias de `ContaCorrente`

**T2**: Calcule o saldo MÉDIO das contas poupança
 - Dica: você precisa somar todos os saldos de objetos `Conta` que seja instâncias de `ContaPoupanca`, e dividir pela quantidade de contas poupança

### Descobrindo o subtipo de um objeto

LEIA: The instanceof Operator (https://docs.oracle.com/javase/specs/jls/se20/html/jls-15.html#jls-15.20.2)

### Usando o laço "enhanced for" (também chamado "foreach")

LEIA: Seção 15.9 da Apostila de Java da Alura (https://www.caelum.com.br/apostila/apostila-java-orientacao-objetos.pdf)
