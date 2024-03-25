import java.util.Scanner;
public class Licao48 {
     public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     System.out.print("Digite um número inteiro positivo: ");
     int numero = teclado.nextInt();
     
     if (numero < 0) {
     System.out.println("O número não é positivo.");
     } else {
     String numeroInvertido = new StringBuilder(String.valueOf(numero)).reverse().toString();
     System.out.println("Número invertido: " + numeroInvertido);
     }
     
     teclado.close();
     }
    }
