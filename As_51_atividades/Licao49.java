package As_51_atividades;
import java.util.Scanner;
public class Licao49 {
     public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     System.out.print("Digite o valor de n para calcular a série S: ");
     int n = teclado.nextInt();
     double soma = 0.0;
     int m = 1;
     for (int i = 1; i <= n; i++) {
     soma += (double) i / m;
     m += 2;
     }
     System.out.println("O valor da série S para n = " + n + " é: " + soma);
     teclado.close();
     }
    }
