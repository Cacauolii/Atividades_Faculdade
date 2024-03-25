public class Licao4 {
public static void main(String[] args) {
    double habitantesA = 80000;
    double habitantesB = 200000;
    double taxaCrescimentoA = 0.03;
    double taxaCrescimentoB = 0.015;
    int anos = 0;

    while(habitantesA<habitantesB){
      habitantesA *= (1 + taxaCrescimentoA);
      habitantesB *= (1 + taxaCrescimentoB);
      anos++;
    }
    System.out.println("O número de anos necessarios para que A ultrapasse B é: " + anos + " anos");
}
}
