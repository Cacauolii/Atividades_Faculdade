import java.util.Scanner;
public class Licao38 {
 public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
 System.out.print("Digite o salário inicial do funcionário:");
 double salarioInicial = teclado.nextDouble();
 double aumento = 0.015;
 int anoAtual = 2024; 
 int anoInicial = 1995;
 
 double salarioAtual = salarioInicial;
 for (int ano = 1996; ano <= anoAtual; ano++) {
 salarioAtual += salarioAtual * aumento;
 aumento *= 2;
 }
 
 System.out.printf("O salário atual do funcionário é: R$ %.2f\n", salarioAtual);
 teclado.close();
 }
}
