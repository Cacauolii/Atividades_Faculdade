package As_51_atividades;
import java.util.Scanner;
public class Licao33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double temp;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double soma = 0;
        int contador = 0;

        System.out.println("Digite as temperaturas (digite uma letra para encerrar):");

        while(teclado.hasNextDouble()) {
            temp = teclado.nextDouble();
            if (temp < min) min = temp;
            if (temp > max) max = temp;
            soma += temp;
            contador++;
        }

        teclado.close();

        if (contador > 0) {
            double media = soma / contador;

            System.out.println("Temperatura mínima: " + min + "°C");
            System.out.println("Temperatura máxima: " + max + "°C");
            System.out.println("Média das temperaturas: " + media + "°C");
        } else {
            System.out.println("Nenhuma temperatura foi informada.");
        }
    }
}

