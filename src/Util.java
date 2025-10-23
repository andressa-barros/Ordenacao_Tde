public class Util {
    public static int trocas;
    public static int interacoes;

    public static void copiarVetor(int[] origem, int[] destino, int n) {
        for (int i = 0; i < n; i++) {
            destino[i] = origem[i];
        }
    }

    public static void zerarContadores() {
        trocas = 0;
        interacoes = 0;
    }
}
