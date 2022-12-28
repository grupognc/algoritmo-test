public class TrocaVariavel {
    public static void main(String[] args) {

            int A = 10;
            int B = 20;
            int aux = 0;

            System.out.println("Valor inicial de A é: " + A);
            System.out.println("Valor inicial de B  é: "+ B);

            aux = A;
            A = B;
            B = aux;


            System.out.println("Valor final de A é: " + A);
            System.out.println("Valor final de B inicial é: " + B);

        }
}
