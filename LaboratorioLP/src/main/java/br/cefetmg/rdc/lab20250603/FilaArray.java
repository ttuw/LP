public class FilaArray {
    int [] fila;
    int finalFila;

    FilaArray(int tamanho){
        fila = new int[tamanho];
        finalFila = 0;
    }

    void enfileirar(int item){
        if (finalFila < fila.length){
            this.fila [finalFila] = item;
            finalFila ++;
        }
        else {
            nfila = new int[finalFila+10];
            for (int i = 0; i <= finalFila; i++){
                nfila[i] = fila[i];

            }
            fila = nfila;
            fila [finalFila] = item;
            finalFila++;
        }
    }

    void desenfileirar(){
        if (finalFila > 0){
            System.out.printf("item desenfileirado: %d", fila[i]);
            for (int i = 0; < finalFila; i++){
                fila[i] = fila[i + 1];
            }
            finalFila--;
        }
    }

    boolean estaVazia(){
        return finalFila == 0;
    }

    void tamanho(){
        System.out.printf("tamanho: %d", finalFila);
    }
}