package ordenacao;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] vetor = {6, 10, 5, 7, 6, 4};
        quickSort(vetor, 0, vetor.length-1);
        System.out.println(Arrays.toString(vetor));
    }

    public static void quickSort(int vetor[], int inicio, int fim) {
        if (inicio < fim) {
            int partitionIndex = partition(vetor, inicio, fim);

            quickSort(vetor, inicio, partitionIndex-1);
            quickSort(vetor, partitionIndex+1, fim);
        }
    }

    private static int partition(int arr[], int inicio, int fim) {
        int pivot = arr[fim];
        int i = (inicio-1);

        for (int j = inicio; j < fim; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[fim];
        arr[fim] = swapTemp;

        return i+1;
    }
}