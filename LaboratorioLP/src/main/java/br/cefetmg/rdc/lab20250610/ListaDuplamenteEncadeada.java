package br.cefetmg.rdc.lab20250610;

class No {
    int valor;
    No proximo;
    No anterior;

    public No(int valor) {
        this.valor = valor;
    }
}

public class ListaDupla {
    private No inicio;
    private No fim;
    private int tamanho;

    public void inserirInicio(int item) {
        No novo = new No(item);
        novo.proximo = inicio;
        if (inicio != null) {
            inicio.anterior = novo;
        } else {
            fim = novo;
        }
        inicio = novo;
        tamanho++;
    }

    public void inserirFim(int item) {
        No novo = new No(item);
        novo.anterior = fim;
        if (fim != null) {
            fim.proximo = novo;
        } else {
            inicio = novo;
        }
        fim = novo;
        tamanho++;
    }

    public boolean inserirPosicao(int posicao, int item) {
        if (posicao < 0 || posicao > tamanho) return false;
        if (posicao == 0) {
            inserirInicio(item);
            return true;
        }
        if (posicao == tamanho) {
            inserirFim(item);
            return true;
        }
        No atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        No novo = new No(item);
        novo.proximo = atual;
        novo.anterior = atual.anterior;
        atual.anterior.proximo = novo;
        atual.anterior = novo;
        tamanho++;
        return true;
    }

    public Integer removerInicio() {
        if (inicio == null) return null;
        int valor = inicio.valor;
        inicio = inicio.proximo;
        if (inicio != null) {
            inicio.anterior = null;
        } else {
            fim = null;
        }
        tamanho--;
        return valor;
    }

    public Integer removerFim() {
        if (fim == null) return null;
        int valor = fim.valor;
        fim = fim.anterior;
        if (fim != null) {
            fim.proximo = null;
        } else {
            inicio = null;
        }
        tamanho--;
        return valor;
    }

    public Integer removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) return null;
        if (posicao == 0) return removerInicio();
        if (posicao == tamanho - 1) return removerFim();
        No atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        atual.anterior.proximo = atual.proximo;
        atual.proximo.anterior = atual.anterior;
        tamanho--;
        return atual.valor;
    }

    public Integer obterInicio() {
        return (inicio != null) ? inicio.valor : null;
    }

    public Integer obterFim() {
        return (fim != null) ? fim.valor : null;
    }

    public Integer obterPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) return null;
        No atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
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
