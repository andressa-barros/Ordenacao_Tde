public class GnomeSort {
    public static void sort(int[] v, int n) {
        Util.zerarContadores();
        int i = 0;

        while (i < n) {
            Util.interacoes++;
            if (i == 0 || v[i - 1] <= v[i]) {
                i++;
            } else {
                int aux = v[i];
                v[i] = v[i - 1];
                v[i - 1] = aux;
                Util.trocas++;
                i--;
            }
        }
    }
}
