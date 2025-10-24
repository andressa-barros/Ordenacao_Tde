// Bubble Sort simples — repete até não haver mais trocas
public class BubbleSort {
    public static void sort(int[] v, int n) {
        boolean trocou;
        do {
            trocou = false;
            // Percorre o vetor comparando elementos vizinhos
            for (int i = 0; i < n - 1; i++) {
                if (v[i] > v[i + 1]) {
                    int aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                    trocou = true;
                }
            }
        } while (trocou); // para quando não houver mais trocas
    }
}
