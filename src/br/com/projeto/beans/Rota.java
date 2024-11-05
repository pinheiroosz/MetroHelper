package br.com.projeto.beans;

public class Rota {
    private Estacao estacaoOrigem;
    private Estacao estacaoDestino;
    private int tempoEstimado; // em minutos
    private double distancia; // em km

    public Rota(Estacao estacaoOrigem, Estacao estacaoDestino, int tempoEstimado, double distancia) {
        this.estacaoOrigem = estacaoOrigem;
        this.estacaoDestino = estacaoDestino;
        this.tempoEstimado = tempoEstimado;
        this.distancia = distancia;
    }

    // Getters e Setters
    public Estacao getEstacaoOrigem() {
        return estacaoOrigem;
    }

    public Estacao getEstacaoDestino() {
        return estacaoDestino;
    }

    public int getTempoEstimado() {
        return tempoEstimado;
    }

    public double getDistancia() {
        return distancia;
    }
}

