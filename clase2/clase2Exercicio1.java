import java.util.Scanner;

public class clase2Exercicio1 {
    
    public static void main (String [] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba alguna frase.");
        String frase = teclado.nextLine();

        System.out.println("Digite una letra que quieras saber cuantas veces se aparece en su frase: ");
        char letra = teclado.nextLine().charAt(0);
      
        int contador = 0;
        for (int i = 0; i < frase.length(); i++){
            if(frase.charAt(i)==letra) {
                contador ++;
            }
            
        }
        
        if (contador == 1){
            System.out.println("La letra "+letra+" aparecio "+contador+" vez en la frase.");
        }else if(contador > 1){
        System.out.println("La letra "+letra+" aparecio "+contador+" veces en la frase.");
        }else if (contador == 0){

            System.out.println("La letra "+letra+" no aparecio en la frase.");
        }


        teclado.close();
    }
}