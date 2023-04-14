import java.util.Scanner;

public class clase2Exercicio4 {
  public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite algo");
    
    String usuario = teclado.nextLine().strip().toLowerCase();

    String pausa = "2";
    String usuario2 = usuario + pausa;

    char [] letras = null;

    letras = usuario2.toCharArray();
    letra(letras);

    System.out.println(letras+".");
  
    teclado.close();
  } 

    // #######################  CAMBIO DE LETRAS ####################  \\
    
  static char[] letra (char [] i) {
    
    for (int o = 0; o < 27;o++)
      if (i [o] == '2') {
        i [o] = ' ';
        break;
      }
      else if (i [o] == 'a'){
        if (i [0] == 'a') {
          i [0] = 'C';
        }else{
        i [o] = 'c';
        }
      }else if (i [o] == 'b') {
        if (i [0] == 'b') {
          i [0] = 'D';
        }else{
        i [o] = 'd';
        }
      }else if (i [o] == 'c') {
        if (i [0] == 'c') {
          i [0] = 'E';
        }else{
        i [o] = 'e';
        }
      }else if (i [o] == 'd') {
        if (i [0] == 'd') {
          i [0] = 'F';
        }else{
        i [o] = 'f';
        }
      }else if (i [o] == 'e') {
        if (i [0] == 'e') {
          i [0] = 'G';
        }else{
        i [o] = 'g';
        }
      }else if (i [o] == 'f') {
        if (i [0] == 'f') {
          i [0] = 'H';
        }else{
        i [o] = 'h';
        }
      }else if (i [o] == 'g') {
        if (i [0] == 'g') {
          i [0] = 'I';
        }else{
        i [o] = 'i';
        }
      }else if (i [o] == 'h') {
        if (i [0] == 'h') {
          i [0] = 'J';
        }else{
        i [o] = 'j';
        }
      }else if (i [o] == 'i') {
        if (i [0] == 'i') {
          i [0] = 'K';
        }else{
        i [o] = 'k';
        }
      }else if (i [o] == 'j') {
        if (i [0] == 'j') {
          i [0] = 'L';
        }else{
        i [o] = 'l';
        }
      }else if (i [o] == 'k') {
        if (i [0] == 'k') {
          i [0] = 'M';
        }else{
        i [o] = 'm';
        }
      }else if (i [o] == 'l') {
        if (i [0] == 'l') {
          i [0] = 'N';
        }else{
        i [o] = 'n';
        }
      }else if (i [o] == 'm') {
        if (i [0] == 'm') {
          i [0] = 'O';
        }else{
        i [o] = 'o';
        }
      }else if (i [o] == 'n') {
        if (i [0] == 'n') {
          i [0] = 'P';
        }else{
        i [o] = 'p';
        }
      }else if (i [o] == 'o') {
        if (i [0] == 'o') {
          i [0] = 'Q';
        }else{
        i [o] = 'q';
        }
      }else if (i [o] == 'p') {
        if (i [0] == 'p') {
          i [0] = 'R';
        }else{
        i [o] = 'r';
        }
      }else if (i [o] == 'q') {
        if (i [0] == 'q') {
          i [0] = 'S';
        }else{
        i [o] = 's';
        }
      }else if (i [o] == 'r') {
        if (i [0] == 'r') {
          i [0] = 'T';
        }else{
        i [o] = 't';
        }
      }else if (i [o] == 's') {
        if (i [0] == 's') {
          i [0] = 'U';
        }else{
        i [o] = 'u';
        }
      }else if (i [o] == 't') {
        if (i [0] == 't') {
          i [0] = 'V';
        }else{
        i [o] = 'v';
        }
      }else if (i [o] == 'u') {
        if (i [0] == 'u') {
          i [0] = 'W';
        }else{
        i [o] = 'w';
        }
      }else if (i [o] == 'v') {
        if (i [0] == 'v') {
          i [0] = 'X';
        }else{
        i [o] = 'x';
        }
      }else if (i [o] == 'w') {
        if (i [0] == 'w') {
          i [0] = 'Y';
        }else{
        i [o] = 'y';
        }
      }else if (i [o] == 'x') {
        if (i [0] == 'x') {
          i [0] = 'Z';
        }else{
        i [o] = 'z';
        }
      }else if (i [o] == 'y') {
        if (i[0] == 'y') {
          i [0] = 'A';
      }else{
        i [o] = 'a';
        }
      }else if (i [o] == 'z') {
        if (i [0] == 'z') {
          i [0] = 'B';
        }else{
        i [o] = 'b';
        }
      }else if (i [o] == ' ') {
        if (i [0] == ' ') {
          i [0] = ' ';
        }
      }

    
    
    return i ;

  }
}