package As_51_atividades;
import java.util.Scanner;
public class Licao15 {
  public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
   
    System.out.print("Digite quantas vezes a série será executada: ");
    int n = teclado.nextInt();

    int primeiroTermo = 1;
    int segundoTermo = 1;
    System.out.print("Série até o " + n + "º termo: " + primeiroTermo + ", " + segundoTermo);
    for(int i=2; i<n; i++){
       int proximoTermo = primeiroTermo + segundoTermo;
       System.out.print(", " + proximoTermo);
       primeiroTermo = segundoTermo;
       segundoTermo  += primeiroTermo;
       
     teclado.close();
    }

  }
}

