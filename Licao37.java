import java.util.Scanner;
public class Licao37 {
 public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
 int codigo;
 double altura, peso;
 int codigoAlto = 0, codigoBaixo = 0, codigoGordo = 0, codigoMagro = 0;
 double maisAlto = 0, maisBaixo = Double.MAX_VALUE, maisGordo = 0, maisMagro = Double.MAX_VALUE;
 double somaAlturas = 0, somaPesos = 0;
 int totalClientes = 0;
 
 System.out.println("Digite o código, altura e peso do cliente (0 para encerrar):");
 
 while (true) {
 System.out.print("Código: ");
 codigo = teclado.nextInt();
 if (codigo == 0) break;
 
 System.out.print("Altura: ");
 altura = teclado.nextDouble();
 
 System.out.print("Peso: ");
 peso = teclado.nextDouble();
 
 if (altura > maisAlto) {
 maisAlto = altura;
 codigoAlto = codigo;
 }
 if (altura < maisBaixo) {
 maisBaixo = altura;
 codigoBaixo = codigo;
 }
 if (peso > maisGordo) {
 maisGordo = peso;
 codigoGordo = codigo;
 }
 if (peso < maisMagro) {
 maisMagro = peso;
 codigoMagro = codigo;
 }
 
 somaAlturas += altura;
 somaPesos += peso;
 totalClientes++;
 }
 
 teclado.close();
 
 double mediaAltura = somaAlturas / totalClientes;
 double mediaPeso = somaPesos / totalClientes;
 
 System.out.println("Cliente mais alto: Código " + codigoAlto + " com " + maisAlto + "m");
 System.out.println("Cliente mais baixo: Código " + codigoBaixo + " com " + maisBaixo + "m");
 System.out.println("Cliente mais gordo: Código " + codigoGordo + " com " + maisGordo + "kg");
 System.out.println("Cliente mais magro: Código " + codigoMagro + " com " + maisMagro + "kg");
 System.out.println("Média das alturas: " + mediaAltura + "m");
 System.out.println("Média dos pesos: " + mediaPeso + "kg");
 }
}
