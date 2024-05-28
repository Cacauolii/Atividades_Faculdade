package As_51_atividades;
import java.util.Scanner;
    public class Licao31 {
     public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     double total, dinheiroRecebido, troco;
     int produto = 1;
     while (true) {
     total = 0.0;
     System.out.println("Lojas Tabajara");
     
     while (true) {
     System.out.print("Produto " + produto + ": ");
     double preco = teclado.nextDouble();
     if (preco == 0) break;
     total += preco;
     System.out.println(preco);
     produto++;
     }
     
     System.out.println("Total: " + total);
     System.out.print("Dinheiro: ");
     dinheiroRecebido = teclado.nextDouble();
     troco = dinheiroRecebido - total;
     System.out.println("Troco: " + troco);
     System.out.println("...");
     produto = 1;
     System.out.print("Iniciar nova compra? (S/N): ");
     String opcao = teclado.next();
     if (!opcao.equalsIgnoreCase("S")) {
     break;
     }
     }
     
     teclado.close();
     }
    }

