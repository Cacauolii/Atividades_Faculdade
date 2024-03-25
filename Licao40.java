import java.util.Scanner;
public class Licao40 {
     public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     int codigoCidade;
     int numeroVeiculos;
     int numeroAcidentes;
     int cidadeComMaisAcidentes = 0, cidadeComMenosAcidentes = 0;
     int maiorIndiceAcidentes = 0, menorIndiceAcidentes = Integer.MAX_VALUE;
     int somaVeiculos = 0, somaAcidentesCidadesMenos2000 = 0, contadorCidadesMenos2000 = 0;
     
     for (int i = 1; i <= 5; i++) {
     System.out.println("Digite os dados da cidade " + i + ":");
     System.out.print("Código da cidade: ");
     codigoCidade = teclado.nextInt();
     System.out.print("Número de veículos de passeio: ");
     numeroVeiculos = teclado.nextInt();
     System.out.print("Número de acidentes de trânsito com vítimas: ");
     numeroAcidentes = teclado.nextInt();
     
     int indiceAcidentes = numeroAcidentes * 1000 / numeroVeiculos;
     
     if (indiceAcidentes > maiorIndiceAcidentes) {
     maiorIndiceAcidentes = indiceAcidentes;
     cidadeComMaisAcidentes = codigoCidade;
     }
     if (indiceAcidentes < menorIndiceAcidentes) {
     menorIndiceAcidentes = indiceAcidentes;
     cidadeComMenosAcidentes = codigoCidade;
     }
     
     somaVeiculos += numeroVeiculos;
     
     if (numeroVeiculos < 2000) {
     somaAcidentesCidadesMenos2000 += numeroAcidentes;
     contadorCidadesMenos2000++;
     }
     }
     
     teclado.close();
     
     double mediaVeiculos = (double) somaVeiculos / 5;
     double mediaAcidentesCidadesMenos2000 = contadorCidadesMenos2000 > 0 ? (double) 
    somaAcidentesCidadesMenos2000 / contadorCidadesMenos2000 : 0;
     
     System.out.println("Cidade com maior índice de acidentes: Código " + cidadeComMaisAcidentes + " com índice de " + 
    maiorIndiceAcidentes);
     System.out.println("Cidade com menor índice de acidentes: Código " + cidadeComMenosAcidentes + " com índice de " + 
    menorIndiceAcidentes);
     System.out.println("Média de veículos nas cinco cidades: " + mediaVeiculos);
     System.out.println("Média de acidentes nas cidades com menos de 2.000 veículos: " + 
    mediaAcidentesCidadesMenos2000);
     }
    }
