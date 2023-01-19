package first_exercise;
import java.util.Scanner; 


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int A, B, C; 
		
		A = 10; 
		B = 20; 
		C = 0; 
		
		C = A; 
		A = B; 
		B = C;
		
		System.out.printf("O valor de A é: %d \n", A);
		System.out.printf("O valor de B é: %d", B);

	}

}
