#include <stdio.h>
#include <stdlib.h>

float soma(float a, float b);
float sub(float a, float b);
float mult(float a, float b);
float divisao(float a, float b);

int main(void) {

  float operando1, operando2;
  char operacao;

  do {
    printf("\n-------------------------------------------------------------------------\n");
    printf("+ -> Soma | - -> Subtração | / -> Divisão | * -> Multiplicação | S -> Sair\n");
    scanf("%c", &operacao);

    if(operacao != 'S') {
      printf("Digite o primeiro operando: ");
      scanf("%f", &operando1);

      printf("Digite o segundo operando: ");
      scanf("%f", &operando2);

      switch(operacao){
        case '+': printf("%f + %f = %f", operando1, operando2, soma(operando1, operando2)); break;
        case '-': printf("%f - %f = %f", operando1, operando2, sub(operando1, operando2)); break;
        case '*': printf("%f * %f = %f", operando1, operando2, mult(operando1, operando2)); break;
        case '/': printf("%f / %f = %f", operando1, operando2, divisao(operando1, operando2)); break;
        default: ;

      }
      getchar();
    }
  } while(operacao != 'S');

  printf("\n-------------------------------------------------------------------------\n");

  return 0;

}

float soma(float a, float b) {
    return a + b;
}

float sub(float a, float b) { 
    return a - b;
}

float mult(float a, float b) {
    return a * b;
}

float divisao(float a, float b) {
    return a / b;
}

