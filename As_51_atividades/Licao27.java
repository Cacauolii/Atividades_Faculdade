package As_51_atividades;
import java.util.Scanner;
public class Licao27 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite a quantidade de turmas: ");
    int turmas = teclado.nextInt();
    int totalAlunos = 0;
    for(int i = 1; i<=turmas; i++){
       System.out.print("Digite a quantidade de alunos na turma: " + i + ": ");
    int alunos = teclado.nextInt();
    while(alunos>40){
        System.out.println("Número de alunos invalido.");
        System.out.print("Digite o número de alunos na turma " + i + ": ");
    alunos= teclado.nextInt();
    }
    totalAlunos += alunos;
    }
    double media = totalAlunos/turmas;
    System.out.println("A média dos alunos é: " + media);
    teclado.close();

  }
}
