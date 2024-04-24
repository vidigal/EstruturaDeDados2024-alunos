package ordenacao;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] vetor = {10, 6, 8, 5, 7, 3, 4};
        mergeSort(vetor);
    }

    public static void mergeSort(int[] vetor) {
        if (vetor.length < 2) {
            return;
        }

        // Meio do vetor
        int mid = vetor.length / 2;
        int[] esquerda = new int[mid];
        int[] direita = new int[vetor.length - mid];

        // Percorre a metade esquerda
        for (int i = 0; i < mid; i++) {
            esquerda[i] = vetor[i];
        }
        // Percorre a metade direita do vetor
        for (int i = mid; i< vetor.length; i++) {
            direita[i - mid] = vetor[i];
        }

        mergeSort(esquerda);
        mergeSort(direita);

        merge(vetor, esquerda, direita);

        System.out.println(Arrays.toString(vetor));
    }

    public static void merge(int[] vetor, int[] esquerda, int[] direita) {
        int i = 0, j = 0, k = 0;
        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i] <= direita[j]) {
                vetor[k++] = esquerda[i++];
            } else {
                vetor[k++] = direita[j++];
            }
        }

        while (i < esquerda.length) {
            vetor[k++] = esquerda[i++];
        }

        while (j < direita.length) {
            vetor[k++] = direita[j++];
        }

    }
}