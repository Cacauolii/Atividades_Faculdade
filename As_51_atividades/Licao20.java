package As_51_atividades;
import java.util.Scanner;
public class Licao20 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    while (true) {
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        if (numero == -1) {
            break;
        }

        if (numero < 0 || numero >= 16) {
            System.out.println("Número inválido.");
            continue;
        }

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }

    teclado.close();

}
}


