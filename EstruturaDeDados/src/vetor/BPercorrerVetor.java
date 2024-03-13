package vetor;

public class BPercorrerVetor {

    public static void main(String[] args) {

        int[] vetor = {1, 5, 8, 9, 7, 6};

        // Percorrer array crescente
        for(int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }

        //Percorrer array inverso
        for(int i=vetor.length-1;i>=0;i--){
            System.out.println(vetor[i]);
        }

    }

}
