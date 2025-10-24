// Gnome Sort — simples e intuitivo, semelhante ao Insertion Sort
public class GnomeSort {
    public static void sort(int[] v, int n) {
        Util.zerarContadores();
        int i = 0;

        // percorre o vetor e volta um passo sempre que há troca
        while (i < n) {
            Util.interacoes++;
            if (i == 0 || v[i - 1] <= v[i]) {
                i++; // está em ordem, avança
            } else {
                // troca e volta uma posição
                int aux = v[i];
                v[i] = v[i - 1];
                v[i - 1] = aux;
                Util.trocas++;
                i--;
            }
        }
    }
}
