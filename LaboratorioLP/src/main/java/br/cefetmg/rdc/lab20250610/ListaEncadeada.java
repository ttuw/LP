package br.cefetmg.rdc.lab20250610;

class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
    }
}

public class ListaEncadeada {
    private No inicio;
    private int tamanho;

    public void inserirInicio(int item) {
        No novo = new No(item);
        novo.proximo = inicio;
        inicio = novo;
        tamanho++;
    }

    public void inserirFim(int item) {
        No novo = new No(item);
        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) atual = atual.proximo;
            atual.proximo = novo;
        }
        tamanho++;
    }

    public boolean inserirPosicao(int posicao, int item) {
        if (posicao < 0 || posicao > tamanho) return false;
        if (posicao == 0) {
            inserirInicio(item);
            return true;
        }
        No novo = new No(item);
        No atual = inicio;
        for (int i = 0; i < posicao - 1; i++) atual = atual.proximo;
        novo.proximo = atual.proximo;
        atual.proximo = novo;
        tamanho++;
        return true;
    }

    public Integer removerInicio() {
        if (inicio == null) return null;
        int valor = inicio.valor;
        inicio = inicio.proximo;
        tamanho--;
        return valor;
    }

    public Integer removerFim() {
        if (inicio == null) return null;
        if (inicio.proximo == null) {
            int valor = inicio.valor;
            inicio = null;
            tamanho--;
            return valor;
        }
        No atual = inicio;
        while (atual.proximo.proximo != null) atual = atual.proximo;
        int valor = atual.proximo.valor;
        atual.proximo = null;
        tamanho--;
        return valor;
    }

    public Integer removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) return null;
        if (posicao == 0) return removerInicio();
        No atual = inicio;
        for (int i = 0; i < posicao - 1; i++) atual = atual.proximo;
        int valor = atual.proximo.valor;
        atual.proximo = atual.proximo.proximo;
        tamanho--;
        return valor;
    }

    public Integer obterInicio() {
        return (inicio != null) ? inicio.valor : null;
    }

    public Integer obterFim() {
        if (inicio == null) return null;
        No atual = inicio;
        while (atual.proximo != null) atual = atual.proximo;
        return atual.valor;
    }

    public Integer obterPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) return null;
        No atual = inicio;
        for (int i = 0; i < posicao; i++) atual = atual.proximo;
        return atual.valor;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int pesquisar(int item) {
        No atual = inicio;
        int i = 0;
        while (atual != null) {
            if (atual.valor == item) return i;
            atual = atual.proximo;
            i++;
        }
        return -1;
    }

    public int tamanho() {
        return tamanho;
    }
}
