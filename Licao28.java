import java.util.Scanner;
public class Licao28 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Informe a quantidade de CDs: ");
    int cd = teclado.nextInt();
    double media = 0.0;
    for(int i = 1; i<=cd; i++){
        System.out.print("Digite o valor de cada: " + i + ": ");
        double valor = teclado.nextDouble();
        media += valor;
    }
    double total = media/cd;
    System.out.println("A média investida é: " + total);
    teclado.close();
  }
}
