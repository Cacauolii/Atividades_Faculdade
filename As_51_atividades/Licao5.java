package As_51_atividades;
import java.util.Scanner;

public class Licao5 {
 public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double habitantesA , habitantesB , taxaCrescimentoA , taxaCrescimentoB;
    int anos = 0;
    do{
      System.out.print("Informe a quantidade de habitantes A: ");
      habitantesA = teclado.nextDouble();
    System.out.print("Informe a taxa de crescimento A: ");
      taxaCrescimentoA = teclado.nextDouble();
     System.out.print("Informe a quantidade de habitantes B: ");
      habitantesB = teclado.nextDouble();
     System.out.print("Informe a taxa de crescimento B: ");
      taxaCrescimentoB = teclado.nextDouble();
      if(habitantesA<=0 || habitantesB<=0 || taxaCrescimentoA<0 || taxaCrescimentoB<0){
        System.out.println("Números invalidos");
      }
    }while(habitantesA<=0 || habitantesB<=0 || taxaCrescimentoA<0 || taxaCrescimentoB<0);

    while(habitantesA<habitantesB){
     habitantesA *= (1 + taxaCrescimentoA);
     habitantesB *= (1 + taxaCrescimentoB);
     anos++;
    }
     System.out.println("O número de anos necessarios para que A ultrapasse B é: " + anos + "anos");

     System.out.println("Repetir a operação? (s/n) ");
     String resposta = teclado.next();
   if(!resposta.equalsIgnoreCase("s")){
        System.out.println("Encerrando"); 
    }
    teclado.close(); 
    }
}
