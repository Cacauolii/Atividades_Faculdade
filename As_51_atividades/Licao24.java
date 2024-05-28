package As_51_atividades;
import java.util.Scanner;
public class Licao24 {
 public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Escreva a quantidade de notas: ");
    int nota = teclado.nextInt();
    double media = 0.0;

    for(int i=1;i<=nota; i++){
        System.out.print("Notas " + i + ":");
        double notas = teclado.nextDouble();
        media += notas;
    }
    double total = media/nota;
    teclado.close();
    System.out.println("A média das notas é: " + total);
 }
}
