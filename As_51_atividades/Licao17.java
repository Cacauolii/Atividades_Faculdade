package As_51_atividades;
import java.util.Scanner;

public class Licao17 {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Informe o número: ");
    int numero = teclado.nextInt();
    int fatorial = 1;
       
      for(int i=1; i<=numero; i++){
         fatorial *= i;
      }  
        System.out.println("O fatorial de: " + numero + " é " + fatorial);
        teclado.close();
    }   
   }

