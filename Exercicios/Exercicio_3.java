package Exercicios;

import java.util.Scanner;

/*Escreva um algoritmo que capture a entrada de dados do usu�rio , e realize as seguintes valida��es enquanto o n�mero for menor 7

Se o valor menor do 7, exibir que a entrada � menor do que o n�mero de sorte.
Se o valor maior do que 7, exibir que a entrada � a maior do que o n�mero de sorte.
Se o n�mero for igual a 7, exibir "Voc� acertou" e finalizar o algoritmo.
Se o n�mero for maior do que 10, exibir "O n�mero de sorte deve ser de 0 a 10"*/


public class Exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numero;
		
		
		do {
			System.out.println("Digite um numero: ");
			numero = scan.nextInt();
			
			if(numero < 7)
				System.out.println("O numero � menor que o n�mero da sorte!");
			
			if(numero > 7 && numero < 10)
				System.out.println("O numero � maior que o n�mero da sorte!");
			
			if(numero > 10)
				System.out.println("O n�mero de sorte deve ser de 0 a 10");
			
			if(numero==7)
				System.out.println("Voc� acertou!");
			
			
				
		}	
		while(numero !=7);	
		
	}

}
