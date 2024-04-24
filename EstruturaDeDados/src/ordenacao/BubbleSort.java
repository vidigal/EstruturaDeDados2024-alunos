package ordenacao;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = {3, 1, 5, 2, 8, 9, 0, 7, 4, 6};

        vetor = sort(vetor);

        System.out.println(Arrays.toString(vetor));
    }

    public static int[] sort(int[] vetor) {
        int totalIteracoes = 0;

        for (int j = 0; j < vetor.length; j++) {
            boolean houveTroca = false;
            for (int i = 0; i < vetor.length - j - 1; i++) {
                totalIteracoes++;

                if (vetor[i] > vetor[i + 1]) {
                    int auxiliar = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = auxiliar;
                    houveTroca = true;
                }
            }
            if (!houveTroca) {
                break;
            }
        }


        System.out.println("Quantidade de iterações: " + totalIteracoes);
        return vetor;
    }
}