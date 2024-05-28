package As_51_atividades;
import java.util.Scanner;
public class Licao32 {
public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
 System.out.print("Fatorial de: ");
 int numero = teclado.nextInt();
 int fatorial = 1;
 String detalheCalculo = "";
 for (int i = numero; i > 0; i--) {
 fatorial *= i;
 detalheCalculo += (i > 1) ? i + " . " : i;
 }
 System.out.println(numero + "! = " + detalheCalculo + " = " + fatorial);
 teclado.close();
 }
}


