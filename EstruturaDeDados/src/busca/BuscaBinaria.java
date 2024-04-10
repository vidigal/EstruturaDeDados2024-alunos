package busca;

public class BuscaBinaria {

    static int[] vetor = {1, 50, 10, 14, 30, 33, 42, 44, 50, 57};

    public static void main(String[] args) {
        System.out.println("A posição do elemento 42 é: " + buscar(42));
    }

    public static int buscar(int elemento) {
        int inicio = 0;
        int fim = vetor.length-1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (vetor[meio] == elemento) return meio;

            if (vetor[meio] > elemento) {
                fim = meio -1;
            } else {
                inicio = meio + 1;
            }

        }

        return -1;
    }

}