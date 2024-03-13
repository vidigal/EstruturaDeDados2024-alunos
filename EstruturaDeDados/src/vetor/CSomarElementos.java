package vetor;

public class CSomarElementos {

    public static void main(String[] args) {
        int[] vetor = {1, 5, 10 ,15 ,20};

        int soma = 0;
        for (int i = 0;i<vetor.length;i++) {
            soma += vetor[i];
        }

        System.out.println("A soma é: " + soma);

        float media = (float) soma/vetor.length;
        System.out.println("A média é: " + media );

    }




}
