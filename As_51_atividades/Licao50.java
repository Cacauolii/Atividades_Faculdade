package As_51_atividades;
import java.util.Scanner;
public class Licao50 {
     public static void main(String[] args) {
     Scanner teclado= new Scanner(System.in);
     System.out.println("Digite o valor de N:");
     int N = teclado.nextInt();
     double H = 0;
     for (int i = 1; i <= N; i++) {
     H += 1.0 / i;
     }
     System.out.println("O valor de H com " + N + " termos é aproximadamente " + String.format("%.6f", H));

        teclado.close();
    }
}

