package Exercicios;

import java.util.Scanner;

/*Escreva um algoritmo que capture a entrada de dados do usuário , e realize as seguintes validações enquanto o número for menor 7

Se o valor menor do 7, exibir que a entrada é menor do que o número de sorte.
Se o valor maior do que 7, exibir que a entrada é a maior do que o número de sorte.
Se o número for igual a 7, exibir "Você acertou" e finalizar o algoritmo.
Se o número for maior do que 10, exibir "O número de sorte deve ser de 0 a 10"*/


public class Exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int numero;
		
		
		do {
			System.out.println("Digite um numero: ");
			numero = scan.nextInt();
			
			if(numero < 7)
				System.out.println("O numero é menor que o número da sorte!");
			
			if(numero > 7 && numero < 10)
				System.out.println("O numero é maior que o número da sorte!");
			
			if(numero > 10)
				System.out.println("O número de sorte deve ser de 0 a 10");
			
			if(numero==7)
				System.out.println("Você acertou!");
			
			
				
		}	
		while(numero !=7);	
		
	}

}
