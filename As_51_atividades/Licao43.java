package As_51_atividades;
import java.util.Scanner;
public class Licao43 {
     public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     double totalGeral = 0;
     int codigo;
     int quantidade;
     double preco = 0;
     boolean continuar = true;
     System.out.println("Digite o código do item e a quantidade. Digite 0 para encerrar o pedido.");
     while (continuar) {
     System.out.print("Código: ");
     codigo = teclado.nextInt();
     if (codigo == 0) {
     continuar = false;
     break;
     }
     System.out.print("Quantidade: ");
     quantidade = teclado.nextInt();
     switch (codigo) {
     case 100:
     preco = 1.20;
     break;
     case 101:
     preco = 1.30;
     break;
     case 102:
     preco = 1.50;
     break;
     case 103:
     preco = 1.20;
     break;
     case 104:
     preco = 1.30;
     break;
     case 105:
     preco = 1.00;
     break;
     default:
     System.out.println("Código inválido!");
     continue;
     }
     double valorItem = preco * quantidade;
     System.out.printf("Item: %d | Quantidade: %d | Valor: R$ %.2f\n", codigo, quantidade, valorItem);
     totalGeral += valorItem;
     }
     System.out.printf("Total geral do pedido: R$ %.2f\n", totalGeral);
     teclado.close();
     }
    }
