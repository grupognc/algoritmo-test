package Exercicios;


/*Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B. 
 * A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo 
 * com que o valor que está em A passe para B e vice-versa. 
 * Ao final, escrever os valores que ficaram armazenados nas variáveis e exibi-los na tela.*/

public class Exercicio_1 {

	public static void main(String[] args) {
		int varA = 10;
		int varB = 20;
		int aux;
		
		aux = varA;
		varA = varB;
		varB = aux;
		
		
		System.out.println("Valor da variável A: " +varA);
		System.out.println("Valor da variável B: " +varB);
		
		
		
		
		
		
	}

}
