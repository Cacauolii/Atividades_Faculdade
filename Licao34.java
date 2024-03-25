import java.util.Scanner;
public class Licao34 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int numero = teclado.nextInt();
    
    if (isPrimo(numero)) {
    System.out.println(numero + " é um número primo.");
    } else {
    System.out.println(numero + " não é um número primo.");
    }
    
    teclado.close();
    }
    
    public static boolean isPrimo(int numero) {
    if (numero <= 1) {
    return false;
    }
    for (int i = 2; i <= Math.sqrt(numero); i++) {
    if (numero % i == 0) {
    return false;
    }
    }
    return true;
    }
   }
