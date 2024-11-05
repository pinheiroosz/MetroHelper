package br.com.projeto.beans;

public class Passageiro {
    private String nome;
    private int idade;
    private String estacaoDestino;
    private String estacaoOrigem;

    public Passageiro(String nome, int idade, String estacaoOrigem, String estacaoDestino) {
        this.nome = nome;
        this.idade = idade;
        this.estacaoOrigem = estacaoOrigem;
        this.estacaoDestino = estacaoDestino;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEstacaoOrigem() {
        return estacaoOrigem;
    }

    public String getEstacaoDestino() {
        return estacaoDestino;
    }
}
