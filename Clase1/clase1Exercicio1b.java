import java.util.Scanner;

public class clase1Exercicio1b {

    public static void main (String [] args) {

        System.out.println("Elija un numero mayor que cero: ");

        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();

        System.out.println("Ahora elija un numero mayor que el numero anterior: ");
        int b = teclado.nextInt();

        int i = a;

        while (i <= b) {
            if (i % 2 == 0){ 
                System.out.print(i + " ");
            }
            i++;
        }teclado.close();

    }
    
}
