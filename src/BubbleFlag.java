// Bubble Sort com flag de parada — versão otimizada do Bubble Sort
public class BubbleFlag {
    public static void sort(int[] v, int n) {
        Util.zerarContadores();
        boolean trocou = true;

        // O laço continua enquanto houver trocas
        for (int i = 0; i < n - 1 && trocou; i++) {
            trocou = false;
            for (int j = 0; j < n - i - 1; j++) {
                Util.interacoes++;
                // Compara elementos adjacentes e troca se estiver fora de ordem
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    Util.trocas++;
                    trocou = true; // marca que houve troca
                }
            }
        }
    }
}
