package As_51_atividades;
import java.util.Scanner;
public class Licao30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double produtos = 0.0;
        System.out.print("Escreva o valor do pão: ");
        double valor = teclado.nextDouble();
        
        for(int i = 1; i<=50; i++){
            System.out.println(i + ": R$ " + String.format("%.2f", produtos ));
            produtos += valor;
        }
        teclado.close(); 
 }

}
