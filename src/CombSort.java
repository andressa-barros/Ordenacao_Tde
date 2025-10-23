public class CombSort {
    public static void sort(int[] v, int n) {
        Util.zerarContadores();

        int gap = n;
        boolean trocou = true;

        while (gap > 1 || trocou) {
            gap = (gap * 10) / 13;
            if (gap < 1) gap = 1;
            trocou = false;

            for (int i = 0; i + gap < n; i++) {
                Util.interacoes++;
                if (v[i] > v[i + gap]) {
                    int aux = v[i];
                    v[i] = v[i + gap];
                    v[i + gap] = aux;
                    Util.trocas++;
                    trocou = true;
                }
            }
        }
    }
}
