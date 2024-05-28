package As_51_atividades;
import java.util.Scanner;
public class Licao10 {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
     System.out.print("Digite o número: ");
     int n1 = teclado.nextInt();
     System.out.print("Digite o número: ");
     int n2 = teclado.nextInt();
     int menor = Math.min(n1, n2);
     int maior = Math.max(n1, n2);
    for(int n= menor; n<=maior; n++){
     System.out.println(n + " ");
    }
     teclado.close();
   }
}
