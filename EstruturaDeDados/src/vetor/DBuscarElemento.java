package vetor;

// Buscar elemento em um vetor pelo Valor
public class DBuscarElemento {

    public static void main(String[] args) {

        int[] vetor = {10, 25, 42, 55, 24, 77, 68, 9, 47, 66, 2019};


        int valorQueEuQueroBuscar = 9;

        for (int i=0;i<vetor.length;i++) {
            if (vetor[i] == valorQueEuQueroBuscar) {
                System.out.println("Está na posição: " + i);
            }
        }
        // Transformar em uma função.
        // Função recebe como parametro o Vetor e o valor a ser buscado.
        // Função retorna a posição do valor no vetor (índice)

    }

}
