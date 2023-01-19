package third_exercise;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i;

		i = sc.nextInt();

		if (i == 7) {
			System.out.printf("Você acertou!");
		}

		else {
			while (i >= 0) {
				if (i < 7 && i >= 0) {
					System.out.printf("Entrada menor do que o número da sorte \n");
					i = sc.nextInt();
				} else if (i == 7) {
					System.out.printf("Você acertou! \n");
					break;
				} else if (i > 7 && i <= 10) {
					System.out.printf("Entrada maior do que o número da sorte \n");
					i = sc.nextInt();
				} else if (i > 10) {
					System.out.printf("O número da sorte deve ser de 0 a 10 \n");
					i = sc.nextInt();
				}

			}
		}
	}

}
