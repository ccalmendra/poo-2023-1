#include <stdio.h>
#include "calculadora.h"


int main(void) {

    float operando1, operando2;
    char operacao;

    do {
        printf("\n---------\n");
        printf("| + | - |\n");
        printf("_________\n");
        printf("| / | * |\n");
        printf("---------\n");
        printf("S -> Sair\n");
        printf("Digite a operacao desejada: ");
        scanf("%c", &operacao);

        if(operacao != 'S') {
            printf("Digite o primeiro operando: ");
            scanf("%f", &operando1);

            printf("Digite o segundo operando: ");
            scanf("%f", &operando2);

            switch(operacao){
                case '+': printf("%.2f + %.2f = %.2f", operando1, operando2, soma(operando1, operando2)); break;
                case '-': printf("%.2f - %.2f = %.2f", operando1, operando2, substracao(operando1, operando2)); break;
                case '*': printf("%.2f * %.2f = %.2f", operando1, operando2, multiplicacao(operando1, operando2)); break;
                case '/': printf("%.2f / %.2f = %.2f+", operando1, operando2, divisao(operando1, operando2)); break;
                default: ;

            }
            getchar();
        }
    } while(operacao != 'S');

    printf("\n-------------------------------------------------------------------------\n");

    return 0;

}
