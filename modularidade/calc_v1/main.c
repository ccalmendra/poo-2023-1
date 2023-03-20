#include <stdio.h>
#include <stdlib.h>

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
        case '+': printf("%f + %f = %f", operando1, operando2, operando1 + operando2); break;
        case '-': printf("%f - %f = %f", operando1, operando2, operando1 - operando2); break;
        case '*': printf("%f * %f = %f", operando1, operando2, operando1 * operando2); break;
        case '/': printf("%f / %f = %f", operando1, operando2, operando1 / operando2); break;
        default: ;

      }
      getchar();
    }
  } while(operacao != 'S');

  printf("\n-------------------------------------------------------------------------\n");

  return 0;

}
