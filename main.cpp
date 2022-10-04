#include <stdio.h>
#include <stdlib.h>
#include "troca_conteudo.h"
#include "imprime_impar.h"
#include "num_da_sorte.h"
#include "texto.h"

int main()
{
    int opcao;

    printf("Ola, bem-vindo ao teste de algoritimos\n\nAbaixo se encontram os algoritmos para voce testar: \n");

    int texto = txt();

    while (opcao != 1, 2, 3)
    {
        printf("\nSelecione um numero para realizar um ou mais testes. Se quiser encerrar os testes, aperte qualquer outro numero: \n");
        scanf("%i", &opcao);

        if (opcao == 1)
        {
            int resultado = troca_conteudo();
        }

        else if (opcao == 2)
        {
            int resultado2 = imprime_impar();
        }

        else if (opcao == 3)
        {
            int resultado3 = num_da_sorte();
        }

        else
            break;
    }
}