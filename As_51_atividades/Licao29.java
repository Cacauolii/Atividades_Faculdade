package As_51_atividades;
public class Licao29 {
    public static void main(String[] args) {
        double produtos = 0.0;
        double valor = 1.99;
        for(int i = 1; i<=50; i++){
            System.out.println(i + ": R$ " + String.format("%.2f" , produtos));
            produtos += valor;
        }     
 }

}
