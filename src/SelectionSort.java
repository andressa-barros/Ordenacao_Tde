public class SelectionSort {
    public static void sort(int[] v, int n) {
        Util.zerarContadores();

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                Util.interacoes++;
                if (v[j] < v[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int aux = v[i];
                v[i] = v[min];
                v[min] = aux;
                Util.trocas++;
            }
        }
    }
}
