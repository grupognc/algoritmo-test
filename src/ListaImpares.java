public class ListaImpares {
    public static void main(String[] args) {

        System.out.println("Os Valores ímpares de 0 a 100:");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
