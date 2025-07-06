package br.cefetmg.rdc.lab20250610;

public class ListaArray {
    private int[] dados;
    private int tamanho;

    public ListaArray() {
        dados = new int[10];
        tamanho = 0;
    }

    private void expandir() {
        if (tamanho >= dados.length) {
            int[] novo = new int[dados.length * 2];
            for (int i = 0; i < dados.length; i++) {
                novo[i] = dados[i];
            }
            dados = novo;
        }
    }

    public void inserirInicio(int item) {
        expandir();
        for (int i = tamanho; i > 0; i--) {
            dados[i] = dados[i - 1];
        }
        dados[0] = item;
        tamanho++;
    }

    public void inserirFim(int item) {
        expandir();
        dados[tamanho++] = item;
    }

    public boolean inserirPosicao(int posicao, int item) {
        if (posicao < 0 || posicao > tamanho) return false;
        expandir();
        for (int i = tamanho; i > posicao; i--) {
            dados[i] = dados[i - 1];
        }
        dados[posicao] = item;
        tamanho++;
        return true;
    }

    public Integer removerInicio() {
        if (tamanho == 0) return null;
        int valor = dados[0];
        for (int i = 0; i < tamanho - 1; i++) {
            dados[i] = dados[i + 1];
        }
        tamanho--;
        return valor;
    }

    public Integer removerFim() {
        if (tamanho == 0) return null;
        return dados[--tamanho];
    }

    public Integer removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) return null;
        int valor = dados[posicao];
        for (int i = posicao; i < tamanho - 1; i++) {
            dados[i] = dados[i + 1];
        }
        tamanho--;
        return valor;
    }

    public Integer obterInicio() {
        return (tamanho > 0) ? dados[0] : null;
    }

    public Integer obterFim() {
        return (tamanho > 0) ? dados[tamanho - 1] : null;
    }

    public Integer obterPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) return null;
        return dados[posicao];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int pesquisar(int item) {
        for (int i = 0; i < tamanho; i++) {
            if (dados[i] == item) return i;
        }
        return -1;
    }

    public int tamanho() {
        return tamanho;
    }
}
