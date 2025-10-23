public class CocktailSort {
    public static void sort(int[] v, int n) {
        Util.zerarContadores();
        boolean trocou = true;
        int inicio = 0;
        int fim = n - 1;

        while (trocou) {
            trocou = false;

            for (int i = inicio; i < fim; i++) {
                Util.interacoes++;
                if (v[i] > v[i + 1]) {
                    int aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                    Util.trocas++;
                    trocou = true;
                }
            }
            fim--;

            for (int i = fim; i > inicio; i--) {
                Util.interacoes++;
                if (v[i] < v[i - 1]) {
                    int aux = v[i];
                    v[i] = v[i - 1];
                    v[i - 1] = aux;
                    Util.trocas++;
                    trocou = true;
                }
            }
            inicio++;
        }
    }
}
