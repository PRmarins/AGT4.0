import java.util.Scanner;

public class clase1Exercicio1c {

    public static void main (String [] args) {

        System.out.println("Elija un numero mayor que cero: ");

        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();

        System.out.println("Ahora elija un número mayor que el anterior: ");
        int b = teclado.nextInt();

        System.out.println("Desea mostrar los numeros impares o pares? [ 1 ] para impares. [ 2 ] para pares.");
        int imparpar = teclado.nextInt();

        int i = a;
        if (imparpar == 1) {
            while (i != b) {
                if (i % 2 != 0){
                System.out.print(i + " ");
                
                }
                i++;
            }
            }
        if (imparpar == 2) {
            while (i != b) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
        }teclado.close();
        

        
    }
    
}
