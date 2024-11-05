package br.com.projeto.beans;

public class Trem {
    private String idTrem;
    private String statusAtual; // e.g., "em operação", "em manutenção"
    private Estacao estacaoAtual;

    public Trem(String idTrem, String statusAtual, Estacao estacaoAtual) {
        this.idTrem = idTrem;
        this.statusAtual = statusAtual;
        this.estacaoAtual = estacaoAtual;
    }

    // Getters e Setters
    public String getIdTrem() {
        return idTrem;
    }

    public String getStatusAtual() {
        return statusAtual;
    }

    public Estacao getEstacaoAtual() {
        return estacaoAtual;
    }
}


