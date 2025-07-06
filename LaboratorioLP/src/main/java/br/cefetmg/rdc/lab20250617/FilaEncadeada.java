package br.cefetmg.rdc.lab20250617;

class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
    }
}

public class FilaEncadeada {
    public void enfileirar(int item) {
        No novo = new No(item);
        if (fim != null) {
            fim.proximo = novo;
        }
        fim = novo;
        if (inicio == null) {
            inicio = novo;
        }
        tamanho++;
    }

    public Integer desenfileirar() {
        if (inicio == null) return null;
        int valor = inicio.valor;
        inicio = inicio.proximo;
        if (inicio == null) fim = null;
        tamanho--;
        return valor;
    }

    public Integer obterNoInicio() {
        return (inicio != null) ? inicio.valor : null;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    private No inicio;
    private No fim;
    private int tamanho;
}
