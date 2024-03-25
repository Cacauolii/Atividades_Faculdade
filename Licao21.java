import java.util.Scanner;

public class Licao21 {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     System.out.print("Escreva o número: ");
    int numero = teclado.nextInt();
    boolean primo = true;
    teclado.close();

    if(numero<=1){
        primo=false;
    }else{
        for(int n= 2; n<=Math.sqrt(numero); n++){
         if(numero% n ==0){
            primo = false;
            break;
         }

        }
    }
       if(primo){
        System.out.println(numero + " é um número primo");
       }else{
        System.out.println(numero + " não é um número primo");
       }

    
    }
}
