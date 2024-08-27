import java.util.Scanner;

public class atividade3 {
     public static int fatorial(int n){
     
     if(n<=1){
        return 1;
     }else{
        return n*fatorial(n - 1);
    }
 }
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     System.out.println("Digite um número: ");
     int numero = teclado.nextInt();
     
     if(numero<0){
        System.out.println("Número inválido. Digite novamente");
     }else{
        int resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
     }
     teclado.close();
    }
}