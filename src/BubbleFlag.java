public class BubbleFlag {
    public static void sort(int[] v, int n) {
        Util.zerarContadores();
        boolean trocou = true;

        for (int i = 0; i < n - 1 && trocou; i++) {
            trocou = false;
            for (int j = 0; j < n - i - 1; j++) {
                Util.interacoes++;
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    Util.trocas++;
                    trocou = true;
                }
            }
        }
    }
}
