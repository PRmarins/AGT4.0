public class clase1Exercicio1d {

    public static void main (String [] args) {

        int a = 5;
        int b = 30;

        for (int i = b; i >= a; i-- ) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}