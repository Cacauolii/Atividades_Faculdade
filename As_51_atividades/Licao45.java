package As_51_atividades;
import java.util.Scanner;
public class Licao45 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String chave = "ABCDEEDCBAA";
        int totalEstudantes = 0;
        int menorNota = 0;
        int maiorNota = Integer.MAX_VALUE;
        int notasTotais= 0;
    
            while (true) {
                int notaEstudante = 0;
                for (int i = 0; i < 10; i++) {
                    System.out.print("Responda a pergunta " + (i + 1) + " (A/B/C/D/E): ");
                    String respostaEstudante = teclado.next().toUpperCase();
                    if (respostaEstudante.equals(chave.charAt(i) + "")) {
                        notaEstudante++;
                    }
                }
    
                maiorNota = Math.max(maiorNota,notaEstudante);
                menorNota = Math.min(menorNota, notaEstudante);
                notasTotais += notaEstudante;
                totalEstudantes++;
    
                System.out.print("Outro estudante? (S/N): ");
                String outroEstudante = teclado.next().toLowerCase();
                if (!outroEstudante.equals("S")) {
                    break;
                }
            }
    
            double media = (double) notasTotais / totalEstudantes;
    
            System.out.println("\nResultado exames:");
            System.out.println("Total estudantes: " + totalEstudantes);
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
            System.out.println("Media notas: " + String.format("%.2f", media));
    
            teclado.close();
        }
    }

