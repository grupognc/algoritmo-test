#include <stdio.h>
#include <stdlib.h>

int num_da_sorte()
{
    int num;

    while (num != 7)
    {

        printf("\nPor favor digite um numero inteiro: ");

        scanf("%i", &num);

        if (num < 7)
        {
            printf("\nA entrada e menor que o numero de sorte\n");
        }

        else if (num > 7 && num < 11)
        {
            printf("\nA entrada e maior que o numero da sorte\n");
        }

        else if (num > 10)
        {
            printf("\nO numero da sorte deve ser de 0 a 10\n");
        }

        else if (num == 7)
            printf("\nVoce acertou\n");
    }
}
