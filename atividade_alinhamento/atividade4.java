import java.util.Scanner;

public class atividade4 {

    public static void insercao(int[] array){
        for(int i=1; i< array.length; i++){
            int chave = array[i];
            int n = i-1;
        while (n >= 0 && array[n]> chave){
            array[n+1] = array[n];
            n--;
        } 
            array[n+1] = chave;
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de números:");
        int n = teclado.nextInt();
        int[] array = new int[n];

        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            array[i] = teclado.nextInt();
        }

        insercao(array);

        System.out.println("Ordem crescente:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        teclado.close();
    }
}
