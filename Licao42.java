import java.util.Scanner;
public class Licao42 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int count0_25 = 0;
        int count26_50 = 0;
        int count51_75 = 0;
        int count76_100 = 0;
    
        System.out.print("Digite números positivos (negativo para encerrar):");
          while (true) {
            num = teclado.nextInt();
                if (num < 0) {
                    break;
                }
                if (num >= 0 && num <= 25) {
                    count0_25++;
                } else if (num >= 26 && num <= 50) {
                    count26_50++;
                } else if (num >= 51 && num <= 75) {
                    count51_75++;
                } else if (num >= 76 && num <= 100) {
                    count76_100++;
                }
            }
    
            System.out.println("Quantidade de números nos intervalos:");
            System.out.println("[0-25]: " + count0_25);
            System.out.println("[26-50]: " + count26_50);
            System.out.println("[51-75]: " + count51_75);
            System.out.println("[76-100]: " + count76_100);
    
            teclado.close();
        }
    }
