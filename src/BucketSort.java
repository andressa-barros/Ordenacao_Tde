public class BucketSort {
    public static void sort(int[] v, int n) {
        Util.zerarContadores();

        int[][] baldes = new int[10][n];
        int[] cont = new int[10];

        // Distribui os valores
        for (int i = 0; i < n; i++) {
            Util.interacoes++;
            int indice = v[i] / 10; // agrupa por faixa de valor
            baldes[indice][cont[indice]] = v[i];
            cont[indice]++;
        }

        // Ordena cada balde (bubble sort)
        for (int b = 0; b < 10; b++) {
            for (int i = 0; i < cont[b] - 1; i++) {
                for (int j = 0; j < cont[b] - i - 1; j++) {
                    Util.interacoes++;
                    if (baldes[b][j] > baldes[b][j + 1]) {
                        int aux = baldes[b][j];
                        baldes[b][j] = baldes[b][j + 1];
                        baldes[b][j + 1] = aux;
                        Util.trocas++;
                    }
                }
            }
        }

        // Junta tudo
        int pos = 0;
        for (int b = 0; b < 10; b++) {
            for (int i = 0; i < cont[b]; i++) {
                v[pos] = baldes[b][i];
                pos++;
            }
        }
    }
}
