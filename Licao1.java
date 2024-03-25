import java.util.Scanner;

public class Licao1 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int nota;

    do{
       System.out.print("Digite um valor entre 0 e 10: ");
       nota = teclado.nextInt();

       if(nota<0 || nota>10){
        System.out.println("Valor invalido");
       }
    }while(nota<0 || nota>10);

    System.out.println("O valor informado é: " + nota);
    teclado.close();









    }
    }

