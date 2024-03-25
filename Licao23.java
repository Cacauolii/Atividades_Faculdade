import java.util.Scanner;
public class Licao23 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite o número: ");
    int numeros = teclado.nextInt();
    teclado.close();
    int divisores = 0;
    System.out.println("Números primos entre 1 e " + numeros + ":");
    for(int n = 2; n<=numeros; n++){
       boolean primo = true;
    for(int i= 2; i<=Math.sqrt(n); i++){
     divisores++;
     if(n% i==0){
       primo=false;
       break;
     }
    }if(primo){
        System.out.println(n + " ");
    }
    }
    System.out.println("\nA quantidade de divisores executadas é: " + divisores);
  }
}
