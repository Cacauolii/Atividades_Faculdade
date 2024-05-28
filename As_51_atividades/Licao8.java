package As_51_atividades;
import java.util.Scanner;
public class Licao8 {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     double soma = 0;

    for(int n =0;n<5; n++){
      System.out.print("Informe o número " + (n+1) + ": ");
      double numeros = teclado.nextDouble();
      soma+=numeros;
    }
    double media = soma/5;
    System.out.println("A soma dos números é: " + soma);
    System.out.println("A media dos números é: " + media);
    teclado.close();
    }
}