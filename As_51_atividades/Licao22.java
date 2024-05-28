package As_51_atividades;
import java.util.Scanner;
public class Licao22 {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     System.out.print("Escreva o número: ");
    int numero = teclado.nextInt();
    String divisores = " ";
    boolean primo = true;
    teclado.close();

    if(numero<=1){
        primo=false;
    }else{
        for(int n= 2; n<=Math.sqrt(numero); n++){
         if(numero% n ==0){
            primo = false;
          divisores += n + " ";
         }

        }
    }
       if(primo){
        System.out.println(numero + " é um número primo");
       }else{
        System.out.println(numero + " não é um número primo");
        System.out.println("Ele pode ser dividido por: " + divisores);
       }

    
    }
}

