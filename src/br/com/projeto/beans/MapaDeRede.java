package br.com.projeto.beans;

import java.util.ArrayList;

public class MapaDeRede {
    private ArrayList<Estacao> estacoes;
    private ArrayList<LinhaDeTrem> linhas;

    public MapaDeRede() {
        estacoes = new ArrayList<>();
        linhas = new ArrayList<>();
    }

    // Métodos para adicionar estações e linhas
    public void adicionarEstacao(Estacao estacao) {
        estacoes.add(estacao);
    }

    public void adicionarLinha(LinhaDeTrem linha) {
        linhas.add(linha);
    }

    // Getters
    public ArrayList<Estacao> getEstacoes() {
        return estacoes;
    }

    public ArrayList<LinhaDeTrem> getLinhas() {
        return linhas;
    }
}
