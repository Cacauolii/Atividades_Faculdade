import java.util.Scanner;
public class Licao3 {
 public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String nome, estadoCivil , sexo;
    double salario;
    int idade;

    do{
      System.out.print("Informe o seu nome: ");
     nome = teclado.nextLine();
    }while(nome.length() <=3);

    do{
     System.out.print("Informe a sua idade: ");
     idade = teclado.nextInt();
    }while(idade<0 || idade>150);

    do{
     System.out.print("Informe o seu salário: ");
     salario = teclado.nextDouble();
     }while(salario<=0);

     do{
      System.out.print("Informe o seu sexo: ");
     sexo = teclado.nextLine();
     }while(!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m"));
     
     do{
     System.out.print("Informe o seu estado civil: ");
      estadoCivil = teclado.nextLine();
    }while(!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d"));
  teclado.close();

    System.out.println(" Nome: " + nome + "\n Idade: " + idade + "\n Salário: " + salario + "\n Sexo: " + sexo + "\n Estado civil: " + estadoCivil);
 } 
}
