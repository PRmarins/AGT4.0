import java.util.Scanner;

public class clase1Exercicio1a {

    public static void main (String [] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Elija un número entero mayor que cero: ");
        int a = teclado.nextInt();

        System.out.println("Ahora un número entero mayor que el número anterior: ");
        int b = teclado.nextInt();

        int i = ;

        while (i <= b) {
            System.out.print(i + " ");
            i++;

        }teclado.close();
    }
    
}
