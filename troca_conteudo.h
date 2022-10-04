#include <stdio.h>
#include <stdlib.h>

int troca_conteudo()
{
    int A = 10;
    int B = 20;

    int aux = A;
    A = B;
    B = aux;

    printf("O valor de A e igual a: %d \n", A);
    printf("O valor de B e igual a: %d ", B);

    return 0;
}