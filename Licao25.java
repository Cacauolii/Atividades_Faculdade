import java.util.Scanner;
public class Licao25 {
 public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite a quantidade de pessoas: ");
    int pessoas = teclado.nextInt();
    int media = 0;
     
    for(int i = 1; i<=pessoas; i++){
       System.out.print("Idade " + i + ":");
       int idade = teclado.nextInt();
        media+= idade;    
    }
    double total = media/pessoas; 
    System.out.println("A média de idade da turma é " + total);
    if(total>=0 && total<=25.26){
           System.out.println("A turma é jovem");
        }else if(total>=25.26 && total<=60){
            System.out.println("A turma é adulta");
        }else{
            System.out.println("A turma é idosa");
        }
    teclado.close();
 }
}
