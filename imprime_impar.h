#include <stdio.h>
#include <stdlib.h>

int imprime_impar()
{
    int i;

    for (i = 0; i <= 100; i++)
        if (i % 2 == 1)
            printf("%i\n", i);
}
