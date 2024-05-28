package As_51_atividades;
import java.util.Scanner;
public class Licao44 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int candidato1Votos = 0;
        int candidato2Votos = 0;
        int candidato3Votos = 0;
        int candidato4Votos = 0;
        int nulos = 0;
        int brancos = 0;
    
        System.out.println("Sistema de votação de eleição");
        System.out.println("1 - Candidato 1");
        System.out.println("2 - Candidato 2");
        System.out.println("3 - Candidato 3");
        System.out.println("4 - Candidato 4");
        System.out.println("5 - Nulos Votos");
        System.out.println("6 - Brancos Votos");
        System.out.println("Digite os votos (0 pra encerrar):");
    
            int voto;
            do {
                voto = teclado.nextInt();
                switch (voto) {
                    case 1:
                        candidato1Votos++;
                        break;
                    case 2:
                        candidato2Votos++;
                        break;
                    case 3:
                        candidato3Votos++;
                        break;
                    case 4:
                        candidato4Votos++;
                        break;
                    case 5:
                        nulos++;
                        break;
                    case 6:
                        brancos++;
                        break;
                    default:
                        System.out.println("Voto invalido, tente um entre esses números(1-6).");
                }
            } while (voto != 0);
    
            int totalVotos = candidato1Votos + candidato2Votos + candidato3Votos + candidato4Votos + nulos + brancos;
    
            System.out.println("\nResultado eleição:");
            System.out.println("Candidato 1: " + candidato1Votos + " votos");
            System.out.println("Candidato 2: " + candidato2Votos + " votos");
            System.out.println("Candidato 3: " + candidato3Votos + " votos");
            System.out.println("Candidato 4: " + candidato4Votos + " votos");
            System.out.println("Votos nulos: " + nulos);
            System.out.println("Votos brancos: " + brancos);
            System.out.println("Porcentagem de votos nulos: " + (nulos * 100.0 / totalVotos) + "%");
            System.out.println("Porcentagem de votos brancos: " + (brancos * 100.0 / totalVotos) + "%");
    
            teclado.close();
        }
    }
