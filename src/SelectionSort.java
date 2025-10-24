// Selection Sort — busca o menor elemento e coloca no início
public class SelectionSort {
    public static void sort(int[] v, int n) {
        Util.zerarContadores();

        // percorre todo o vetor
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            // encontra o menor valor do restante do vetor
            for (int j = i + 1; j < n; j++) {
                Util.interacoes++;
                if (v[j] < v[min]) {
                    min = j;
                }
            }
            // faz a troca se encontrou elemento menor
            if (min != i) {
                int aux = v[i];
                v[i] = v[min];
                v[min] = aux;
                Util.trocas++;
            }
        }
    }
}
