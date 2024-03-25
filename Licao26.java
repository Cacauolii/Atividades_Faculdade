import java.util.Scanner;
public class Licao26 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite o número total de eleitores: ");
    int eleitores = teclado.nextInt();
    int totalCadidato1 = 0;
    int totalCadidato2 = 0;
    int totalCadidato3 = 0;

    for(int i= 1; i<=eleitores; i++){
       System.out.print("Eleitor " + i + ": Digite o seu voto(1, 2 ou 3): ");
       int voto = teclado.nextInt();

       switch (voto) {
        case 1:
            totalCadidato1++;
            break;
        case 2:
           totalCadidato2++;
           break;
        case 3:
           totalCadidato3++;
           break;
        default:
         System.out.println("Voto invalido.");
       }
    }
        System.out.println("Candidato 1 recebeu " + totalCadidato1 + " votos.");
        System.out.println("Candidato 2 recebeu " + totalCadidato2 + " votos.");
        System.out.println("Candidato 3 recebeu " + totalCadidato3 + " votos.");
     teclado.close();
  }
}
