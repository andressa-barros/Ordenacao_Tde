// Classe auxiliar para contar trocas e interações
public class Util {
    public static int trocas;
    public static int interacoes;

    // Copia um vetor para outro
    public static void copiarVetor(int[] origem, int[] destino, int n) {
        for (int i = 0; i < n; i++) {
            destino[i] = origem[i];
        }
    }

    // Reseta os contadores antes de cada execução
    public static void zerarContadores() {
        trocas = 0;
        interacoes = 0;
    }
}
