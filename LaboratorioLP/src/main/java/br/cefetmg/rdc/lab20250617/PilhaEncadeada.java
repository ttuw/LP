package br.cefetmg.rdc.lab20250617;

class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
    }
}

public class PilhaEncadeada {
    private No topo;
    private int tamanho;

    public void empilhar(int item) {
        No novo = new No(item);
        novo.proximo = topo;
        topo = novo;
        tamanho++;
    }

    public Integer desempilhar() {
        if (topo == null) return null;
        int valor = topo.valor;
        topo = topo.proximo;
        tamanho--;
        return valor;
    }

    public Integer obterNoTopo() {
        return (topo != null) ? topo.valor : null;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }
}
