import java.util.Scanner;
public class Licao35 {
 public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
 System.out.print("Digite um número inteiro: ");
 int limite = teclado.nextInt();
 
 System.out.println("Números primos entre 1 e " + limite + ":");
 for (int i = 2; i <= limite; i++) {
 if (isPrimo(i)) {
 System.out.print(i + " ");
 }
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
