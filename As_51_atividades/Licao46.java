package As_51_atividades;
 import java.util.Scanner;
public class Licao46 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Digite o nome do atleta: ");
        String nomeAtleta = teclado.nextLine();
    
        double salto1, salto2, salto3, salto4, salto5;
        System.out.print("Digite a distância do 1º salto (em metros): ");
        salto1 = teclado.nextDouble();
        System.out.print("Digite a distância do 2º salto (em metros): ");
        salto2 = teclado.nextDouble();
        System.out.print("Digite a distância do 3º salto (em metros): ");
        salto3 = teclado.nextDouble();
        System.out.print("Digite a distância do 4º salto (em metros): ");
        salto4 = teclado.nextDouble();
        System.out.print("Digite a distância do 5º salto (em metros): ");
        salto5 = teclado.nextDouble();
    
        double melhorSalto = Math.max(Math.max(salto1, salto2), Math.max(salto3, salto4));
        double piorSalto = Math.min(Math.min(salto1, salto2), Math.min(salto3, salto4));
    
        double mediaSaltos = (salto1 + salto2 + salto3 + salto4 + salto5 - melhorSalto - piorSalto) / 3;
    
        System.out.println("\nResultado final:");
        System.out.println(nomeAtleta + ": " + String.format("%.2f", mediaSaltos) + " m");
    
       teclado.close();
        }
    }

