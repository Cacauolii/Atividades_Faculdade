package As_51_atividades;
import java.util.Scanner;
public class Licao13 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Informe o primeiro número: ");
    double base= teclado.nextDouble();
    System.out.print("Informe o segundo número: ");
    int expoente = teclado.nextInt();
    double resultado = 1;
    for(int n= 0;n<Math.abs(expoente);n++){
        resultado *= base;
    }
     if(expoente<0){
        resultado = 1/resultado;
     }
       System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
       teclado.close();
  }
}
