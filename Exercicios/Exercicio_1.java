package Exercicios;


/*Escreva um algoritmo que armazene o valor 10 em uma vari�vel A e o valor 20 em uma vari�vel B. 
 * A seguir (utilizando apenas atribui��es entre vari�veis) troque os seus conte�dos fazendo 
 * com que o valor que est� em A passe para B e vice-versa. 
 * Ao final, escrever os valores que ficaram armazenados nas vari�veis e exibi-los na tela.*/

public class Exercicio_1 {

	public static void main(String[] args) {
		int varA = 10;
		int varB = 20;
		int aux;
		
		aux = varA;
		varA = varB;
		varB = aux;
		
		
		System.out.println("Valor da vari�vel A: " +varA);
		System.out.println("Valor da vari�vel B: " +varB);
		
		
		
		
		
		
	}

}
