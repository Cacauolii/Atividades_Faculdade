package As_51_atividades;
import java.util.Scanner;
public class Licao39 {
     public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     int numeroDoAluno, numeroDoAlunoMaisAlto = 0, numeroDoAlunoMaisBaixo = 0;
     int altura, alturaDoMaisAlto = 0, alturaDoMaisBaixo = Integer.MAX_VALUE;
     
     for (int i = 1; i <= 10; i++) {
     System.out.println("Digite o número e a altura do aluno " + i + ":");
     System.out.print("Número do aluno: ");
     numeroDoAluno = teclado.nextInt();
     System.out.print("Altura (em cm): ");
     altura = teclado.nextInt();
     
     if (altura > alturaDoMaisAlto) {
     alturaDoMaisAlto = altura;
     numeroDoAlunoMaisAlto = numeroDoAluno;
     }
     
     if (altura < alturaDoMaisBaixo) {
     alturaDoMaisBaixo = altura;
     numeroDoAlunoMaisBaixo = numeroDoAluno;
     }
     }
     
     teclado.close();
     
     System.out.println("O aluno mais alto é o número " + numeroDoAlunoMaisAlto + " com " + alturaDoMaisAlto + "cm");
     System.out.println("O aluno mais baixo é o número " + numeroDoAlunoMaisBaixo + " com " + alturaDoMaisBaixo + 
    "cm");
     }
    }
