import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class atividade5 {
    private static final int[] row = {-1, 1, 0, 0};
    private static final int[] col = {0, 0, -1, 1};

    public static int caminhoMaisCurto(int[][] labirinto) {
        int n = labirinto.length;
        int m = labirinto[0].length;

        if (labirinto[0][0] == 1 || labirinto[n - 1][m - 1] == 1) {
            return -1;
        }

        boolean[][] visitado = new boolean[n][m];
        visitado[0][0] = true;

        Queue<Pair> fila = new LinkedList<>();
        fila.add(new Pair(0, 0));

        int comprimentoCaminho = 0;

        while (!fila.isEmpty()) {
            int tamanho = fila.size();
            comprimentoCaminho++;

            for (int i = 0; i < tamanho; i++) {
                Pair atual = fila.poll();
                int x = atual.x, y = atual.y;

                if (x == n - 1 && y == m - 1) {
                    return comprimentoCaminho;
                }

                for (int k = 0; k < 4; k++) {
                    int novoX = x + row[k];
                    int novoY = y + col[k];

                    if (novoX >= 0 && novoX < n && novoY >= 0 && novoY < m &&
                        labirinto[novoX][novoY] == 0 && !visitado[novoX][novoY]) {
                        visitado[novoX][novoY] = true;
                        fila.add(new Pair(novoX, novoY));
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] labirinto = {
            {0, 1, 0, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0}
        };

        int resultado = caminhoMaisCurto(labirinto);
        System.out.println("O comprimento do caminho mais curto é: " + resultado);
    }
}