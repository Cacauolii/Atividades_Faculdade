import java.util.Scanner;
public class Licao51 {
     public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     System.out.print("Digite o valor de n: ");
     int n = teclado.nextInt();
     double soma = 0.0;
     int denominador = 1;
     for (int i = 1; i <= n; i++) {
     soma += (double) i / denominador;
     denominador += 2;
     }
     System.out.println("A soma da série S para n = " + n + " é: " + soma);
     teclado.close();
     }
    
}
