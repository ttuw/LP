package br.cefetmg.rdc.lab20250617;

public class PilhaArray {
    private int[] dados;
    private int topo;

    public PilhaArray() {
        dados = new int[10];
        topo = 0;
    }

    private void expandir() {
        if (topo >= dados.length) {
            int[] novo = new int[dados.length * 2];
            for (int i = 0; i < dados.length; i++) {
                novo[i] = dados[i];
            }
            dados = novo;
        }
    }

    public void empilhar(int item) {
        expandir();
        dados[topo++] = item;
    }

    public Integer desempilhar() {
        if (topo == 0) return null;
        return dados[--topo];
    }

    public Integer obterNoTopo() {
        if (topo == 0) return null;
        return dados[topo - 1];
    }

    public boolean estaVazia() {
        return topo == 0;
    }

    public int tamanho() {
        return topo;
    }
}
