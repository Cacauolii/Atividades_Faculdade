package As_51_atividades;
import java.util.Scanner;
public class Licao47 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Digite o nome do ginasta: ");
        String nomeGinasta = teclado.nextLine();
    
        double melhorNota = Double.MIN_VALUE;
        double piorNota = Double.MAX_VALUE;
        double totalNotas = 0;
    
            for (int i = 1; i <= 7; i++) {
                System.out.print("Digite a nota do jurado " + i + ": ");
                double nota = teclado.nextDouble();
                totalNotas += nota;
    
                if (nota > melhorNota) {
                    melhorNota = nota;
                }
                if (nota < piorNota) {
                    piorNota = nota;
                }
            }
    
            double mediaNotas = (totalNotas - melhorNota - piorNota) / 5;
    
            System.out.println("\nResultado final:");
            System.out.println("Atleta: " + nomeGinasta);
            System.out.println("Melhor nota: " + melhorNota);
            System.out.println("Pior nota: " + piorNota);
            System.out.println("Média: " + String.format("%.2f", mediaNotas));
    
            teclado.close();
        }
    }
