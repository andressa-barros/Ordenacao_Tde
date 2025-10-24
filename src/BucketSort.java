// Bucket Sort — separa os valores em "baldes" e ordena cada grupo
public class BucketSort {
    public static void sort(int[] v, int n) {
        Util.zerarContadores();

        int[][] baldes = new int[10][n]; // 10 baldes
        int[] cont = new int[10]; // contador de elementos em cada balde

        // 1. Distribui os elementos nos baldes
        for (int i = 0; i < n; i++) {
            Util.interacoes++;
            int indice = v[i] / 10; // define o balde conforme o valor
            baldes[indice][cont[indice]] = v[i];
            cont[indice]++;
        }

        // 2. Ordena cada balde usando Bubble Sort
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

        // 3. Junta os baldes de volta em um único vetor
        int pos = 0;
        for (int b = 0; b < 10; b++) {
            for (int i = 0; i < cont[b]; i++) {
                v[pos] = baldes[b][i];
                pos++;
            }
        }
    }
}
