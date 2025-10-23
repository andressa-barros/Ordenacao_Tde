public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        testarTodos("Vetor 1", vetor1);
        testarTodos("Vetor 2", vetor2);
        testarTodos("Vetor 3", vetor3);
    }

    public static void testarTodos(String nome, int[] original) {
        System.out.println("\n===== " + nome + " =====");
        int n = 20;
        int[] v = new int[n];

        Util.copiarVetor(original, v, n);
        CombSort.sort(v, n);
        System.out.println("Comb Sort -> Trocas: " + Util.trocas + ", Interações: " + Util.interacoes);

        Util.copiarVetor(original, v, n);
        GnomeSort.sort(v, n);
        System.out.println("Gnome Sort -> Trocas: " + Util.trocas + ", Interações: " + Util.interacoes);

        Util.copiarVetor(original, v, n);
        BucketSort.sort(v, n);
        System.out.println("Bucket Sort -> Trocas: " + Util.trocas + ", Interações: " + Util.interacoes);

        Util.copiarVetor(original, v, n);
        BubbleFlag.sort(v, n);
        System.out.println("Bubble (Flag) -> Trocas: " + Util.trocas + ", Interações: " + Util.interacoes);

        Util.copiarVetor(original, v, n);
        SelectionSort.sort(v, n);
        System.out.println("Selection Sort -> Trocas: " + Util.trocas + ", Interações: " + Util.interacoes);

        Util.copiarVetor(original, v, n);
        CocktailSort.sort(v, n);
        System.out.println("Cocktail Sort -> Trocas: " + Util.trocas + ", Interações: " + Util.interacoes);
    }
}
