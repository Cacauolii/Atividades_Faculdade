import java.util.Scanner;
public class Licao14 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int pares = 0;
    int impares = 0;
    for(int n=0;n<10;n++){
       System.out.print("Informe os números: ");
       int numeros = teclado.nextInt();
       if(n% 2 == 0){
         pares++;
        }else{
            impares++;
        }
    } System.out.println("Quantidade de numéros pares: " + pares);
      System.out.println("Quantidade de numéros impares: " + impares);
      teclado.close();
    
  }
}
