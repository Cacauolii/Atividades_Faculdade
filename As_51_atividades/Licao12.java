package As_51_atividades;
import java.util.Scanner;
public class Licao12 {
 public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Informe o número: ");
    int numero = teclado.nextInt();

    if(numero>=1 && numero<=10){
     System.out.println("Tabuada do " + numero + ": ");
}   for(int n=1;n<=10; n++){
      int resultado = numero * n;
   System.out.println(numero + " X " + n + " = " + resultado);

} teclado.close();



    } 
 }

