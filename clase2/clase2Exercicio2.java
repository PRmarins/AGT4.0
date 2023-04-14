import java.util.Scanner;

public class clase2Exercicio2 {

    public static void main(String [] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba 3 numeros: ");

        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        int numero3 = teclado.nextInt();

        int lista [] = new int[3];
        lista [0] = numero1;
        lista [1] = numero2;
        lista [2] = numero3;

        System.out.println("Te gustaria poner los numeros en orden ascendente o decreciente? ");

        String respuesta = teclado. next();

        respuesta = respuesta.toUpperCase();
        
        if (respuesta.equals("ASCENDENTE")){
            if (lista[0] > lista[1] && lista[0] > lista[2] && lista[1] > lista[2]) {
                System.out.println("Los numeros en orden ascendente es: "+lista[2]+" "+lista[1]+" "+lista[0]);
            }else if (lista[0] > lista[1] && lista[0] > lista[2] && lista[2] > lista[1]) {
                System.out.println("Los numeros en orden ascendente es: "+lista[1]+" "+lista[2]+" "+lista[0]);
            }else if (lista[1] > lista[0] && lista[1] > lista[2] && lista[0] > lista[2]) {
                System.out.println("Los numeros en orden ascendente es: "+lista[2]+" "+lista[0]+" "+lista[1]);
            }else if (lista[1] > lista[0] && lista[1] > lista[2] && lista[2] > lista[0]) {
                System.out.println("Los numeros en orden ascendente es: "+lista[0]+" "+lista[2]+" "+lista[1]);
            }else if (lista[2] > lista[0] && lista[2] > lista[1] && lista[1] > lista[0]) {
                System.out.println("Los numeros en orden ascendente es: "+lista[0]+" "+lista[1]+" "+lista[2]);
            }else if (numero3 > numero1 && numero3 > numero2 && numero1 > numero2) {
                System.out.println("Los numeros en orden ascendente es: "+lista[1]+" "+lista[0]+" "+lista[2]);
            }
            
        }else if (respuesta.equals("DECRECIENTE")) {
            if (lista[0] > lista[1] && lista[0] > lista[2] && lista[1] > lista[2]) {
                System.out.println("Los numeros en orden ascendente es: "+lista[0]+" "+lista[1]+" "+lista[2]);
            }else if (lista[0] > lista[1] && lista[0] > lista[2] && lista[2] > lista[1]) {
                System.out.println("Los numeros en orden ascendente es: "+lista[0]+" "+lista[2]+" "+lista[1]);
            }else if (lista[1] > lista[0] && lista[1] > lista[2] && lista[0] > lista[2]) {
                System.out.println("Los numeros en orden ascendente es: "+lista[1]+" "+lista[0]+" "+lista[2]);
            }else if (lista[1] > lista[0] && lista[1] > lista[2] && lista[2] > lista[0]) {
                System.out.println("Los numeros en orden ascendente es: "+lista[1]+" "+lista[2]+" "+lista[0]);
            }else if (lista[2] > lista[0] && lista[2] > lista[1] && lista[1] > lista[0]) {
                System.out.println("Los numeros en orden ascendente es: "+lista[2]+" "+lista[1]+" "+lista[0]);
            }else if (numero3 > numero1 && numero3 > numero2 && numero1 > numero2) {
                System.out.println("Los numeros en orden ascendente es: "+lista[2]+" "+lista[0]+" "+lista[1]);
            }
        }
        teclado.close();
        
    }
    

}