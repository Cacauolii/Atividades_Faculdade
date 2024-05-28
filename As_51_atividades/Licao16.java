package As_51_atividades;
public class Licao16 {
  public static void main(String[] args) {
    int a = 0;
    int b = 1;
    System.out.println(a);
    System.out.println(b);

    while(b<=500){
      int c = a + b;
      System.out.println(c);
            a = b;
            b = c;

       }
    }

  }

