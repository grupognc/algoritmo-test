using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Teste_Grupo_GNC
{
    class Problema2
    {

        public static void NumerosImpares()
        {
            for (int i = 1; i < 100; i++)
            {
                if (i == 1)
                {
                    Console.WriteLine(i);
                }
                else if (i % 2 == 1)
                {
                    Console.WriteLine(i);
                }
            }
        }
        public static void Main(String[] args)
        {
            NumerosImpares();
        }
    }
}
