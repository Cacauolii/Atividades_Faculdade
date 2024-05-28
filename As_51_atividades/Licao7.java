package As_51_atividades;
import java.util.Scanner;
public class Licao7 {
public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
 double maior = Double.MIN_VALUE;
 for(int i=0; i<5; i++){
   System.out.print("Digite o número: " + (i+1) + ": ");
   double numeros = teclado.nextDouble();
   if(numeros>maior){
    maior=numeros;
   }
  } System.out.print("O maior número é: " + maior);
  teclado.close();
    }
 }


