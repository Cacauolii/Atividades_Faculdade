package As_51_atividades;
import java.util.Scanner;

public class Licao2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
 String nome , senha;

  do{
    System.out.print("Informe o seu nome: ");
    nome = teclado.nextLine();
    System.out.print("Informe a senha: ");
    senha = teclado.nextLine();
   
   if(nome.equalsIgnoreCase(senha)){
    System.out.println("Nome e senha invalidos");

   }
}while(nome.equalsIgnoreCase(senha));
    System.out.println("Nome: " + nome + " - Senha: " + senha);
teclado.close();
}
} 
 


  
 


 

