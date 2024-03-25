public class Licao41 {
     public static void main(String[] args) {
        double valorDivida = 1000.0;
    
        System.out.println("Valor da Dívida | Valor dos Juros | Quantidade de Parcelas | Valor da Parcela");
        System.out.println("----------------------------------------------------------------------------");
    
        for (int parcelas = 1; parcelas <= 12; parcelas += 3) {
            double juros = valorDivida * (parcelas - 1) * 0.1;
            double totalDivida = valorDivida + juros;
            double valorParcela = totalDivida / parcelas;
    
            System.out.printf("R$ %s | R$ %s | %d | R$ %s%n",
                totalDivida, juros,
                parcelas, valorParcela);
            }
        }
    }

