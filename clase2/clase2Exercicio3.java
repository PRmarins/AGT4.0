import java.util.Scanner;

public class clase2Exercicio3 {

    public static void main (String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[10];

        System.out.println("Elija 10 numeros");

        numeros [0] = teclado.nextInt();
        numeros [1] = teclado.nextInt();
        numeros [2] = teclado.nextInt();
        numeros [3] = teclado.nextInt();
        numeros [4] = teclado.nextInt();
        numeros [5] = teclado.nextInt();
        numeros [6] = teclado.nextInt();
        numeros [7] = teclado.nextInt();
        numeros [8] = teclado.nextInt();
        numeros [9] = teclado.nextInt();

        int X = 10;
        int c = 0;
        int result = 0;

        for (int i = 0;i < 10;i++) {
            
            if (numeros[c] > X) {

                result += numeros[c];

            }
            c++;
        }

        System.out.println("Todos los numeros elegidos mayores a 10 sumados tiene el resultado: "+result);

        teclado.close();

    }
    
}
