import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Insira o numero desejado : ");
        num = entrada.nextInt();

        if (num < 7) {
            System.out.println("O valor escolhido é menor do que o numero da sorte");
        } else {
            if ( num > 7 && num < 10 )
            {
                System.out.println("O valor escolhido é maior do que o numero da sorte");
            } else {
                if (num == 7)
                {
                    System.out.println("O valor escolhido é o numero da sorte");

                } else {
                    if (num > 10)
                    {
                        System.out.println("O numero da sorte deve ser entre 0 a 10 ");
                    }

                }
            }
        }
    }
}


