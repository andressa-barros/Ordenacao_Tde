// Cocktail Sort — uma variação do Bubble Sort que vai e volta no vetor
public class CocktailSort {
    public static void sort(int[] v, int n) {
        Util.zerarContadores();
        boolean trocou = true;
        int inicio = 0;
        int fim = n - 1;

        // Continua enquanto houver trocas
        while (trocou) {
            trocou = false;

            // Percorre da esquerda para a direita
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
            fim--; // reduz o limite direito

            // Percorre da direita para a esquerda
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
            inicio++; // aumenta o limite esquerdo
        }
    }
}
