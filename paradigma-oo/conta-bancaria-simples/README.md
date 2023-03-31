# Conta Bancária Simples

A idea desta atividade é que você seja capaz de implementar as funcionalidades
básicas de uma conta bancária.

- [Requisitos](#requisitos)
- [Diagrama](#diagrama)
- [Exemplo de execução](#exemplo-de-execução)

## Requisitos

- Conta
  - Uma conta bancária simples guarda o saldo em reais de um correntista
  - A conta precisa aceitar operações de saque, depósito, alteração de limite, e emitir saldo atual
- Inicialização
  - O valor inicial do limite deve ser 100.00
  - Conta precisa de um número de identificação e um saldo inicial ao ser criada
- Saldo
  - O saldo da conta é igual ao saldo mais o limite
- Saques
  - Não deve ser possível sacar um valor negativo ou zero
  - Não deve ser possível sacar um valor que exceda o limite da conta (saldo + limite)
- Depósitos
  - Não deve ser possível depositar um valor negativo ou zero.
  

## Diagrama
![Diagrama UML](contabancaria.png)


## Criando sua primeira classe em Java 

Veja as seções 4.2 a 4.6 da Apostila de Java da Alura (https://www.caelum.com.br/apostila/apostila-java-orientacao-objetos.pdf)

## Exemplo de execução 

**TAREFA**: Implementar uma classe Conta que atenda os requisitos, conforme o diagrama e o código de teste abaixo.

```java
public class Runner {

    public static void main(final String[] args) {

        Conta minhaConta = new Conta(1001, 200.0);
        System.out.println(minhaConta.emitirSaldo()); //Conta{numero=1001, saldo=200.0, limite=100.0}

        minhaConta.sacar(200);
        System.out.println(minhaConta.emitirSaldo()); //Conta{numero=1001, saldo=0.0, limite=100.0}

        if(minhaConta.sacar(101.0)){
            System.out.println("Saque autorizado"); //Saldo suficiente
        } else {
            System.out.println("Saque não autorizado"); //Saldo insuficiente
        }

        minhaConta.depositar(500);
        System.out.println(minhaConta.emitirSaldo()); //Conta{numero=1001, saldo=500.0, limite=100.0}

        if(minhaConta.sacar(150)){
            System.out.println("Saque autorizado"); //Saldo suficiente Conta{numero=1001, saldo=350.0, limite=100.0}
        } else {
            System.out.println("Saque não autorizado"); //Saldo insuficiente
        }
        
        minhaConta.alterarLimite(50.0);
        System.out.println(minhaConta.emitirSaldo()); //Conta{numero=1001, saldo=350.0, limite=50.0}
        
        if(minhaConta.sacar(400.50)){
            System.out.println("Saque autorizado"); //Saldo suficiente 
        } else {
            System.out.println("Saque não autorizado"); //Saldo insuficiente Conta{numero=1001, saldo=350.0, limite=50.0}
        }

        minhaConta.depositar(50);
        System.out.println(minhaConta.emitirSaldo()); //Conta{numero=1001, saldo=400.0, limite=50.0}

    }
}
```
