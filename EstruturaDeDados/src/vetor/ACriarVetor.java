package vetor;

public class ACriarVetor {


    public static void main(String[] args) {

        // Criando um vetor com 10 posições. Alocando memória para armazenar 10 inteiros.
        int[] vetor1 = new int[10];
        vetor1[0] = 10;
        vetor1[1] = 3;
        vetor1[2] = 7;

        // Criar vetor já instanciando com valores
        int[] vetor2 = {1, 2, 3, 4, 5, 6};

        //tamanho do vetor
        System.out.println(vetor1.length);
        System.out.println(vetor2.length);

    }


}
