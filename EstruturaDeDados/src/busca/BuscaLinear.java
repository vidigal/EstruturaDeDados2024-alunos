package busca;

public class BuscaLinear {

    static int[] vetor = {10, 50, 30, 44, 1, 57, 14, 42, 33, 9};

    public static void main(String[] args) {

        System.out.println("A posição do elemento 42 é: " + buscar(42));

    }

    public static int buscar(int elemento) {
        for (int i=0; i< vetor.length;i++) {
            if (vetor[i] == elemento) return i;
        }
        return -1;
    }

}