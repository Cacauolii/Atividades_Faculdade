package As_51_atividades;
import java.util.Scanner;
public class Licao36 {
 public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
 System.out.print("Montar a tabuada de: ");
 int numero = teclado.nextInt();
 System.out.print("Começar por: ");
 int inicio = teclado.nextInt();
 System.out.print("Terminar em: ");
 int fim = teclado.nextInt();
 if (inicio > fim) {
 System.out.println("O valor inicial não pode ser maior que o valor final.");
 } else {
 System.out.println("Vou montar a tabuada de " + numero + " começando em " + inicio + " e terminando em " + fim + 
":");
 for (int i = inicio; i <= fim; i++) {
 System.out.println(numero + " X " + i + " = " + (numero * i));
 }
 }
 
 teclado.close();
 }
}
