import java.util.Scanner;
public class atividade2 {
    public static boolean Palindromo(String str){
        str = str.replaceAll("\\s+" , "").toLowerCase();

        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a palavra: ");
        String palavra = teclado.nextLine();

        if(Palindromo(palavra)){
            System.out.println("\"" + palavra + "\" é um palíndromo.");
        }else{
            System.out.println("\"" + palavra + "\" não é um palíndromo");
        }
        teclado.close();
    }
}
