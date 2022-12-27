using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Teste_Grupo_GNC
{
    class Problema1
    {
        public static void Main(String[] args)
        {
            int A = 10;
            int B = 20;
            int C = A;

            A = B; 
            B = C;

            Console.WriteLine($"Valor de A: {A}");
            Console.WriteLine($"Valor de B: {B}");
        }
    }
}
