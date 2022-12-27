using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Markup;

namespace Teste_Grupo_GNC
{
    class Problema3
    {

        public static void NumeroDaSorte()
        {
            Console.WriteLine("Tente descobrir o numero da sorte: ");
            while (true)
            {
                int value = int.Parse(Console.ReadLine());
                if (value >= 0 && value < 7)
                {
                    Console.WriteLine("Numero menor que o numero da sorte\nTente novamente!");
                }
                else if (value > 7 && value <= 10)
                {
                    Console.WriteLine("Numero maior que o numero da sorte\nTente novamente!");
                }
                else if (value == 7)
                {
                    Console.WriteLine($"Você acertou!!!!\nO numero da sorte é {value}");
                    break;
                }
                else
                {
                    Console.WriteLine("O numero da sorte deve ser entre 0 e 10");
                }
            }
        }
        public static void Main(String[] args)
        {
            NumeroDaSorte();
        }
    }
}
