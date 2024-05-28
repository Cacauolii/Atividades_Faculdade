package As_51_atividades;
import java.util.Scanner;
public class Licao18 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Informe a quantidade de numero: ");
    int numeros = teclado.nextInt();
    int menor = Integer.MAX_VALUE;
    int maior = Integer.MIN_VALUE;
    int soma = 0;
    for(int i = 0;i<numeros; i++){
        System.out.print("Digite o " + (i+1) + "º número: ");
        int numero = teclado.nextInt();
        if(numero<menor){
          menor = numero;
        }if(numero>maior){
            maior = numero;
        }
           soma+= numero;
    }
    System.out.println("Menor valor: " + menor);
    System.out.println("Maior valor: " + maior);
    System.out.println("Soma dos valores: " + soma);
    teclado.close();

  }
}
